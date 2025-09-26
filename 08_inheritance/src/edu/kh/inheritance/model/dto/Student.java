package edu.kh.inheritance.model.dto;

/*
 * Object
 *    ㄴ Person
 *          ㄴ Student
 * */

// 			  자식   extends   부모
public class Student extends Person{
	// Student 클래스에 Person 클래스 내용을 확장한다/연장한다
	// == Student 클래스에 Person 클래스의 
	//    필드, 메서드를 추가하여 확장한다
	
	// 속성
//	private String name;
//	private int age;
//	private String nationality;
	private int grade; 		// 학년
	private int classroom; 	// 반
	
	public Student() {
		// super();
	}
	
	public Student(String name, int age, String nationality, 
				int grade, int classroom) {
		
		// this.name = name;
		// this.age = age;
		// this.nationality = nationality;
		// 왜 안될까?
		// -> this 참조변수는 본인 자신만을 의미함
		// 부모의 고유 필드인 name, age, nationality는
		// this 가 참조하고있는 주소의 필드가 아니기 때문에
		// this 참조변수를 이용하여 직접 접근 불가!
	
		super(name, age, nationality); // 부모의 매개변수 생성자
		// super() 생성자 작성 시 생성자 메서드 내 
		// 반드시 첫번째 줄에 작성!
		
		/*
		setName(name);
		setAge(age);
		setNationality(nationality);
		setter 메서드를 이용하여 초기화 가능은 하나 비효율적 
		*/
		
		this.grade = grade;
		this.classroom = classroom;
	}



	//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getNationality() {
//		return nationality;
//	}
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	@Override
	public String toString() {
		// super. : super 참조변수
		// -> 상속관계에서 부모객체를 가리키는 참조변수
		return super.toString() // name + " / " + age + " / " + nationality
				+ " / " + grade + " / " + classroom;
	}
	
	
	
	
	
}
