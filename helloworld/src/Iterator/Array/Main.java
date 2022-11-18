/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Iterator.Array;

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
        
        ArrayIterator arrayIterator = new ArrayIterator();
        arrayIterator.addItem(4);
        arrayIterator.addItem(5);
        arrayIterator.addItem(10);
        arrayIterator.addItem(12);
        arrayIterator.addItem(15);

        MyIterator myIterator =(MyIterator) arrayIterator.createIterator();

        myIterator.getItem(4);
        myIterator.getItem(5);
        myIterator.count();
    }
    
}
