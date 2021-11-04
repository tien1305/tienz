/*
* created date: Nov 04, 2021
*author: tien
*/
package tam;

public class student {
    public class QuanLySinhVienGD {
        static ArrayList<SinhVienGD> list = new ArrayList<SinhVienGD>();
        static Scanner nhap = new Scanner(System.in);

        public static void main(String[] args) {

        public static void Menu() {
            System.out.println("1. Nhap danh sach sinh vien" + "\n2. Xuat danh sach sinh vien"
                    + "\3. Danh sach sinh vien gioi" + "\n4. Sap xep sinh vien theo diem" + "n\5. Ket Thuc");

        }

        public static void nhapDSSV() {
            System.out.println("Nhap so luong sinh vien can them");
            int soluong = nhap.nextInt();
            for (int i = 0; i < soluong; i++) {
                System.out.println(" Chon 1 hoac 2 de them: " + "\n1. SinhVienIT" + "\n2. SinhVienKT");
                String chon = nhap.nextLine();
                if (nhap == 1) {
                    String hoTen;
                    double diemJava, diemCSS, diemHTML;
                    System.out.println("Nhap ho va ten sinh vien:");
                    hoTen = nhap.nextLine();
                    System.out.println("Diem Java = ");
                    diemJava = nhap.nextDouble();
                    System.out.println(" Diem CSS = ");
                    diemCSS = nhap.nextDouble();
                    System.out.println(" Diem HTML = ");
                    diemHTML = nhap.nextDouble();

                    SinhVienGD sIT = new SinhVienIT(hoTen, diemJava, diemCSS, diemHTML);

                } else if (chon == 2) {
                    String hoTen;
                    double diemMarketing, diemSales;
                    System.out.println("Nhap ho va ten  sinh vien");
                    hoTen = nhap.nextLine();
                    System.out.println("Diem Maketing:");
                    double diemMaketing = nhap.nextDouble();
                    System.out.println("Diem Sales = ");
                    diemSales = nhap.nextDouble();
                    SinhVienGD sKT = new SinhVienBiz(hoTen, diemMarketing, diemSales);
                    list.add(sKT);
                } else {
                    System.out.println(" Lua chon khong hop le. Vui long chon 1 hoac 2");
                }
            }
        }

        public static void xuatDSSV() {
            for (SinhVienGD sinhVienGD : list) {
                System.out.println("sinhVien.toString())");
            }
        }

        public static void sinhVienGioi() {

        }

        public static void sapXepTheoDiem() {
        }
}