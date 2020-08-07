import sample.KhachHang;

import java.util.Scanner;

public class Booking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KhachHang khachHang = new KhachHang();
//        for (int i = 1; i < 11; i++) {
            System.out.println("Nhập tên:");
            khachHang.setName(input.nextLine());
            System.out.println("Nhập số điện thoại:");
            khachHang.setSdt(input.nextInt());
            khachHang.setIdKH(1);
        System.out.println("ID bàn muốn đặt:");
        khachHang.setTableId(input.nextInt());
//        }
        System.out.println(khachHang);
    }
}
