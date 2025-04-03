package aclcbukidnon.com.javafxactivity.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CounterController {


    @FXML
    protected Label labelCount;

    @FXML
    protected void onPlusClick() {
       var countext = labelCount.getText();
       var countValue = Integer.parseInt(countext);
       countValue++;
       labelCount.setText(countValue + "");
    }

    @FXML
    protected void  onMinusClick() {

    }

}
