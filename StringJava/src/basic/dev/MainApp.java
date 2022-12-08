package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 1 chuỗi");
		String n = sc.nextLine();
        String daoNguoc = "";
        for (int i = 0; i < n.length(); i++) {
			daoNguoc = n.charAt(i) + daoNguoc;
		}
        System.out.println("sau khi đảo ngược : " + daoNguoc);

		int  countWords = n.split("\\s").length;
		System.out.println("Số từ trong chuỗi : " + countWords);
		
		
	}

}
