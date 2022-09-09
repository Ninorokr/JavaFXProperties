package com.silverlink.javafxproperties;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    final OurProperty ourPro = new OurProperty();

    @FXML
    private Label mylabel;

    @FXML
    private Button myButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ourPro.setProperty(0);
        ourPro.propertyProperty().addListener(new ChangeListener<Object>(){

            @Override
            public void changed(ObservableValue<?> observableValue, Object oldValue, Object newValue) {
                mylabel.setText(new Double(ourPro.getProperty()).toString());
            }
        });
    }

    public void ButtonClick(){
        ourPro.setProperty(ourPro.getProperty() + 1);
    }
}
