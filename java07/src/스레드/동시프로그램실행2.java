package 스레드;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
