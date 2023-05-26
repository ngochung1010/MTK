/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_Chain.B1_ATM;

/**
 *
 * @author DELL
 */
public class RutTien implements IRutTienATM{
    int menhGia;
    int soto;
    int soDu;
    IRutTienATM menhGiaKeTiep;

    public RutTien(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public void IRutTienATM(int TienRut) {
        soto = TienRut/menhGia;
        if(soto>0)
        {
            System.out.println(soto + " Tờ Tiền Mệnh Gía " + menhGia);
        }
        soDu = TienRut%menhGia;
        if(soDu>0)
            menhGiaKeTiep.IRutTienATM(soDu);
        
    }

    @Override
    public B_Chain.B1_ATM.IRutTienATM MenhGiaKeTiep(B_Chain.B1_ATM.IRutTienATM iRutTienATM) {
        this.menhGiaKeTiep = iRutTienATM;
        return iRutTienATM;
    }

    
    
}
