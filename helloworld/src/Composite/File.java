/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author DELL
 */

public class File extends AbstractFile{

    public File(String ten, String ngay) {
        super(ten, ngay);
    }

    @Override
    public String getStringTreeFolder() {
        return this.ten;
    }

    @Override
    public void addItem(AbstractFile abstractFile) {
    }

    @Override
    public void removeItem(AbstractFile abstractFile) {
    }
}
