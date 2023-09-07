package com.example.Mathematical_Operations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class _2DMatrixController implements BMain {
    @FXML
    private Button Determinant;
    @FXML
    private Button Filp;
    @FXML
    private TextField R1;
    @FXML
    private Label C1;
    @FXML
    private Label C2;
    @FXML
    private Label C3;
    @FXML
    private Label C4;
    @FXML
    private TextField R2;
    @FXML
    private TextField R3;
    @FXML
    private TextField R4;
    public Label nameLabel;
    public double det;
    @FXML
    Stage stage;

    Scene scene;
    @FXML
    private Label statas;



    @Override
    public void BackToMain(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void const_inlizetion() {
        nameLabel.setText("");

    }

    public void inlizetion() {
        statas.setText("");
        C1.setText("");
        C2.setText("");
        C3.setText("");
        C4.setText("");

    }

    public void determinant(ActionEvent event) {
        try {
            const_inlizetion();
            det = (Double.parseDouble(R1.getText()) * Double.parseDouble(R4.getText()))
                    - (Double.parseDouble(R2.getText()) * Double.parseDouble(R3.getText()));

            nameLabel.setText("" + det);

        }

        catch (Exception e) {
            nameLabel.setText("ERROR");
        }
    }

    @FXML

    void filp(ActionEvent event) {

        try {
            inlizetion();
            C1.setText(R1.getText());
            C2.setText(R3.getText());
            C3.setText(R2.getText());
            C4.setText(R4.getText());

            if (C1.getText() != "" && C2.getText() != "" && C3.getText() != "" && C4.getText() != "") {

                statas.setText("MatrixRound");
            } else {
                inlizetion();
                statas.setText("ERROR");
            }

        } catch (Exception e) {

            statas.setText("ERROR");
        }

    }

}