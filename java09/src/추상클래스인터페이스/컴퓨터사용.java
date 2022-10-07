package 추상클래스인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		apple.키보드();
		apple.마우스();
		apple.모니터();
		
		BananaComputer banana = new BananaComputer();
		banana.키보드();
		banana.마우스();
		banana.모니터();
	}

}