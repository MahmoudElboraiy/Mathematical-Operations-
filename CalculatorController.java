package com.example.Mathematical_Operations;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorController implements BMain {

    Stage stage;
    Scene scene;
    private double num1 = 0;
    @FXML
    private Label lblResult;
    private char operator = '+';

    @Override
    public void BackToMain(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void numberClicked(MouseEvent event){
        int value = Integer.parseInt(((Pane)event.getSource()).getId().replace("btn",""));
        double presv = Double.parseDouble(lblResult.getText());
        if(presv == 0){
            lblResult.setText(String.valueOf((double) value));
        }
        else{
            lblResult.setText(String.valueOf(Double.parseDouble(lblResult.getText())*10+value));
        }
    }
    public void SymbolClicked(MouseEvent event){
        String symbol = ((Pane)event.getSource()).getId().replace("btn","");
        if(symbol.equals("Equal")) {
            double num2 = Double.parseDouble(lblResult.getText());
           if(operator == '+'){
               lblResult.setText((num1+num2) + "");
           }
            else if(operator == '-'){
                lblResult.setText((num1-num2) + "");
            }
            else if(operator == '*'){
                lblResult.setText((num1*num2) + "");
            }
            else if(operator == '/'){
                lblResult.setText((num1/num2) + "");
            }
            operator = '.';
        }
        else if(symbol.equals("Clear")){
            lblResult.setText(String.valueOf(0.0));
            operator = '.';
        }
        else{
            if(symbol.equals("Plus")){
                operator = '+';
            }
            else if(symbol.equals("Subtraction")){
                operator = '-';
            }
            else if(symbol.equals("Multiple")){
                operator = '*';
            }
            else if(symbol.equals("Divide")){
                operator = '/';
            }
            num1 = Double.parseDouble(lblResult.getText());
            lblResult.setText(String.valueOf(0.0));
        }
    }

}
