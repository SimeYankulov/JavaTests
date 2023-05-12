package org.example.models;

import java.util.HashSet;
import java.util.Set;

public class Quiz {
    private String name;
    private Set<Question> questions;
    public Quiz() {
        questions = new HashSet<Question>();
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
