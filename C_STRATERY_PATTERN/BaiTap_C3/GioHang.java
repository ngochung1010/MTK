/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_STRATERY_PATTERN.BaiTap_C3;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    IThanhToan thanhToan;
    IKhuyenMai iKhuyenMai;
    IGiaoHang giaoHang;
    List<MatHang> DsMH = new ArrayList<>();

    public IThanhToan getThanhToan() {
        return thanhToan;
    }

    public IKhuyenMai getiKhuyenMai() {
        return iKhuyenMai;
    }

    public IGiaoHang getGiaoHang() {
        return giaoHang;
    }

    public void setThanhToan(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

     public void setiKhuyenMai(IKhuyenMai iKhuyenMai) {
        this.iKhuyenMai = iKhuyenMai;
    }

    public void setGiaoHang(IGiaoHang giaoHang) {
        this.giaoHang = giaoHang;
    }
   
    public void themMH(MatHang Mh){
        DsMH.add(Mh);
    }
   
   public int TongTienGH(){
       int tienhang = 0;
       for(int i=0; i<DsMH.size(); i++)
           tienhang += DsMH.get(i).getDonGia() * DsMH.get(i).getSoLuong();
       return tienhang;
   }
   
   public void HienThi(){       
       for(int i=0; i<DsMH.size(); i++)
           DsMH.get(i).Display();
       System.out.println("--------------------------------------------------------------------------------------------");
       System.out.println("Tổng tiền đơn hàng: " +TongTienGH());
       System.out.println("tiền được giảm ứng với hình thức thanh toán: " + thanhToan.thanhtoan(TongTienGH()));
       System.out.println("phí vận chuyển: " + giaoHang.phivanchuyen());
       System.out.println("tiền được khuyến mãi: " + iKhuyenMai.KhuyenMai(TongTienGH()));
       System.out.println("tiền cần thanh toán: " + (TongTienGH()+giaoHang.phivanchuyen()-thanhToan.thanhtoan(TongTienGH())-iKhuyenMai.KhuyenMai(TongTienGH())));
       System.out.println("thời gian dự kiến sẽ nhận hàng: " + giaoHang.TGgiaoHang());
   }
}
