package khanhtd.coban;

import java.util.Scanner;

public class Nhapxuathoten {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String hoten;
		int tuoi;
		double chieucao;
		double cannang;
		
		Scanner banphim;
		banphim = new Scanner(System.in);
		
	
		System.out.print("Họ và tên: ");
		hoten =  banphim.nextLine();
		System.out.print("Bao nhiêu tuổi: ");
		tuoi =  banphim.nextInt();
		System.out.print("Chiều cao bao nhiêu: (m)");
		chieucao =  banphim.nextDouble();
		System.out.print("Cân nặng bao nhiêu: (kg)");
		cannang =  banphim.nextDouble();
		
		System.out.println("Full Name (Họ và Tên) " + hoten);
		System.out.println("Age (Tuổi) " + tuoi);
		System.out.println("Weight (Cân nặng) " + cannang);
		System.out.println("Height (Chiều cao) " + chieucao);
	}

}
