package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type, Integer> {
    public List<Type> findAll();
}
