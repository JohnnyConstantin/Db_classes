package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Research;
import com.example.gradebookbackend.models.Researcher;
import com.example.gradebookbackend.models.Sell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ResearcherRepository extends JpaRepository<Researcher, Integer> {
    public List<Researcher> findAll();

    public void deleteResearcherByNumResearcher(Integer numb_of_researcher);
    @Query(value = "select * from researcher r where r.name like %:keyword% or r.surname like %:keyword%", nativeQuery = true)
    List<Researcher> findByKeyword(@Param("keyword") String keyword);
    public Researcher getResearcherByNumResearcher(Integer numb_of_researcher);
}
