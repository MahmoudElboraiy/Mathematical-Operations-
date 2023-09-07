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

public class _3DMatrixController implements BMain {
    Stage stage;
    Scene scene;
    @FXML
    private Label l00,l01,l02,l10,l11,l12,l20,l21,l22,deterlabel,warnlabel;
    @FXML
    private TextField f00,f01,f02,f10,f11,f12,f20,f21,f22;
    double[][] arr = new double[3][3];
    double[][] fliparr = new double[3][3];


    public void determinant(){
        try{
            empty();
            setValue();
            double deter;
            deter = (arr[0][0] * ((arr[1][1] * arr[2][2]) - (arr[1][2] * arr[2][1]) )) - (arr[0][1] * ((arr[1][0] * arr[2][2]) - (arr[1][2] * arr[2][0]) )) + (arr[0][2] * ((arr[1][0] * arr[2][1]) - (arr[1][1] * arr[2][0]) )) ;
            deterlabel.setText(""+deter);
        }
        catch (Exception e){
            warnlabel.setText("Please fill all fields");
        }
    }

    public void empty(){
        deterlabel.setText("");
        warnlabel.setText("");
        l00.setText("");
        l01.setText("");
        l02.setText("");
        l10.setText("");
        l11.setText("");
        l12.setText("");
        l20.setText("");
        l21.setText("");
        l22.setText("");
    }

    public void setValue(){
        arr[0][0] = Double.parseDouble(f00.getText());
        arr[0][1] = Double.parseDouble(f01.getText());
        arr[0][2] = Double.parseDouble(f02.getText());
        arr[1][0] = Double.parseDouble(f10.getText());
        arr[1][1] = Double.parseDouble(f11.getText());
        arr[1][2] = Double.parseDouble(f12.getText());
        arr[2][0] = Double.parseDouble(f20.getText());
        arr[2][1] = Double.parseDouble(f21.getText());
        arr[2][2] = Double.parseDouble(f22.getText());
    }

    public void flip(){
        try{
            empty();
            setValue();
            for(int i = 0;i<3;i++){
                for(int j = 0;j<3;j++){
                    fliparr[i][j] = arr[j][i];
                }
            }
            l00.setText(""+fliparr[0][0]);
            l01.setText(""+fliparr[0][1]);
            l02.setText(""+fliparr[0][2]);
            l10.setText(""+fliparr[1][0]);
            l11.setText(""+fliparr[1][1]);
            l12.setText(""+fliparr[1][2]);
            l20.setText(""+fliparr[2][0]);
            l21.setText(""+fliparr[2][1]);
            l22.setText(""+fliparr[2][2]);

        }
        catch (Exception e){
            warnlabel.setText("Please fill all fields");
        }

    }
    @Override
    public void BackToMain(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}