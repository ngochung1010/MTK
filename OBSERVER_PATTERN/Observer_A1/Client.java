/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBSERVER_PATTERN.Observer_A1;

/**
 *
 * @author DELL
 */
public abstract class Client<T> implements Stream.StreamListener<T> {
    Stream<T> stream;
    public  Client(Stream stream){
        this.stream = stream;
        stream.listen(this);
    }
//    @Override
//    public void Handle(T t) {
//        
//    }
    
}
