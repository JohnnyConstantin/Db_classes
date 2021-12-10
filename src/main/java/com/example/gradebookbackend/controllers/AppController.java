package com.example.gradebookbackend.controllers;

import com.example.gradebookbackend.models.Sell;
import com.example.gradebookbackend.repositories.ProjectRepository;
import com.example.gradebookbackend.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class AppController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private ProjectRepository projectRepo;

    @RequestMapping("/")
    public String viewStudentHomePage(Map<String, Object> model) {

        Iterable<Sell> sells = projectRepo.findAll(); //markRepo.findAll();
        model.put("sells", sells);
        return "index";
    }

}
