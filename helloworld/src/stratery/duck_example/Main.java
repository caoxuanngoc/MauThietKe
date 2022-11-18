/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stratery.duck_example;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck = new VitXiem();
        IFlyBehavior flyBehavior = new FlyWithWings();
        IQuackBehavior quackBehavior = new SQuack();
        duck.setFlyBehavior(flyBehavior);
        duck.setQuackBehavior(quackBehavior);
        duck.display();
    }
    
}
