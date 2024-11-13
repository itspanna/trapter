/*
* File: PrimaryController.java
* Author: Panna Teleki
* Copyright: 2024, Panna Teleki
* Group: II-1-N
* Date: 2024-11-13
* Github: https://github.com/itspanna
* Licenc: GNU GPL
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    
        @FXML
        private TextField AField;
    
        @FXML
        private TextField BField;
    
        @FXML
        private TextField CField;
    
        @FXML
        private TextField DField;

        @FXML
        private TextField ResultField;
    

        @FXML
        void onClickCalcButton(ActionEvent event) {
            calculateArea();
        }

        @FXML
        private void calculateArea() {
            try {
                double a = Double.parseDouble(AField.getText());
                double b = Double.parseDouble(BField.getText());
                double c = Double.parseDouble(CField.getText());
                double d = Double.parseDouble(DField.getText());

                double area = calculateArea(a,b,c,d);
                ResultField.setText(String.format("%.6f", area));
            } catch (NumberFormatException ex) {
                ResultField.setText("Invalid input");
            }
        
        }
    
    private double calculateArea(double a, double b, double c, double d) {
        double numerator = (a+c) / 4.0;
        double insideSqrt = (a + b - c + d) * (a - b - c + d) * (a + b - c - d) * (-a + b + c + d);
        return numerator * Math.sqrt(insideSqrt) / (a - c);

    }
}
