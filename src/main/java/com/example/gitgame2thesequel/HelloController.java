package com.example.gitgame2thesequel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private ImageView image;
    @FXML
    private Label questionText;
    @FXML
    private Label correctLabel;
    @FXML
    private Label wrongLabel;
    @FXML
    private Label percentageLabel;


    @FXML
    private Button startButton;
    @FXML
    private Button buttonA = new Button();
    @FXML
    private Button buttonB = new Button();
    @FXML
    private Button buttonC = new Button();
    @FXML
    private Button buttonD = new Button();
    @FXML
    private Button submitButton = new Button();

    private int tracker = 1;
    private int correct = 0;
    private int wrong = 0;
    @FXML
    protected void onHelloButtonClick() {
        questionText.setText("Welcome to JavaFX Application!");
    }

    public void setQuestion(int counter){
        String define = VocabTerm.getWordDefinitionsBlank(counter);
        questionText.setText(define);
    }
    public void setAnswers(int counter){
        int count = (int) (Math.random() * 24);
        String answer1 = VocabTerm.getMultipleChoiceOptions(count);
        buttonA.setText(answer1);
        int count2 = (int) (Math.random() * 24);
        while(count2 == count){
            count2 = (int) (Math.random() * 24);
        }
        String answer2 = VocabTerm.getMultipleChoiceOptions(count2);
        buttonB.setText(answer2);
        int count3 = (int) (Math.random() * 24);
        while(count3 == count2 || count3 == count){
            count3 = (int) (Math.random() * 24);
        }
        String answer3 = VocabTerm.getMultipleChoiceOptions(count3);
        buttonC.setText(answer3);
        String answer = VocabTerm.getWord(counter);
        buttonD.setText(answer);
    }
    public  void resetColors(){
        buttonA.setStyle("-fx-background-color: #d3d3d3; -fc-text-fill: black; -fx-font-size: 16px;");
        buttonB.setStyle("-fx-background-color: #d3d3d3; -fc-text-fill: black; -fx-font-size: 16px;");
        buttonC.setStyle("-fx-background-color: #d3d3d3; -fc-text-fill: black; -fx-font-size: 16px;");
        buttonD.setStyle("-fx-background-color: #d3d3d3; -fc-text-fill: black; -fx-font-size: 16px;");
    }
    public void buttonClicked(ActionEvent itemClicked){
        Button buttonClicked = (Button) itemClicked.getSource();

        if(tracker <= 24){
            if(!buttonClicked.equals(submitButton)){
                resetColors();
                buttonClicked.setStyle("-fx-background-color: #ffcccb; -fx-text-fill: black; -fx-font-size: 16px;");
            }
            else{

                boolean answerButton = buttonD.getStyle().contains("-fx-background-color: #ffcccb");
                if(answerButton){
                    correct++;
                }
                else{
                    wrong++;
                }
                correctLabel.setText("Correct: " + correct);
                wrongLabel.setText("Wrong: " + wrong);
                double percentage = ((double)correct/(double)tracker) * 100;
                if(percentage >= 90){
                    percentageLabel.setStyle("-fx-text-fill: green");
                }
                else if(percentage>=80){
                    percentageLabel.setStyle("-fx-text-fill: blue");
                }
                else if(percentage>=70){
                    percentageLabel.setStyle("-fx-text-fill: orange");
                }
                else{
                    percentageLabel.setStyle("-fx-text-fill: red");
                }
                percentageLabel.setText("Percentage: " + percentage);
                tracker++;
                setQuestion(tracker);
                setAnswers(tracker);


            }
        }
        else{
           questionText.setText("Thank you for playing!");
        }

    }

    public void initialize(){

    }
}