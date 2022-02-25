package com.example.reverseBrainstorming;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProblemForm {
    private String problem;
    private long id;

    @Override
    public String toString() {
        return "ProblemForm{" +
                "problem='" + problem + '\'' +
                ", id=" + id +
                '}';
    }
}
