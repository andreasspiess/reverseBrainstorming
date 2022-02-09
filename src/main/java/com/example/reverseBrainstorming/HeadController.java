package com.example.reverseBrainstorming;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HeadController {

    private List<String> positivFormList = new ArrayList<>();
    private List<String> negativFormList = new ArrayList<>();

    @GetMapping("/")
    public String getStartPage(Model model) {
        model.addAttribute("saveProblem", new ProblemForm());
        return "stepOne";
    }

    @PostMapping("/")
    public String saveProblem(Model model, ProblemForm problemForm) {
        model.addAttribute("saveProblem", new ProblemForm());
        ProblemForm problem = problemForm;
        System.out.println(problem.toString());
        return "stepOne";
    }

    @GetMapping("stepTwo")
    public String getNegativIdeas (Model model) {
        model.addAttribute("saveNegativIdeas", negativFormList);
        //negativFormList.add();
        return "stepTwo";
    }

    @PostMapping("stepTwo")
    public String saveNegativIdeas (Model model) {
        model.addAttribute("saveNegativIdeas", negativFormList);
        //negativFormList.add()
        return "stepTwo";
    }

    @GetMapping("stepThree")
    public String getPositvIdeas(Model model) {
        model.addAttribute("savePositivIdeas", positivFormList);
        return "stepThree";
    }

    @PostMapping("stepThree")
    public String savePositivIdeas(Model model) {
        model.addAttribute("savePositivIdeas", positivFormList);
        return "stepThree";
    }

    @GetMapping("stepVour")
    public String output() {
        return "stepVour";
    }

    public List<String> getPositivFormList() {
        return positivFormList;
    }

    public void setPositivFormList(List<String> positivFormList) {
        this.positivFormList = positivFormList;
    }

    public List<String> getNegativFormList() {
        return negativFormList;
    }

    public void setNegativFormList(List<String> negativFormList) {
        this.negativFormList = negativFormList;
    }

    @Override
    public String toString() {
        return "HeadController{" +
                "positivFormList=" + positivFormList +
                ", negativFormList=" + negativFormList +
                '}';
    }
}