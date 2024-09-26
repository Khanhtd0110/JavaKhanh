package khanhtd.baitap;

import java.util.Scanner;

public class Doingoaite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        /// Chọn ngoại tệ
        System.out.println("Chọn ngoại tệ:");
        System.out.println("1.Đồng đô la USD sang VNĐ");
        System.out.println("2. Đồng Euro EUR sang VNĐ");
        System.out.println("3. Nhân dân tệ CNY sang VNĐ");
        System.out.print("Lựa chọn của bạn: ");
        
        int ChonNT = scanner.nextInt();
        
        switch (ChonNT) {
            case 1:
               
                System.out.print("Nhập đồng đô la (USD): ");
                double USD = scanner.nextDouble();
                double UVND= USD * 24625; // 1 USD = 24625 VND
                System.out.println(USD + " USD = " + UVND + " VND");
                break;
            case 2:
                
                System.out.print("Nhập đồng Euro (EUR): ");
                double EUR = scanner.nextDouble();
                double EVND = EUR * 26736; // 1 Euro = 26736 VND
                System.out.println(EUR + " EUR = " + EVND + " VND");
                break;
            case 3:
                
                System.out.print("Nhập đồng Nhân dân tệ (CNY): ");
                double CNY = scanner.nextDouble();
                double CVND = CNY * 3436; // 1 CNY = 3436 VND
                System.out.println(CNY + " CNY = " + CVND + " VND");
                break;
            default:
                System.out.println("Bạn nhập không đúng vui lòng chọn lại: ");
        }
	}

}
