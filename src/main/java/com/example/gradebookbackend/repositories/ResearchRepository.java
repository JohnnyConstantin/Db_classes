package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Research;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResearchRepository extends JpaRepository<Research, Integer> {
    public List<Research> findAll();
}
