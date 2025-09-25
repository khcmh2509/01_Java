package edu.kh.oarr.model.vo;

public class Member {

	// 속성(필드 == 멤버변수)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; // 지역(서울, 경기..)

	// 기능(메서드, 생성자)
	// 생성자 (기본생성자, 매개변수생성자)
	// 생성자 작성 규칙
	// 1. 생성자명은 클래스명과 같다
	// 2. 반환형이 없다
	
	// 오버로딩 : 같은 클래스 내 동일한 생성자명/메서드명 
	//				등을 이용할 수 있는 기법
	// 오버로딩 성립조건 : 매개변수의 타입, 개수, 순서 중
	//					하나라도 다르면 성립.
	
	// 기본생성자
	public Member() {}
	
	// 모든 필드초기화용 매개변수 생성자
	public Member(String memberId, String memberPw, 
			String memberName, int memberAge, String region) {

		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
