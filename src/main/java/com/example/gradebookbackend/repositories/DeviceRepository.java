package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, Integer> {

    public List<Device> findAll();
//
//    public void deleteDeviceBycodetype(Integer code_type_of_device);
//
//    public Device getDeviceBycodetype(Integer code_type_of_device);
}