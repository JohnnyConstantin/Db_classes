package com.example.gradebookbackend.controllers;

import com.example.gradebookbackend.models.*;
import com.example.gradebookbackend.repositories.*;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Map;

@Controller
@Transactional
public class AppController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private ProjectRepository projectRepo;
    @Autowired
    private ResearcherRepository researcherRepository;
    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private ResearchRepository researchRepository;
    @Autowired
    private TypeRepository typeRepository;

    @RequestMapping("/")
    public String viewStudentHomePage(Map<String, Object> model, String keyword) {

        if (keyword != null) {
            model.put("researcher", researcherRepository.findByKeyword(keyword));
        } else {
            Iterable<Sell> sells = projectRepo.findAll(); //markRepo.findAll();
            Iterable<Researcher> researchers = researcherRepository.findAll();
            Iterable<Device> devices = deviceRepository.findAll();
            Iterable<Research> researches = researchRepository.findAll();
            Iterable<Type> types = typeRepository.findAll();
            model.put("sells", sells);
            model.put("researcher", researchers);
            model.put("device", devices);
            model.put("research", researches);
            model.put("type", types);
        }

        return "index";
    }

    @GetMapping("/showNewSellForm")
    public String showNewSellForm(Model model) {
        // create model attribute to bind form data
        Sell sell = new Sell();
        model.addAttribute("sell", sell);
        return "new_sell";
    }

    @RequestMapping(value = "/saveSell", method = RequestMethod.POST)
    public String saveSell(@ModelAttribute("sell") Sell sell) {
        // save customers to database
        projectRepo.save(sell);
        return "redirect:/";
    }

    @GetMapping("/deleteSell/{numOrder}")
    public String deleteSell(@PathVariable(value = "numOrder") Integer number_of_order) {

        // call delete employee method
        this.projectRepo.deleteSellByNumOrder(number_of_order);
        return "redirect:/";
    }

    @GetMapping(value = "/showSellForUpdate/{numbOrder}")
    public String showSellForUpdate(@PathVariable(value = "numbOrder") Integer numbOrder, Model model) {

        // get employee from the service
        Sell sell = projectRepo.getSellByNumOrder(numbOrder);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("sell", sell);
        return "update_sell";
    }





    @GetMapping("/showNewResearcherForm")
    public String showNewResearcherForm(Model model) {
        // create model attribute to bind form data
        Researcher researcher = new Researcher();
        model.addAttribute("researcher", researcher);
        return "new_researcher";
    }

    @RequestMapping(value = "/saveResearcher", method = RequestMethod.POST)
    public String saveResearcher(@ModelAttribute("researcher") Researcher researcher) {
        // save customers to database
        researcherRepository.save(researcher);
        return "redirect:/";
    }

    @GetMapping("/deleteResearcher/{numbResearcher}")
    public String deleteResearcher(@PathVariable(value = "numbResearcher") Integer numb_of_researcher) {

        // call delete employee method
        this.researcherRepository.deleteResearcherByNumResearcher(numb_of_researcher);
        return "redirect:/";
    }

    @GetMapping(value = "/showResearcherForUpdate/{numbResearcher}")
    public String showResearcherForUpdate(@PathVariable(value = "numbResearcher") Integer numb_of_researcher, Model model) {

        // get employee from the service
        Researcher researcher = researcherRepository.getResearcherByNumResearcher(numb_of_researcher);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("researcher", researcher);
        return "update_researcher";
    }



    @GetMapping("/showNewTypeForm")
    public String showNewTypeForm(Model model) {
        // create model attribute to bind form data
        Type type= new Type();
        model.addAttribute("type", type);
        return "new_type";
    }

    @RequestMapping(value = "/saveType", method = RequestMethod.POST)
    public String saveType(@ModelAttribute("type") Type type) {
        // save customers to database
        typeRepository.save(type);
        return "redirect:/";
    }

    @GetMapping("/deleteType/{codeDevice}")
    public String deleteType(@PathVariable(value = "codeDevice") Integer code_type_of_device) {

        // call delete employee method
        this.typeRepository.deleteTypeByCodeDevice(code_type_of_device);
        return "redirect:/";
    }

    @GetMapping(value = "/showTypeForUpdate/{codeDevice}")
    public String showTypeForUpdate(@PathVariable(value = "codeDevice") Integer code_type_of_device, Model model) {

        // get employee from the service
        Type type = typeRepository.getTypeByCodeDevice(code_type_of_device);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("type", type);
        return "update_type";
    }


    @GetMapping("/showNewDeviceForm")
    public String showNewDeviceForm(Model model) {
        // create model attribute to bind form data
        Device device = new Device();
        model.addAttribute("device", device);
        return "new_device";
    }

    @RequestMapping(value = "/saveDevice", method = RequestMethod.POST)
    public String saveDevice(@ModelAttribute("device") Device device) {
        // save customers to database
        deviceRepository.save(device);
        return "redirect:/";
    }

    @GetMapping("/deleteDevice/{codeDevice}")
    public String deleteDevice(@PathVariable(value = "codeDevice") Integer code_type_of_device) {

        // call delete employee method
        this.deviceRepository.deleteDeviceByCodeDevice(code_type_of_device);
        return "redirect:/";
    }

    @GetMapping(value = "/showDeviceForUpdate/{codeDevice}")
    public String showDeviceForUpdate(@PathVariable(value = "codeDevice") Integer code_type_of_device, Model model) {

        // get employee from the service
        Device device = deviceRepository.getDeviceByCodeDevice(code_type_of_device);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("device", device);
        return "update_device";
    }


    @GetMapping("/showNewResearchForm")
    public String showNewResearchForm(Model model) {
        // create model attribute to bind form data
        Research research = new Research();
        model.addAttribute("research", research);
        return "new_research";
    }

    @RequestMapping(value = "/saveResearch", method = RequestMethod.POST)
    public String saveResearch(@ModelAttribute("research") Research research) {
        // save customers to database
        researchRepository.save(research);
        return "redirect:/";
    }

    @GetMapping("/deleteResearch/{codeWork}")
    public String deleteResearch(@PathVariable(value = "codeWork") Integer code_of_work) {

        // call delete employee method
        this.researchRepository.deleteResearcherByCodeWork(code_of_work);
        return "redirect:/";
    }

    @GetMapping(value = "/showResearchForUpdate/{codeWork}")
    public String showResearchForUpdate(@PathVariable(value = "codeWork") Integer code_of_work, Model model) {

        // get employee from the service
        Research research = researchRepository.getResearcherByCodeWork(code_of_work);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("research", research);
        return "update_research";
    }
}
