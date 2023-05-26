/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.BaiTap4_vote;

/**
 *
 * @author DELL
 */
public class MainElection {
    public static void main(String[] args) {
        User s1 = new User("thao ");
        s1.vote(Candidate.Joebiden);
        System.out.println("Ong truml: "+ Election.getElection().getDol());
        System.out.println("Ong joe: "+ Election.getElection().getJon());
    }
}
