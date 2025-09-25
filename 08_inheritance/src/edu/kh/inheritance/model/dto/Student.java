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
	
	public Student() {}
	
	public Student(String name, int age, String nationality, int grade, int classroom) {
		super();
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
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
	
	
	
}
