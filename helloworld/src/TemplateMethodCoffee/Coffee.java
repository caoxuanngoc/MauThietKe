/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethodCoffee;

/**
 *
 * @author DELL
 */
public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Pha ca phe");
    }

    @Override
    public void add() {
        System.out.println("Them duong va sua");
    }
    
}
