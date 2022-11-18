/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator.Array;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ArrayIterator  {

    List<Integer> Mang = new ArrayList();

    public void addItem(int i) {
        Mang.add(i);
    }

    public MyIterator createIterator() {
        return new ArrayAggragate();
    }

    private class ArrayAggragate implements MyIterator{

        @Override
        public void getItem(int i)
        {

            if(i>=0 && i< Mang.size())
                System.out.println("Phan tu thu "+i+ " la: "+ Mang.get(i));
            else
                System.out.println("Khong co phan tu thu: "+ i);
        }

        @Override
        public void count() {
            System.out.println("So phan tu co trong mang: "+Mang.size());
        }
    }
}
