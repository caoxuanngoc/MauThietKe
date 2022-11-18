/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BuilderPattern.Add;


public class Main {
    public static void main(String[] args){
        MyStringBuilder ms = new MyStringBuilder.Builder()
                .addString(" N ")
                .addFloat(2022F)
                .addBool(true)
                .build();
        System.out.println(ms.toString());
    }
}