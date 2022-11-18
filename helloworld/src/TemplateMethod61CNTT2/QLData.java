/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TemplateMethod61CNTT2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public abstract class QLData<T> {
    List<T> list = new ArrayList<>();
    
    abstract protected int khoa(T t);
    abstract public void hienThiDoiTuong(T t);
    //Kiem tra mot doi tuong t co trong list hay khong
    public boolean  kiemTra(T t){
        for(T o:list){
            if(khoa(o)==khoa(t))
                return true;
        }
        return false;
    }
    
    public boolean them(T t){
        if(kiemTra(t)==false){
            list.add(t);
            return  true;
        }
        return false; // lm du cach nhung ko them dc
    }
    
    public int capNhat(T t){
        for(int i=0;i<list.size();i++){
           if(khoa(t)==khoa(list.get(i))){
               list.set(i, t);
               return 1;
           }
               
        }
        return  0;
    }
    
/*    public int xoa(T t){
        if(kiemTra(t)){
            list.remove(t);
            return 1;
        }
            return 0;
    }*/
    
     public int xoa(T t){
        for(int i=0;i<list.size();i++){
           if(khoa(t)==khoa(list.get(i))){
               list.remove(i);
               return 1;
           }
               
        }
        return  0;
    }
     
     public void hienThi(){
         list.forEach((t) -> {
             hienThiDoiTuong(t);
             System.out.println();
         });
     }
}
