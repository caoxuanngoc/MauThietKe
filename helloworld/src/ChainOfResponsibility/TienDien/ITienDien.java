/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ChainOfResponsibility.TienDien;

/**
 *
 * @author DELL
 */
public interface ITienDien {
    ITienDien bacTiepTheo(ITienDien capBac);
    double soKwh(float soKw);
}
