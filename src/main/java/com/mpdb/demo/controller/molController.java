package com.mpdb.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class molController {

    @GetMapping("/mol3Dview/{name}")
        public String molview(@PathVariable(value = "name") String name , Model model){
        String molname  = name;
        String  url  = "http://chemapps.stolaf.edu/jmol/jmol.php?model="+molname+"&inline";
        model.addAttribute("value",url);
        model.addAttribute("molname",name);
        return "mol";
        //return "working";
    }
    }
