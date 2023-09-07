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

public class CombinationController implements BMain{
    @FXML
    TextField ntext;
    @FXML
    TextField rtext;
    private Stage stage;
    private Scene scene;
    private Parent root;
    long n,k;
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
        n =Integer.parseInt(ntext.getText());
        k =Integer.parseInt(rtext.getText());
        long ll =combinations(n,k);
        namelab1.setText("Result is "+ll);
    }

    public long combinations(long n,long k) {
        long ans =1;
        long i;
        for( i =0;i<(n-k);i++){
            ans= (ans*(n-i))/(i+1);
        }
        return ans;
    }
}
