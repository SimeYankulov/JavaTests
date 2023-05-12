package org.example.controllers;

import org.apache.commons.lang3.StringUtils;
import org.example.DB;
import org.example.models.Quiz;

import java.util.Set;

public class QuizController {

    public String addQuiz(String name) {

        if (StringUtils.isBlank(name)) {
            return "Quiz name cannot be blank";
        }
        if (name.length() < 5 || name.length() > 20) {
            return "Invalid quiz name";
        }
        if (!StringUtils.isAlphanumeric(name)) {
            return "Quiz name cannot contain characters";
        }



        Set<Quiz> quizzesDB = new DB().getQuizzes();

        boolean isQuizNameUnAvailable = quizzesDB.
                stream().anyMatch(u -> u.getName().equals(name));
        if (isQuizNameUnAvailable) {
            return "Quiz name already exists";
        }

        Quiz quiz = new Quiz();
        quiz.setName(name);

        return quizzesDB.add(quiz) ? "Successfully added a new quiz" :
                "Error";
    }
}
