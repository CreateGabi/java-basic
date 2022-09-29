package 연습;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 1번
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0] + arr[2]);
		
		
		// 2번
		String[] str = new String[3];
		str[0] = "자바";
		str[1] = "스프링";
		str[2] = "JSP";
		
		System.out.println(str[0] + " 보다는 " + str[1]);
	}

}
