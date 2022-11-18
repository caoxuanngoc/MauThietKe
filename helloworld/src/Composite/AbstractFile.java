/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author DELL
 */
public abstract class AbstractFile {
    String ten, path;
    String ngay;
    String preStr = "";

    public AbstractFile(String ten, String ngay) {
        this.ten = ten;
        this.path = ten;
        this.ngay = ngay;
    }

    public abstract String getStringTreeFolder();
    public String getPath(){
        return path;
    }
    public abstract void addItem(AbstractFile abstractFile);
    public abstract void removeItem(AbstractFile abstractFile);

}