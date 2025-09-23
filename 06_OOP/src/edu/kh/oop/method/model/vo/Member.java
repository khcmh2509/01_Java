package edu.kh.oop.method.model.vo;

public class Member { // 회원 클래스
	
	// 속성 + 기능 
	
	// 필드 (== 속성)
	private String memberId;	// 아이디
	private String memberPw;	// 비밀번호
	private String memberName;	// 이름
	private int memberAge;  	// 나이
	

	// 기능 (== 메서드/생성자)
	
	public Member() {} 
	
	public Member(String memberId, String memberPw, 
				String memberName, int memberAge) {
		//super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
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
	
	
	

}
