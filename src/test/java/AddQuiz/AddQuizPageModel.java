package AddQuiz;

import org.example.controllers.QuizController;
import org.example.models.Quiz;

public class AddQuizPageModel {
    private String name;

    private String message;

    public void addName(final String name) {
        this.name = name;
    }

    public void clickButton() {
        QuizController quizController = new QuizController();
        message = quizController.addQuiz(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
