package com.example.reverseBrainstorming;

public class ProblemForm {
    private String problem;

    @Override
    public String toString() {
        return problem;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}
