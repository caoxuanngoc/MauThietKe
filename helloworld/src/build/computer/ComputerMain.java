/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package build.computer;

/**
 *
 * @author DELL
 */
public class ComputerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Computer computer = new Computer.Builder()
                .addCPU("Core i9 12009")
                .addRAM("32GB RAM SAMSUNG")
                .addDisk("1TB SSD")
                .addScreen("i7 inches")
                .build();
        System.out.println(computer.toString());
    }
    
}
