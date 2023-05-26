/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.BaiTap4_vote;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Election {
    private static Election election;
    int dol=0;
    int jon=0;
    List<String> users = new ArrayList<>();
    
    private Election(){
        
    }
    
    public static Election getElection(){
        if(election == null)
            election = new Election();
        return election;
    }
    
    public void vote(Candidate candidate, User user){
        if(users.contains(user.name)){
            return;
        }
        if(candidate == Candidate.Donaltrum)
        {
            dol++;
            users.add(user.name);
        }
        else if(candidate == Candidate.Joebiden){
            jon++;
            users.add(user.name);
        }            
    }

    public int getDol() {
        return dol;
    }

    public int getJon() {
        return jon;
    }
    
}
