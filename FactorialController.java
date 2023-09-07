package com.example.Mathematical_Operations;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FactorialController implements BMain{
    @FXML
    Label nameLabel;
    @FXML
    TextField textField;
    Stage stage;
    Scene scene;

    @Override
    public void BackToMain(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void calc(ActionEvent event) {

        try {
            int x = Integer.parseInt(textField.getText());
            long y = fact(x);
            // System.out.println("The factorial of your number is "+ fact(a));
            nameLabel.setText("The factorial of your number is " +y);


        }
        catch (Exception e){
            nameLabel.setText("Fill the text field or enter valid number");

        }
    }
    public static long fact (int a){
        if (a==1 || a==0)
            return 1;
        else
            return a * fact(a-1 );


    }


}

