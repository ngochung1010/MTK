/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class TourHung2 {
    String TenH, ThoiGianH;
    double GiaH;
    List<DDTL> dsH ;
    
    private TourHung2(BuilderH bh){
        TenH = bh.TenH;
        ThoiGianH = bh.ThoiGianH;
        GiaH = bh.GiaH;
        dsH = bh.dsH;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ten Tour: ")
                .append(TenH).append("\n")
                .append("Thoi Gian Tour: ")
                .append(ThoiGianH).append("\n")
                .append("Gia Tour: ")
                .append(GiaH);
                sb.append("Địa Điểm Tham Quan: ");
        for(TourHung2.DDTL dsHs : dsH){
            sb.append("\n").append("Tên Địa Điểm: ")
                    .append(dsHs.getTenDD()).append("\n")
                    .append("Địa Chỉ: ").append(dsHs.getDiaChi()).append("\n")
                    .append("Thời Điểm: ").append(dsHs.getThoiDiem());
        }
                    
        return sb.toString();
}
    
    public static class DDTL{
        private String  TenDD, DiaChi, ThoiDiem;

        public DDTL(String TenDD, String DiaChi, String ThoiDiem) {
            this.TenDD = TenDD;
            this.DiaChi = DiaChi;
            this.ThoiDiem = ThoiDiem;
        }
        
        public String getTenDD() {
            return TenDD;
        }

        public String getDiaChi() {
            return DiaChi;
        }

        public String getThoiDiem() {
            return ThoiDiem;
        }
        
    }
    
    public static class BuilderH{
        String TenH, ThoiGianH;
        int GiaH;
        List<DDTL> dsH = new ArrayList<>();
        
        private static BuilderH instance;
        
        private BuilderH(){}
        
        public static BuilderH createInstance(){
            if(instance == null)
                instance = new BuilderH();
            return instance;
        }
        
        public BuilderH addTenH(String tenH){
            this.TenH = tenH;
            return this;
        }
        public BuilderH addThoiGianH(String thoiGianH){
            this.ThoiGianH = thoiGianH;
            return this;
        }
        public BuilderH addGiaH(int giaH){
            this.GiaH = giaH;
            return this;
        }
        public BuilderH addThoiDiemH (String TenDD, String DiaChi, String ThoiDiem){
            if(dsH == null)
                dsH = new ArrayList<>();
            DDTL ddtl = new DDTL(TenDD, DiaChi, ThoiDiem);
            this.dsH.add(ddtl);
            return this;
        }
        public TourHung2 Build(){
            return new TourHung2(this);
        }
    }
}
