package 추상클래스인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void 키보드() {
		System.out.println("검은색 키보드로 입력을 받습니다.");
	}

	@Override
	public void 마우스() {
		System.out.println("검은색 마우스로 입력을 받습니다.");
	}

	@Override
	public void 모니터() {
		System.out.println("검은색 모니터로 출력을 합니다.");
	}

}
