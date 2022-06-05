package tugasminggu1dan2;

import java.util.Scanner;
import java.util.*;

public class TugasKalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a, b, ans;
			char op;
			Scanner sc = new Scanner (System.in);
			System.out.println("Masukkan bilangan pertama: ");
			a = sc.nextInt();
			System.out.println("Masukkan bilangan  kedua: ");
			b = sc.nextInt();
			System.out.println("Masukkan operator (+ , - , * , / )");
			op = sc.next().charAt(0);
			
			switch (op) {
			case '+' : ans=a+b;
			break;
			case '-' : ans=a-b;
			break;
			case '*' : ans=a*b;
			break;
			case '/': ans=a/b;
			break; 
			default: System.out.println("Error!");
			return;
			
			}
			
			System.out.println("Jawabannya adalah: " + ans);
		} 
		catch (Exception e) {
			System.out.println("Input harus berupa angka atau bilangan");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}


