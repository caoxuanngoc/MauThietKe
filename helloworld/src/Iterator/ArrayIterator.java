/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author DELL
 */
public class ArrayIterator implements MyIterator{
    
    Arrayaggregate arrayaggregate;
    int index=0;

    public ArrayIterator(Arrayaggregate arrayaggregate) {
        this.arrayaggregate = arrayaggregate;
    }

    @Override
    public Object first() {
        index = 0;
        return arrayaggregate.getItem(index);
    }

    @Override
    public Object next() {
        if(!isDone())
            return arrayaggregate.getItem(index++);
        return null;
    }

    @Override
    public boolean isDone() {
        return !(index < arrayaggregate.count());
    }

    @Override
    public Object currentItem() {
        return arrayaggregate.getItem(index);
    }
    
        
}
