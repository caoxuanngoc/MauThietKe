/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethodCoffee;

/**
 *
 * @author DELL
 */
public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Pha tra");
    }

    @Override
    public void add() {
        System.out.println("Them chanh");
    }
    
}
