package com.example.reverseBrainstorming;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HeadController {

    private List<String> stepOne = new ArrayList<>();
    private List<String> stepTwo = new ArrayList<>();


    @GetMapping("eingabe")
    public String getStartPage(Model model) {
        model.addAttribute("eingabe");
        return "stepOne";
    }
}