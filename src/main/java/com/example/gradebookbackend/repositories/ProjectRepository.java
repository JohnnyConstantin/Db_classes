package com.example.gradebookbackend.repositories;

import com.example.gradebookbackend.models.Device;
import com.example.gradebookbackend.models.Sell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Sell, Integer> {

    public List<Sell> findAll();

    public void deleteSellByNumOrder(Integer number_of_order);

    public Sell getSellByNumOrder(Integer numbOrder);

    @Query(value = "select * from sell s where s.client like %:keyword3%", nativeQuery = true)
    List<Sell> findByKeyword(@Param("keyword3") String keyword3);
}
