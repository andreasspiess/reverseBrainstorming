package com.example.reverseBrainstorming;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HeadController {

    private List<String> negativFormList = new ArrayList<>();
    private List<String> positivFormList = new ArrayList<>();
    private static String problem;

    @GetMapping("/")
    public String getStartPage(Model model) {
        model.addAttribute("saveProblem", new ProblemForm());
        return "stepOne";
    }

    @PostMapping("/")
    public String saveProblem(Model model, ProblemForm problemForm) {
        model.addAttribute("saveProblem", new ProblemForm());
        problem = String.valueOf(problemForm);
        System.out.println(problem);
        return "stepOne";
    }

    @GetMapping("stepTwo")
    public String getNegativIdeas (Model model, NegativForm negativForm, ProblemForm problemForm) {
        model.addAttribute("saveNegativIdeas", new NegativForm());
        model.addAttribute("problem", problem.toString());
//      System.out.println(problemForm.getProblem());
//      System.out.println(negativForm.getNegativ());
        return "stepTwo";
    }

    @PostMapping("stepTwo")
    public String saveNegativIdeas (Model model, NegativForm negativForm) {
        model.addAttribute("saveNegativIdeas", new NegativForm());
        model.addAttribute("problem", problem.toString());
        //model.addAttribute("negativ", negativ);
        negativFormList.add(negativForm.getNegativ());
        System.out.println(negativForm.getNegativ());
        return "stepTwo";
    }

    @GetMapping("stepThree")
    public String getPositvIdeas(Model model) {
        model.addAttribute("savePositivIdeas");
        return "stepThree";
    }

    @PostMapping("stepThree")
    public String savePositivIdeas(Model model) {
        model.addAttribute("savePositivIdeas");
        return "stepThree";
    }
}