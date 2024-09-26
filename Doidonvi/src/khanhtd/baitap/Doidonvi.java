package khanhtd.baitap;

import java.util.Scanner;

public class Doidonvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Lựa chọn loại chuyển đổi
        System.out.println("Chọn đơn vị muốn chuyển đổi:");
        System.out.println("1. Km -> M");
        System.out.println("2. Byte -> Bit");
        System.out.println("3. Inch -> cm");
        System.out.print("Lựa chọn của bạn: ");
        // int LuaChon = Scanner.nextInt ();
        int ChonDV = scanner.nextInt();
        
        switch (ChonDV) {
            case 1:
                // Chuyển đổi Km sang M
                System.out.print("Nhập số Km: ");
                double soKm = scanner.nextDouble();
                double soM = soKm * 1000; // 1 Km = 1000 m
                System.out.println(soKm + " Km = " + soM + " m");
                break;
            case 2:
                // Chuyển đổi Byte sang Bit
                System.out.print("Nhập số Byte: ");
                double soByte = scanner.nextDouble();
                double soBit = soByte * 8; // 1 Byte = 8 Bit
                System.out.println(soByte + " Byte = " + soBit + " Bit");
                break;
            case 3:
                // Chuyển đổi Inch sang Cm
                System.out.print("Nhập số Inch: ");
                double soInch = scanner.nextDouble();
                double soCm = soInch * 2.54; // 1 Inch = 2.54 cm
                System.out.println(soInch + " Inch = " + soCm + " Cm");
                break;
            default:
                System.out.println("Bạn nhập không đúng vui lòng chọn lại: ");
        }
	}

}
