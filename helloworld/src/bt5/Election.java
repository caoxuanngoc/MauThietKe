/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Election {
    private static Election instance;
    int joe = 0, dol = 0;
    List<String> users = new ArrayList();
    
    private Election() {
        
    }
    
    public static Election getInstance() {
        if(instance == null)
            instance = new Election();
        return instance;
    }
    
    public void vote(Candidate candidate,User user){
        if(users.contains(user.name))
            return;
        
        if(candidate == Candidate.DonalTrump){
            dol++;
            users.add(user.name);
        }
        else 
            if(candidate == Candidate.JoeBiden)
            {
                joe++;
                users.add(user.name);
            }
        
    }
    public int getJoe() {
        return joe;
    }
    public int getDonal() {
        return dol;
    }
}
