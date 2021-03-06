package com.example.reverseBrainstorming;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HeadController {

    private static List<NegativForm> negativFormList = new ArrayList<>();
    private static List<PositivForm> positivFormList = new ArrayList<>();
    private static String problem;
    //private static List<String> outputList = new ArrayList<>();

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
        return "stepTwo";
    }

    @PostMapping("stepTwo")
    public String saveNegativIdeas (Model model, NegativForm negativForm) {
        model.addAttribute("saveNegativIdeas", new NegativForm());
        model.addAttribute("problem", problem.toString());
        negativFormList.add(negativForm);
        System.out.println(negativFormList);
        return "stepTwo";
    }

    @GetMapping("stepThree")
    public String getPositvIdeas(Model model, PositivForm positivForm) {
        model.addAttribute("saveNegativIdeas", new NegativForm());
        model.addAttribute("savePositivIdeas", new PositivForm());
        model.addAttribute("negativFormList", negativFormList);
        return "stepThree";
    }

    @PostMapping("stepThree")
    public String savePositivIdeas(Model model, PositivForm positivForm, NegativForm negativForm) {
        model.addAttribute("savePositivIdeas", new PositivForm());
        model.addAttribute("negativFormList", negativFormList);

        positivFormList.add(positivForm);
        model.addAttribute("PositivFormList", positivFormList);
        System.out.println(negativFormList + "," + positivFormList);
        return "stepThree";
    }

    @GetMapping("stepFour")
    public String output (Model model, PositivForm positivForm, NegativForm negativForm) {
        model.addAttribute("negativFormList", negativFormList);
        model.addAttribute("positivFormList", positivFormList);
        model.addAttribute("savePositivIdeas", new PositivForm());

        return"stepFour";
    }
}