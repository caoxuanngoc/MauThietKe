/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt5;

/**
 *
 * @author DELL
 */
public class User {
    String name;
    public User(String name) {
        this.name = name;
    }
    
    public void vote(Candidate candidate){
        Election e = Election.getInstance();
        e.vote(candidate, this);
    }
}
