/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yyyyyyyyyyyyyyyyyyyyyyyyy;

/**
 *
 * @author DELL
 */
public class ArrayIte implements MyInter {
    int i = 0;
    ArrayAgg arrayAgg;
    public ArrayIte(ArrayAgg arrayAgg) {
        this.arrayAgg = arrayAgg;
    }

    @Override
    public Object first() {
        return arrayAgg.getItem(i=0);
    }

    @Override
    public Object next() {
        if(!this.isDone())
        {
            return arrayAgg.getItem(++i);
        }
        return null;
    }

    @Override
    public Object currentItem() {
        return arrayAgg.getItem(i);
    }

    @Override
    public boolean isDone() {
        if(i < arrayAgg.Count()-1)  return false;
        return true;
    }
}
