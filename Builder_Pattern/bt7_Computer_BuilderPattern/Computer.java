/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt7_Computer_BuilderPattern;

/**
 *
 * @author DELL
 */
public class Computer {
    String CPU, RAM, storage, screen;

    private Computer(Builder b){
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }

    @Override
    public String toString() {
        return "Computer{" + 
                "CPU=" + CPU + '\n' +
                "RAM=" + RAM +  '\n' +
                "storage=" + storage + '\n' + 
                "screen=" + screen + '}';
    }
    
    public static class Builder{
        String CPU, RAM, storage, screen;
        public Builder builderCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        public Builder builderRAM(String ram){
            this.RAM = ram;
            return this;
        }
        public Builder builderStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder builderScreen(String screen){
            this.screen = screen;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
        
    }
}
