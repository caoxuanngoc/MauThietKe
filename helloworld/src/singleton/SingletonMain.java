/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author DELL
 */
public class SingletonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton s1 = Singleton.createInstance();
        Singleton s2 = Singleton.createInstance();
        s1.increase();
        s1.increase();
        s2.increase();
    }
    
}
