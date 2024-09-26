package khanhtd.baitap;
import java.util.Scanner;

public class TinhBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner Banphim = new Scanner (System.in);
	
		
		//Nhap Họ và Tên
		System.out.print("Họ và tên: ");
		String hoTen= Banphim.nextLine();
		// Nhap Chieu Cao
		System.out.println("======================================= ");
		System.out.println("Nếu bạn cao 1m65 thì nhập là 1,65 nha DẤU PHẨY NHA");
		System.out.println("======================================= ");
		System.out.println("Chiều cao: ");
		double Chieucao= Banphim.nextDouble();
		// Nhap can nang
		System.out.print("Cân nặng: ");
		double Cannang= Banphim.nextDouble();
		
		// Tinh chi so BMI
		double bmi = Cannang/ (Chieucao*Chieucao);
		
		// In thong tin ra
		System.out.println("Bạn" +  hoTen);
		System.out.println("Có chỉ số BMI là: " + bmi);
		
		if (bmi<18.5)
				System.out.println("Thiếu cân");
		else if (bmi<25)
			System.out.println("Bình thường");
		else if (bmi<30)
			System.out.println("Tiền béo Phì");
		else if (bmi<35)
			System.out.println("Béo phì độ 1");
		else if (bmi<40)
			System.out.println("Béo phì độ 2");
		
	}

}
