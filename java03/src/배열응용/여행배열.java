package 배열응용;

import java.util.Scanner;

public class 여행배열 {

	public static void main(String[] args) {
		String[] lastYear = new String[3];
		String[] thisYear = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < lastYear.length; i++) {
			System.out.print("작년에 가고 싶었던 곳: ");
			lastYear[i] = sc.next();
		}
		System.out.println();
		for (int i = 0; i < thisYear.length; i++) {
			System.out.print("올해에 가고 싶었던 곳: ");
			thisYear[i] = sc.next();
		}
		
		int count = 0;
		for (int i = 0; i < thisYear.length; i++) {
			if (lastYear[i].equals(thisYear[i])) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
