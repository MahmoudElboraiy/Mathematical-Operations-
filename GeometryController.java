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

public class GeometryController implements BMain {
    @FXML
    TextField x1text;
    @FXML
    TextField y1text;
    @FXML
    TextField x2text;
    @FXML
    TextField y2text;
    @FXML
    TextField x3text;
    @FXML
    TextField y3text;
    @FXML
    TextField x4text;
    @FXML
    TextField y4text;
    private Stage stage;
    private Scene scene;
    private Parent root;
    int x1,y1,x2,y2,x3,y3,x4,y4;
    double x,y;
    String ss;
    @FXML
    Label namelab1;

    @Override
    public void BackToMain(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void calc(ActionEvent event) throws IOException {
        x1 =Integer.parseInt(x1text.getText());
        y1 =Integer.parseInt(y1text.getText());
        x2 =Integer.parseInt(x2text.getText());
        y2 =Integer.parseInt(y2text.getText());
        x3 =Integer.parseInt(x3text.getText());
        y3 =Integer.parseInt(y3text.getText());
        x4 =Integer.parseInt(x4text.getText());
        y4 =Integer.parseInt(y4text.getText());
        String l =lines(x1,y1,x2,y2,x3,y3,x4,y4);
        if(l=="POINT"){
            namelab1.setText("POINT X = "+x+"   Y = "+y);
        }else namelab1.setText(l);
    }

    public String lines(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4) {
        int a1=y2-y1;
        int b1=x1-x2;
        int c1=(a1*x1) +(b1*y1);
        int a2 =y4-y3;
        int b2 =x3-x4;
        int c2 =(a2*x3)+(b2*y3);
        int d =(a1*b2)-(a2*b1);
        int dx=(c1*b2)-(c2*b1);
        int dy =(a1*c2)-(a2*c1);
        if(d==0&&(dx!=0||dy!=0))
            ss="NONE";
        else if(d!=0){
            ss ="POINT";
            x =(double) dx/d;
            y=dy/(double)d;
        }
        else {
            ss ="LINE";
        }
        return ss;
    }
}