package AddQuiz;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddQuizSteps {
    private  AddQuizPageModel addQuizPageModel;

    @Given("^Open screen for adding a Quiz$")
    public void addQuizScreen() {
        addQuizPageModel = new AddQuizPageModel();
    }

    @When("We input a quiz name: {string}")
    public void addName(String arg) {
        addQuizPageModel.setName(arg);
    }

    @And("Press the button to add")
    public void clickAddButton() {
        addQuizPageModel.clickButton();
    }
    @Then("We get a message : {string}")
    public void checkMessage(String arg) {
        Assert.assertEquals(arg,addQuizPageModel.getMessage());
    }
}
