/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt5;

/**
 *
 * @author DELL
 */
public class ElectionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User u1 = new User(("Ngoc Y"));
        u1.vote(Candidate.JoeBiden);
        User u2 = new User(("Tuan Kiet"));
        u2.vote(Candidate.DonalTrump);
       // System.out.println("Joe: " + Election.getInstance().getJoe());
        System.out.println("Donal: " + Election.getInstance().getDonal());
    }
    
}
