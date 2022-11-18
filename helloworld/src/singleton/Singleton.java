/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;


public class Singleton {
    private static Singleton instance;
    int count = 0;
    private Singleton(){ }
    public static Singleton createInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
    public void increase(){
        System.out.println(++count);
    }
            
}
