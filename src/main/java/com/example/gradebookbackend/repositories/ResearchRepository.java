package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Research;
import com.example.gradebookbackend.models.Researcher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResearchRepository extends JpaRepository<Research, Integer> {
    public List<Research> findAll();

    public void deleteResearcherByCodeWork(Integer code_of_work);

    public Research getResearcherByCodeWork(Integer code_of_work);
}
