/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTraGiuaKi.bai1;



/**
 *
 * @author DELL
 */
public class CTTourBuilder {
    String tentour;
    double gia;
    String thoigian;
    String dsach;
    public CTTourBuilder(String tentour, double gia, String thoigian, String dsach) {
        this.tentour = tentour;
        this.gia = gia;
        this.thoigian = thoigian;
        this.dsach = dsach;
    }

    @Override
    public String toString() {
        return "CTTourBuilder{" + "tentour=" + tentour + ", gia=" + gia + ", thoigian=" + thoigian + ", dsach=" + dsach + '}';
    }

    
    
    
   public static class Builder{
        String tentour, gia, thoigian, dsach;
        
        public Builder addtentour(String tentour){
            this.tentour = tentour;
            return this;
        }
        
        public Builder addgia(String gia){
            this.gia = gia;
            return this;
        }
        
        public Builder addthoigian(String thoigian){
            this.thoigian = thoigian;
            return this;
        }
        
        public Builder adddsach(String dsach){
            this.dsach= dsach;
            return this;
        }

        CTTourBuilder build() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

      
        
       
    }
}
