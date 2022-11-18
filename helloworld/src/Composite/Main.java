/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Composite;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        AbstractFile abstractFile = new Folder("Ngoc","30");
        AbstractFile abstractFile2 = new Folder("Ngoccao","31/1/2001");
        AbstractFile abstractFile3 = new Folder("ngoccaoxuan","123");

        AbstractFile file = new File("ngocimg","30/7");
        AbstractFile file2 = new File("ngoccaoimg","13");

        abstractFile.addItem(abstractFile2);
        abstractFile2.addItem(abstractFile3);

        abstractFile.addItem(file);
        abstractFile2.addItem(file2);

        System.out.println(abstractFile.getStringTreeFolder());
    }
    
}
