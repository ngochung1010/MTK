
package Template_Methods.D2_LopHoc;

public class MySinhVienDB extends ObjectDB<MySinhVien>{
    @Override
    public int getId(MySinhVien mySinhVien) {
        return mySinhVien.getMaSV();
    }
    
}
