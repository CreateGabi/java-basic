package 컬렉션;

import java.util.HashMap;

public class 고객관리시스템 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put(100, "김데이");
		map.put(200, "김사전");
		map.put(300, "김구조");
		map.put(400, "김자료");
		System.out.println(map);
		
		map.remove(200);
		map.put(300, "김충성");
		System.out.println(map);
	}

}
