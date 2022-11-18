/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yyyyyyyyyyyyyyyyyyyyyyyyy;

/**
 *
 * @author DELL
 */
public class ArrayAgg {
    int [] mang = {};

    public ArrayAgg(int[] mang) {
        this.mang = mang;
    }

    public int Count()
    {
        return mang.length;
    }
    public int getItem(int i)
    {
        return this.mang[i];
    }

    public MyInter createIter(){
        return new ArrayIte(this);
    }
}
