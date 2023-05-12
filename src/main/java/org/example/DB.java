package org.example;

import org.example.models.Question;
import org.example.models.Quiz;

import java.util.HashSet;
import java.util.Set;

public class DB {
    private Set<Quiz> quizzes = new HashSet<>();
    private Set<Question> questions = new HashSet<>();

    public DB() {
        Quiz quiz = new Quiz();
        quiz.setName("Geography");

        Question question = new Question();
        question.setQuiz(quiz);
        question.setQuestionTitle("How many continents are theree");
        question.setPoints(5);
        question.setTimer(5);

        Set<Question> questions1 = quiz.getQuestions();
        questions1.add(question);
        quiz.setQuestions(questions1);
        quizzes.add(quiz);
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public Set<Quiz> getQuizzes() {
        return quizzes;
    }
}
