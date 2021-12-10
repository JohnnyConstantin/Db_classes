package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Sell;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Sell, Integer> {

    public List<Sell> findAll();
}
