package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Researcher;
import com.example.gradebookbackend.models.Sell;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResearcherRepository extends JpaRepository<Researcher, Integer> {
    public List<Researcher> findAll();

    public void deleteResearcherByNumResearcher(Integer numb_of_researcher);

    public Researcher getResearcherByNumResearcher(Integer numb_of_researcher);
}
