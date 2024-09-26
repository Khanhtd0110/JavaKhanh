package khanhtd.baitap;

import java.util.Scanner;

public class baitapTinhdientich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
       // Nhập chiều dài và chiều rộng hình chữ nhật
        System.out.print("Chiều dài: (m)");
        double chieudai = scanner.nextDouble();
        System.out.print("Chiều rộng: (m)");
        double chieurong = scanner.nextDouble();
        // Tính chu chu vi và diện tích hình chữ nhật
        double P = (chieudai + chieurong) * 2;
        double S = chieudai * chieurong;
        // Hiển thị kết quả
        System.out.println("Chu vi hình chữ nhật là: " + P);
        System.out.println("Diện tích hình chữ nhật là: " + S);
        
        //Nhập bán kính hình tròn
        System.out.println("Bán kính là: (m)");
        double r = scanner.nextDouble();
        
        // Tính diện tích hình tròn
        final double pi = 3.14;
        double Po = 2 * pi * r;
        double So = pi * (r*r);
        
        //Hiển thị kết quả
        System.out.println("Chu vi hình tròn là: " + Po);
        System.out.println("Diện tích hình tròn là: " + So);
	}
		
		

}
