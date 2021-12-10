package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Researcher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResearcherRepository extends JpaRepository<Researcher, Integer> {
    public List<Researcher> findAll();
}
