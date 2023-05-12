package AddQuestion;

import AddQuiz.AddQuizPageModel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddQuestionSteps {
    private AddQuestionPageModel addQuestionPageModel;

    @Given("Open screen for adding a question")
    public void addQuestionScreen() {
        addQuestionPageModel = new AddQuestionPageModel();
    }

    @When("We input a quiz name for question: {string}")
    public void addName(String name) {
        addQuestionPageModel.setQuizName(name);
    }

    @And("We input a question : {string}")
    public void addQuestion(String question) {
        addQuestionPageModel.setQuestionTitle(question);
    }

    @When("We input points : {int}")
    public void we_input_points(Integer int1) {
            addQuestionPageModel.setPoints(int1);
    }
    @When("We input timer : {int}")
    public void we_input_timer(Integer int1) {
        addQuestionPageModel.setTimer(int1);
    }

    @And("Press the button to add question")
    public void pressAddQuestionButton() {
        addQuestionPageModel.clickButton();
    }

    @Then("We get a message  : {string}")
    public void checkMessage(String arg) {
        Assert.assertEquals(arg, addQuestionPageModel.getMessage());
    }

    @And("We input points : <int>")
    public void weInputPointsInt(int points) {
    }
}
