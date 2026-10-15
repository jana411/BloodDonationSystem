/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biooddonationsystem;

/**
 *
 * @author janaj
 */
import javax.swing.JOptionPane;
public class Donor {
    public static void main(String[]args){
        checkAge();
        checkWeight();
    }
    public static void checkAge(){
        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter your age;")
        );
        if (age>= 18 && age <= 65){
            JOptionPane.showInputDialog(null,"valid Age");
        } else {
          JOptionPane.showMessageDialog(null,"Invalid Age");
        }
        }
    public static void checkWeight(){
        double weight = Double.parseDouble(
                JOptionPane.showInputDialog("Enter your weight:")
        );
        if (weight>= 50){
            JOptionPane.showMessageDialog(null,"valid weight");
        } else{
          JOptionPane.showMessageDialog(null,"Invalid weight");
        }
        
    }
}
