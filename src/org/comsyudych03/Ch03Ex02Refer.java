package org.comsyudych03;

// class는 사용자 정의 타입
// 사용자가 임의로 만들어서 쓰는 데이터 타입
// 클래스 = 필드 + 메소드
// 필드 : 속성(변수)
// 메소드 : 일(함수)

class Point {
	int x;	// 참조변수는 정수취급이라 4바이트
	int y;
}

public class Ch03Ex02Refer {
	static void swap(Point p) { //타입만 맞춰주면 되니까 p라고 해도됌.
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
	}
	
	public static void main(String[] args) {
		Point p1 = null; // Point 타입의 참조변수 p1을 선언
		p1 = new Point(); // 객체생성 연사자는 new써야 뭐든 만드니까 
		
		p1.x = 100;
		p1.y = 200;
		
		swap(p1); // p1이 레퍼런스 레퍼런스를 넘겨줘야함.
		
		System.out.println("p1.x:"+p1.x+", p1.y:"+p1.y);
		System.out.println("p1.y:"+p1.y+", p1.x:"+p1.x);
	}
}
