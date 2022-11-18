/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author DELL
 */
public class Arrayaggregate {
    int[] mang = {1,2,3,4};
    
    public int getItem(int i){
        return mang[i];
    }
    public int count(){
        return mang.length;
    }
    public MyIterator createIterator(){
        return new ArrayIterator(this);
    } //khoi tao iterator tu chinh tap hop
}
