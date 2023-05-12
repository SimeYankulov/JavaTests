package AddQuestion;

import org.example.controllers.QuestionController;
import org.example.controllers.QuizController;
import org.example.models.Question;

public class AddQuestionPageModel {
    private String quizName;
    private String questionTitle;
    private int points;
    private int timer;
    private String message;

    public void clickButton() {
        QuestionController questionController = new QuestionController();
        message = questionController.addQuestion(quizName,questionTitle,points,timer);
    }
    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
