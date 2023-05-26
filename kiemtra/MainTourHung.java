/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

/**
 *
 * @author DELL
 */
public class MainTourHung{
    public static void main(String[] args) {
        //Câu 1
        TourHung tourHung = new TourHung.BuilderH()
                .addTenH("Tham Quan vinper")
                .addThoiGianH("3 ngày 2 đêm")
                .addGiaH(1700000)
                .addThoiDiemH("Thác Pongour", "Đường QL20, Thôn Đức Trọng, Xã Đa Quyn, Huyện Krông Nô, Tỉnh Đắk Nông", "Ngày thứ 1")
                .addThoiDiemH("Thung lũng tình yêu", "Đường Hoàng Văn Thụ, Phường 8, Thành phố Đà Lạt, Tỉnh Lâm Đồng", "Ngày thứ 2")
                .Build();
        System.out.println(tourHung.toString());
//        
        //Câu 2
//        TourHung2 th1 = TourHung2.BuilderH.createInstance()
//                .addTenH("Tour 1")
//                .addThoiGianH("3 ngày 2 đêm")
//                .addGiaH(400000)
//                .addThoiDiemH("Ngày thứ 1")
//                .Build();
//        TourHung2 th2 = TourHung2.BuilderH.createInstance()
//                .addTenH("Tour 2")
//                .addThoiGianH("3 ngày 2 đêm")
//                .addGiaH(400000)
//                .addThoiDiemH("Ngày thứ 2")
//                .Build();
//        
//        System.out.println(th1.toString());
//        System.out.println("------------------------------------------");
//        System.out.println(th2.toString());
    }
}
