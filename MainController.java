package com.example.Mathematical_Operations;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    Stage stage;
    Scene scene;
    public void switchToMatrix(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("matrix_menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCalculator(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToCombinatorics(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Combinatoricsmenu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEquation(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Equation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToGeometry(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Geometry.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
