/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethodCoffee;

/**
 *
 * @author DELL
 */
public abstract class CaffeineBeverage {
   public void prepareRecipe(){
       System.out.println("Chuan bi");
   };
   public void boilWater(){
       System.out.println("Dun nuoc");
   };
   public void pourlnCup(){
        System.out.println("Do nuoc vao ly");
   };

   //template method
   public abstract void brew();
   public abstract void add();
   
   public void play(){
       prepareRecipe();
       boilWater();
       pourlnCup();
       brew();
       add();
   }
}
