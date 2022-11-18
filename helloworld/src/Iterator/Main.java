/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iterator;



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
        Arrayaggregate arrays = new Arrayaggregate();
        //arrays.createIterator();
        
        MyIterator arrayIterator = arrays.createIterator();
        arrayIterator.first();
        //System.out.println(arrayIterator.first());
        while(!arrayIterator.isDone())
        {
            System.out.println(arrayIterator.next());
        }
    }
    
}
