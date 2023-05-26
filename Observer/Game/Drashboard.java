package Observer.Game;

public class Drashboard implements PlayerData.I_TheoDoi{

    PlayerData playerData;

    int thoiGian, countdown, grade;

    public Drashboard(PlayerData playerData, int thoiGian, int countdown, int grade) {
        this.playerData = playerData;
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;
    }
    public void dangKy()
    {
        playerData.DangKy(this);
    }

    public void huyDangKy()
    {
        playerData.HuyDangKy(this);
    }


    public Drashboard(int thoiGian, int countdown, int grade) {
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;
    }

    @Override
    public void capNhatNhanVat(int thoiGian, int soLuot, int soDiem) {
        this.thoiGian = thoiGian;
        this.countdown = soLuot;
        this.grade = soDiem;
        System.out.println("Thời gian còn lại: " + thoiGian + "\nSố lượt chơi còn lại: " + soLuot + "\nSố điểm đạt được: " + soDiem);

    }
}
