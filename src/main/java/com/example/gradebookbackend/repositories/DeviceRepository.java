package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Device;
import com.example.gradebookbackend.models.Researcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, Integer> {

    public List<Device> findAll();

    public void deleteDeviceByCodeDevice(Integer code_type_of_device);

    public Device getDeviceByCodeDevice(Integer code_type_of_device);

    @Query(value = "select * from device d where d.vendor like %:keyword2% or d.cpu like %:keyword2% or d.serial_number like %:keyword2% or d.country like %:keyword2%", nativeQuery = true)
    List<Device> findByKeyword(@Param("keyword2") String keyword2);
}