package com.shadow.patent.controllers;

import com.shadow.patent.services.IPatentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PatentController {
    @Autowired
    private IPatentService patentService;

    @GetMapping("/savepatent")
    public String savePatent(){
        return null;
    }
}
