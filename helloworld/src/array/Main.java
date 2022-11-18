/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yyyyyyyyyyyyyyyyyyyyyyyyy;

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
        ArrayAgg a = new ArrayAgg(new int[]{1,2,3,4,5});
        MyInter in = a.createIter();
        in.first();
        System.out.println(in.next());
        while(!in.isDone())
        {
           System.out.println(in.currentItem());
           in.next();
        }
    }
    
}
