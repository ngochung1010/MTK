/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBSERVER_PATTERN.Observer_A1;

import java.util.List;

/**
 *
 * @author DELL
 */
public class MainStreamData {
    public static void main(String[] args) {
        Stream<List<MonHoc>> stream = new Stream();
        DataAccess dataAccess = new DataAccess(stream);
        Client<List<MonHoc>> client = new Client<List<MonHoc>>(stream) {
            @Override
            public void Handle(List<MonHoc> t) {
                for(var mh : t){
                    System.out.println(mh.toString());
                }   
            }
        };
        System.out.println("Lần 1: ");
        dataAccess.add(new MonHoc("MH01", "Mẫu Thiết Kế", 03));
        System.out.println("-----------------------------------------------");
        System.out.println("Lần 2: ");
        dataAccess.add(new MonHoc("MH02", "Mẫu Thiết Kế", 03));
    }
}
