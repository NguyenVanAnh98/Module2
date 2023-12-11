package Minitest1;

import java.util.Scanner;

public class minitest1 {
    public static void main(String[] args) {
        if (kiemTraDangNhap()) {
            hienThiMenu();
            luaChonChucNang();
        } else {
            System.out.println("Bạn đã nhập sai quá 3 lần. Chương trình sẽ thoát.");
        }
    }

    // Kiểm tra đăng nhập
    public static boolean kiemTraDangNhap() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 3) {
            System.out.print("Nhập tên người dùng: ");
            String user = scanner.nextLine();
            System.out.print("Nhập mật khẩu: ");
            String password = scanner.nextLine();

            if (user.equals("admin") && password.equals("123456")) {
                return true;
            } else {
                System.out.println("Đăng nhập thất bại!");
                count++;
            }
        }

        return false;
    }

    // Hiển thị menu
    public static void hienThiMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ tam giác vuông");
        System.out.println("3. Vẽ tam giác cân");
        System.out.println("0. Thoát chương trình");
        System.out.println("Chọn: ");
    }

    // Lựa chọn chức năng
    public static void luaChonChucNang() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Nhập lựa chọn của bạn: ");
            String luaChon = scanner.nextLine();

            switch (luaChon) {
                case "1":
                    veHinhChuNhat();
                    break;
                case "2":
                    veTamGiacVuong();
                    break;
                case "3":
                    veTamGiacCan();
                    break;
                case "0":
                    System.out.println("Thoát chương trình.");
                    exit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        }
    }

    // Vẽ hình chữ nhật
    public static void veHinhChuNhat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int chieuRong = scanner.nextInt();
        System.out.print("Nhập chiều cao của hình chữ nhật: ");
        int chieuCao = scanner.nextInt();

        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < chieuRong; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        hienThiMenu();
    }

    // Vẽ tam giác vuông
    public static void veTamGiacVuong() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh góc vuông của tam giác: ");
        int canhGocVuong = scanner.nextInt();

        for (int i = 0; i < canhGocVuong; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        hienThiMenu();
    }

    // Vẽ tam giác cân
    public static void veTamGiacCan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác cân: ");
        int chieuCao = scanner.nextInt();
        System.out.print("Nhập cạnh đáy của tam giác cân: ");
        int canhDay = scanner.nextInt();

        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < chieuCao - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        hienThiMenu();
    }
}