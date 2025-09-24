package edu.kh.oop.practice.model.vo;

public class Hero {
	private String nickname; // 닉네임
	private String job; 	// 직업
	private int hp; 		// 체력
	private int mp; 		// 마력
	private int level; 		// 레벨
	private double exp; 	//경험치
	
	public Hero() {}

	public Hero(String nickname, String job, 
			int hp, int mp, int level, double exp) {
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		
		System.out.printf("=============캐릭터 생성===========\n"
				+ "%s 직업으로 '%s' 님이 생성되었습니다.\n"
				+ "현재 레벨 : %d\n"
				+ "현재 hp : %d\n"
				+ "현재 mp : %d\n"
				+ "현재 경험치 : %.1f\n",
				job, nickname, level, hp, mp, exp);
	}
	
	public void attack(double exp) {
		this.exp += exp; // 전달받은 경험치를 현재 경험치에 누적하고,
		System.out.printf("'%s' 은/는 공격을 했다!!! "
				+ "현재 경험치 : %.1f\n",
					 nickname, this.exp );
		// 공격했다는 메시지 출력. 
		
		// 단, 현재 경험치가 300이상이면 
		// 현재 레벨을 1 증가시키고, 레벨이 올랐다는 메세지 출력
		// 경험치 추가 300 마다 레벨이 오르도록 조건식 수정
		if(this.exp >= 300 * level) {
			level += 1; 
			System.out.println("레벨이 올랐습니다!! 현재레벨 : " + level);
		}
	
	}
	
	public void dash() {
	
		// 단, 현재 mp 가 0 이하라면 마력이 부족하여 대시할 수 없음을 메세지 출력
		if(mp <= 0) {
			System.out.println("[마력 부족] 더 이상 대시 할 수 없어요~!");
		} else {
			// 대시 할 때 마다 현재 mp에서 -10씩 감소
			mp -= 10; // mp = mp - 10;
			// 대시했다는 메세지 출력
			System.out.printf("'%s'의 엄청 빠른 대시!!! 남은 마력 : %d\n",
							nickname, mp );
		}
	
	}
	
	@Override
	public String toString() {
		return "========'%s'님의 정보========\n" 
				+ "- 현재 레벨 : %d\n" 
				+ "- 현재 hp : %d\n" 
				+ "- 현재 mp : %d\n"
				+ "- 현재 exp : %.1f\n";
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
}
