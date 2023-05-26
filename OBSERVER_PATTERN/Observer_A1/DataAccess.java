/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBSERVER_PATTERN.Observer_A1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DataAccess {
    List<MonHoc> list = new ArrayList<>();
    Stream<List<MonHoc>> stream;

    public DataAccess(Stream<List<MonHoc>> stream) {
        this.stream = stream;
    }
    
    //phương thức add
    public void add(MonHoc mh){
        list.add(mh);
        stream.addEvent(list);
    }
}
