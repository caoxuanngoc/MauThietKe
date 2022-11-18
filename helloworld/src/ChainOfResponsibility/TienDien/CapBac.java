/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsibility.TienDien;

/**
 *
 * @author DELL
 */
public class CapBac implements ITienDien{
    float giaBan;
    float min, max;
    ITienDien bacTiepTheo;

    public CapBac(float giaBan, float min, float max) {
        this.giaBan = giaBan;
        this.min = min;
        this.max = max;
    }

    @Override
    public ITienDien bacTiepTheo(ITienDien capBac) {
        return this.bacTiepTheo = capBac;
    }

    @Override
    public double soKwh(float soKw) {
        if (soKw <= max) {
            return (soKw - min)*giaBan;
        }else
            return (max - min) * giaBan + bacTiepTheo.soKwh(soKw);
    }
}

