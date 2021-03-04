package book.home_088;

public class Platoon {
	
	private String name;
	
	// 기본 생성자
	public Platoon() {
		name="Platoon"; //필드초기화
	}
	
	// 사용자 생성자
	public Platoon(String name) {
		this.name = name; //필드 변경 객체생성
	}

	// 필드반환 메서드
	public String getPlatoonName() {
		return name;
	}
	
	
	public void showPlatoonName() {
		System.out.println("The "+ name +" platoon");
	}
	
	
	

}
