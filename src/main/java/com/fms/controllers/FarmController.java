package com.fms.controllers;

import com.fms.models.Farm;
import com.fms.service.FarmService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Slf4j
@AllArgsConstructor
public class FarmController {

    private final FarmService farmService;

    @GetMapping("/farm/new")
    public String getFarmCreationForm(Model model) {

        model.addAttribute("farm", new Farm());

        log.debug("getting Farm creation form");

        return "farms/createFarm";
    }

    @PostMapping("/farm/new")
    public String processFarmCreationForm(@ModelAttribute("farm") Farm farm) {



        log.debug("getting Farm creation form");

        return "farms/createFarm";
    }
}
