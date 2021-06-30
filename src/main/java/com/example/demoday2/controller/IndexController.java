package com.example.demoday2.controller;


import com.example.demoday2.model.Institute;
import com.example.demoday2.service.InstitueServiceImpl;
import com.example.demoday2.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

//    @Autowired (injecting the bean that is stored in ioc)
    private InstituteService instituteService;
    IndexController(InstituteService instituteService){
        //constructor injection
        this.instituteService=instituteService;
    }
//    public void setInstituteService(InstituteService instituteService){
//        this.instituteService=instituteService;
//    }
    //HTTP Methods
    // GET-> used for getting values,returning the views(html)
    // POST-> save something to database
    //PUT-> update something
    //DELETE-> delete something

//    @RequestMapping(value="/index",method = RequestMethod.GET)
    //DI and IOC
    //Dependency Injection and Inversion of control


    @GetMapping("/institute-list")
    public List<Institute> index(){
        return instituteService.instituteList();
    }

}
