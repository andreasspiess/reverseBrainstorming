package com.example.reverseBrainstorming;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HeadController {

    private List<String> positivList = new ArrayList<>();
    private List<String> negativList = new ArrayList<>();

    @GetMapping("/")
    public String getStartPage(Model model) {
        model.addAttribute("eingabe");
        // negativ.add()
        return "stepOne";
    }

    @PostMapping("/")
    public String saveProblem(Model model) {

        return "stepOne";
    }

}