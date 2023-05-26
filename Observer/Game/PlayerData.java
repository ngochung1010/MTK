package Observer.Game;

public class PlayerData {
    I_TheoDoi theoDoi;

    public void DangKy(I_TheoDoi playerData)
    {
        theoDoi = playerData;
    }
    public void HuyDangKy(I_TheoDoi playerData)
    {
        theoDoi = null;
    }

    public void CapNhat(int thoiGian, int soLuot, int soDiem)
    {
        theoDoi.capNhatNhanVat(thoiGian, soLuot, soDiem);
    }


    public static interface I_TheoDoi{
        void capNhatNhanVat(int thoiGian, int soLuot, int soDiem);
    }
}
