/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Chain.VDf88_ChainofResponibility;

/**
 *
 * @author DELL
 */
public class NhanVienF88 implements IXuLyVay{

    IXuLyVay capCaoHon;
    String ten, chucVu;
    int hanMucVay;

    public NhanVienF88(String ten, String chucVu, int hanMucVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public String XuLyKhoanVay(int tienVay) {
        if(tienVay<=hanMucVay)
            return chucVu + " " + ten + " xử lý khoản vay ";
        return capCaoHon.XuLyKhoanVay(tienVay);
    }

    @Override
    public IXuLyVay capCaoHon(IXuLyVay xuLyVay) {
        this.capCaoHon = xuLyVay;
        return xuLyVay;
    }
    
}
