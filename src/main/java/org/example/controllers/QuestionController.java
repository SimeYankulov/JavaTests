package org.example.controllers;

import org.apache.commons.lang3.StringUtils;
import org.example.DB;
import org.example.models.Question;
import org.example.models.Quiz;

import java.util.Set;

public class QuestionController {

    public String addQuestion(String quizName,
                              String questionTitle,
                              int points,
                              int timer) {

        if (points < 1 || points > 10) {
            return "Invalid points";
        }

        if (timer < 15 || timer > 60) {
            return "Timer invalid";
        }

        if (StringUtils.isBlank(quizName) ||
                quizName.length() < 5 ||
                quizName.length() > 20 ||
                !StringUtils.isAlphanumeric(quizName)) {
            return "Name of a quiz must be valid";
        }
        Set<Quiz> quizzesDB = new DB().getQuizzes();

        Quiz quiz = quizzesDB.stream().filter
                (u -> u.getName().equals(quizName)).findFirst().orElse(null);
        if (quiz == null) {
            return "Name of a quiz must be valid";
        }

        if (StringUtils.isBlank(questionTitle) ||
                questionTitle.length() < 10 ||
                questionTitle.length() > 40 ||
                !StringUtils.isAlphanumeric(questionTitle.replaceAll("\\s", ""))
        ) {
            return "Invalid question";
        }

        Set<Question> questions = quiz.getQuestions();

        boolean questionExist = (boolean) questions.stream().
                anyMatch(u -> u.getQuestionTitle().equals(questionTitle));
        if (questionExist) {
            return "Question already added";
        }


        Question question = new Question();
        question.setQuiz(quiz);
        question.setQuestionTitle(questionTitle);
        question.setTimer(timer);
        question.setPoints(points);

        if (questions.add(question)) {
            quiz.setQuestions(questions);
            return "Question added to quiz";
        } else
            return "Error";

    }
}
