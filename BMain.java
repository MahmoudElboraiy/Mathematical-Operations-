package com.example.Mathematical_Operations;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public interface BMain {

    Stage stage = null;
    Scene scene = null;

    public default void BackToMain(ActionEvent event)throws IOException {}
}
