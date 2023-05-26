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
public class Stream<T> {
    List<StreamListener> sls = new ArrayList<>();
    public void listen(StreamListener listener){
        sls.add(listener);
    }
    public void addEvent(T t){
        for(var listener : sls){
            listener.Handle(t);
        }
    }
    
    public  static interface StreamListener<T>{
        void Handle(T t);
    }
}
