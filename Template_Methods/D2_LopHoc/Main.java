package Template_Methods.D2_LopHoc;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MySinhVienDB SV = new MySinhVienDB();
        MonHocDB MH = new MonHocDB();
        MySinhVien sv1 = new MySinhVien(01, "Lê Thị Kim Thuận", "20/12/2001", "phú yên");
        MySinhVien sv2 = new MySinhVien(21133702, "Lê Thị Thu Thảo", "22/2/2001", "Cam Ranh");
        MonHoc mh1 = new MonHoc(02, 9, "Mẫu Thiết Kế");
        MonHoc mh2 = new MonHoc(03, 9, "Cơ Sở Dữ Liệu");
        SV.add(sv1);
        SV.add(sv2);
        MH.add(mh1);
        MH.add(mh2);



        MH.update(new MonHoc(02, 9, "Mẫu Thiết Kế Đậu"));
        MH.deleteByID(mh1.getMaMH());
        // Hiển thị danh sách Môn Học
        List<MonHoc> dsMonHoc = MH.list;
        for (MonHoc s : dsMonHoc) {
            System.out.println(s.toString());
        }

        // Hiển thị danh sách sinh viên
        List<MySinhVien> dsSinhVien = SV.list;
        for (MySinhVien s : dsSinhVien) {
            System.out.println(s.toString());
        }

    }
}
