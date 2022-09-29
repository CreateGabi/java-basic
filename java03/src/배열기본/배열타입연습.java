package 배열기본;

public class 배열타입연습 {

	public static void main(String[] args) {
		String[] travel = {"광안리", "해운대", "호미곶", "도쿄", "오사카"};
		for (String string : travel) {
			System.out.print(string + " ");
		}
		System.out.println();
		for (int i = 0; i < travel.length; i++) {
			System.out.print(travel[i] + " ");
		}
		
		System.out.println();
		char[] color = {'p', 'b', 'c', 'm', 'w'};
		for (char c : color) {
			System.out.print(c + " ");
		}
		System.out.println();
		for (int i = 0; i < color.length; i++) {
			System.out.print(color[i] + " ");
		}
		
		System.out.println();
		double[] height = {188.9, 179.8, 165.5, 189.8, 177.4};
		for (double d : height) {
			System.out.print(d + " ");
		}
		System.out.println();
		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
		}
	}

}
