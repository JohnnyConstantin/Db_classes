package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Device;
import com.example.gradebookbackend.models.Research;
import com.example.gradebookbackend.models.Researcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ResearchRepository extends JpaRepository<Research, Integer> {
    public List<Research> findAll();

    public void deleteResearcherByCodeWork(Integer code_of_work);

    public Research getResearcherByCodeWork(Integer code_of_work);

    @Query(value = "select * from research f where f.serial_number like %:keyword4%", nativeQuery = true)
    List<Research> findByKeyword(@Param("keyword4") String keyword4);
}
