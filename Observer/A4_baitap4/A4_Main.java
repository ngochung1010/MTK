package Observer.A4_baitap4;

public class A4_Main {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienA vienA = new ThanhVienA(topic);
        ThanhVienB vienB = new ThanhVienB(topic);
        System.out.println("Lần 1----------");
        topic.themTin("trời nóng quá");
        System.out.println("Lần 2----------");
        topic.themTin("hôm nay nắng quá");
        System.out.println("Lần 3");
        vienA.huyDangKy();
        topic.CapNhatTin(0,"bỏ quat sài máy lạnh");
    }
}
