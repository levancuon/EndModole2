public class Menu {
    public void menu() {
        Validate input = new Validate();
        QuanLyBenhAn quanLyBenhAn = new QuanLyBenhAn();
        while (true) {
            System.out.println("--Chương trình quản lý bệnh án--\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách bệnh án\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:");
            int choice = input.getInt();
            switch (choice) {
                case 1:
                    quanLyBenhAn.themMoiBenhAn();
                    break;
                case 2:
                    quanLyBenhAn.xoaBenhAn();
                    break;
                case 3:
                    quanLyBenhAn.xemDs();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("nhập số 1->4");
            }
        }
    }

}
