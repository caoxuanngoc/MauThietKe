/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility.TienDien;

/**
 *
 * @author DELL
 */
public class BacCaoNhat implements ITienDien{
    float giaBan;
    float min;
    public BacCaoNhat(float giaBan, float min) {
        this.giaBan = giaBan;
        this.min = min;
    }
    @Override
    public ITienDien bacTiepTheo(ITienDien capBac) {
        return null;
    }
    @Override
    public double soKwh(float soKw) {
        return (soKw - min) * giaBan;
    }
}
