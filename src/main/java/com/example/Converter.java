package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Converter {

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double kilometersToMiles(double km) {
        return km * 0.621371;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Converter::drawGUI);
    }

    private static void drawGUI() {
        JFrame frame = new JFrame("Unit Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(4, 1));

        // Panel for Celsius to Fahrenheit
        JPanel tempPanel = new JPanel();
        JTextField celsiusInput = new JTextField(5);
        JLabel fahrenheitResult = new JLabel("Fahrenheit: ");
        JButton convertTemp = new JButton("Convert °C ➜ °F");
        convertTemp.addActionListener((ActionEvent e) -> {
            try {
                double celsius = Double.parseDouble(celsiusInput.getText());
                double fahrenheit = celsiusToFahrenheit(celsius);
                fahrenheitResult.setText("Fahrenheit: " + fahrenheit);
            } catch (NumberFormatException ex) {
                fahrenheitResult.setText("Invalid number");
            }
        });
        tempPanel.add(new JLabel("Celsius:"));
        tempPanel.add(celsiusInput);
        tempPanel.add(convertTemp);
        tempPanel.add(fahrenheitResult);

        // Panel for Km to Miles
        JPanel distPanel = new JPanel();
        JTextField kmInput = new JTextField(5);
        JLabel milesResult = new JLabel("Miles: ");
        JButton convertDist = new JButton("Convert km ➜ mi");
        convertDist.addActionListener((ActionEvent e) -> {
            try {
                double km = Double.parseDouble(kmInput.getText());
                double miles = kilometersToMiles(km);
                milesResult.setText("Miles: " + miles);
            } catch (NumberFormatException ex) {
                milesResult.setText("Invalid number");
            }
        });
        distPanel.add(new JLabel("Kilometers:"));
        distPanel.add(kmInput);
        distPanel.add(convertDist);
        distPanel.add(milesResult);

        frame.add(tempPanel);
        frame.add(distPanel);
        frame.setVisible(true);
    }
}
