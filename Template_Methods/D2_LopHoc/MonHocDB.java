package Template_Methods.D2_LopHoc;

public class MonHocDB extends ObjectDB<MonHoc>{
    @Override
    public int getId(MonHoc monHoc) {
        return monHoc.getMaMH();
    }
}
