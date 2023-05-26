/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder_Pattern.bt5_Sach_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Sach {
    String TenSach, TacGia;
    int SoTrang;

    List<String> chapters;
    
    private Sach(Builder b){
        TenSach = b.TenSach;
        TacGia = b.TacGia;
        SoTrang = b.SoTrang;
        chapters = b.chapters;    
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("TênSach: ")
                .append(TenSach)
                .append("\nSố Trang: ")
                .append(SoTrang)
                .append("\nTác Gỉa: ")
                .append(TacGia)
                .append("\nCác Chapters: ");
        for(String chapter: chapters)
            s.append("\n").append(chapter);
        return s.toString();
                
                
//        return "Sach{" + 
//                "TenSach:" + TenSach + '\n' +
//                "TacGia:" + TacGia + '\n' +
//                "SoTrang:" + SoTrang + '\n' + 
//                "chapters:" + chapters + '}';
    }
    
    
    public static class Builder{
        String TenSach, TacGia;
        int SoTrang;
        List<String> chapters = new ArrayList<>();
        
        public Builder addTenSach(String tenSach){
            this.TenSach = tenSach;
            return this;
        }
        public Builder addTacGia(String tacGia){
            this.TacGia = tacGia;
            return  this;
        }
        public  Builder addSoTrang(int soTrang){
            this.SoTrang = soTrang;
            return this;
        }
        public Builder addChapters(String Chapters){
            this.chapters.add(Chapters);
            return this;
        }
        public Sach Build(){
            return new Sach(this);
        }
    }
}
