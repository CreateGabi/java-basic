package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.gender = "남자";
		p.name = "클라크";
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 100;
		System.out.println(m);
		
		수퍼맨 sMan = new 수퍼맨();
		sMan.gender = "남자";
		sMan.name = "윌리엄";
		sMan.size = 200;
		System.out.println(sMan);
		sMan.날아다니다();
		sMan.달리다();
		sMan.먹다();
		sMan.잠자다();
		
		우먼 w = new 우먼();
		w.gender = "여자";
		w.name = "록시";
		w.size = 100;
		System.out.println(w);
		
		원더우먼 wWoman = new 원더우먼();
		wWoman.gender = "여자";
		wWoman.name = "다이애나";
		wWoman.size = 200;
		System.out.println(wWoman);
		wWoman.싸우다();
		wWoman.강하다();
		wWoman.먹다();
		wWoman.잠자다();
		
		직원 w1 = new 직원();
		w1.name = "홍길동";
		w1.address = "서울";
		w1.salary = 100;
		w1.rrn = 1;
		System.out.println(w1);
		
		메니저 m1 = new 메니저();
		m1.name = "김길동";
		m1.address = "서울";
		m1.salary = 150;
		m1.rrn = 2;
		m1.bonus = 10;
		System.out.println(m1);
		m1.test();
	}

}
