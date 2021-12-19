package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Device;
import com.example.gradebookbackend.models.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type, Integer> {
    public List<Type> findAll();

    public void deleteTypeByCodeDevice(Integer code_type_of_device);

    public Type getTypeByCodeDevice(Integer code_type_of_device);

    @Query(value = "select * from type_of_device t where t.name_of_device like %:keyword5%", nativeQuery = true)
    List<Type> findByKeyword(@Param("keyword5") String keyword5);
}
