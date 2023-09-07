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

public class EquationController implements BMain{
    @FXML
    private Label x1;
    @FXML
    private Label x2;
    @FXML
    private Button calcbutton;
    @FXML
    private TextField ax2,bx,c;
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

    public void doCalc(ActionEvent event) {
        int rax2 = Integer.parseInt(ax2.getText());
        int rbx = Integer.parseInt(bx.getText());
        int rc = Integer.parseInt(c.getText());

        ax2.setText(ax2.getText());
        bx.setText(bx.getText());
        c.setText(c.getText());


        double d = rbx * rbx - 4.0 * rax2 * rc;
        if (d > 0.0) {
            double r1 = (-rbx + Math.pow(d, 0.5)) / (2.0 * rax2);
            double r2 = (-rbx - Math.pow(d, 0.5)) / (2.0 * rax2);
            x1.setText("The 1st root : "+String.valueOf(r1));
            x2.setText("The 2st root : "+String.valueOf(r2));
        } else if (rax2==0&&rbx==0&&rc==0) {
            x1.setText("MATH ERROR");

        } else if (d == 0.0 && rax2!=0 ) {
            double r1 = -rbx / (2.0 * rax2);
            x1.setText("The ONLY root : "+String.valueOf(r1));
        } else {
            x1.setText("Roots are not real.");
        }


    }}