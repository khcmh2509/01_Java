package edu.kh.io.pack1.model.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileService {
	/* File 클래스
	 *
	 * - java.io 패키지
	 *
	 * - 파일/디렉토리(폴더)를 관리하는 클래스
	 *   (파일/디렉토리 존재 유무 관계 없음)
	 *
	 * - 파일 생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공
	 *
	 * - File 클래스 메서드
	 *
	 * boolean  mkdir()          : 디렉토리 생성
	 * boolean  mkdirs()         : 경로상의 모든 디렉토리 생성
	 * boolean  createNewFile()  : 파일 생성
	 * boolean  delete()         : 파일/디렉토리 삭제
	 * String   getName()        : 파일 이름 반환
	 * String   parent()         : 파일이 저장된 디렉토리 반환
	 * String   getPath()        : 전체 경로 반환
	 * boolean  isFile()         : 현재 File 객체가 관리하는게 파일이면 true
	 * boolean  isDirectory()    : 현재 File 객체가 관리하는게 디렉토리 true
	 * boolean  exists()         : 파일/디렉토리가 존재하면 true, 아님 false
	 * long     length()         : 파일 크기 반환
	 * long     lastModified()   : 파일 마지막 수정일 (1970.01.01 09:00 부터 현재까지 지난 시간을 ms 단위로 반환)
	 * String[] list()          : 디렉토리 내 파일 목록을 String[] 배열로 반환
	 * File[]   listFiles()     : 디렉토리 내 파일 목록을 File[] 배열로 반환
	 */
	
	/* [개발자 상식!]
	 *
	 * OS : 운영 체제
	 *
	 *  (Windows)    /     (Linux, Mac)
	 *    폴더       /      디렉토리
	 *
	 * - 경로 표기 방법(하위 폴더, 파일 표시)
	 *
	 * 백슬래시 (\, Windows)     -> C:\workspace\01_Java
	 * 슬래시   (/, Linux, Mac ) -> C:/workspace/01_Java
	 *
	 *
	 * - Java 언어의 특징 : 플랫폼(OS)에 독립적
	 * -> OS 관계 없이 똑같은 코드 작성이 가능
	 *
	 * -> 이 특징을 유지하기 위해 /, \ 둘다 호환 가능
	 *   (런타임 시 실행되는 OS에 맞게 자동으로 변경)
	 *
	 *
	 * -------------------------------------------------------------
	 *
	 * - 경로 표기 방법
	 *
	 * 1) 절대 경로 : 하나의(절대적인) 기준으로 부터
	 * 				 목표까지의 경로를 모두 표기하는 방법
	 *
	 * - 기준
	 * [Windows] :   C:/  , D:/
	 * [Linux, Mac] : /Users ,   /
	 *
	 *
	 * 2) 상대 경로 : 현재 위치를 기준으로 목표까지의 경로를 표기하는 방법
	 *
	 *
	 * */
	
	/** 
	 * File 클래스로 객체 생성
	 * + 폴더가 존재하지 않으면 원하는 경로에 폴더를 생성
	 */
	public void method1() {
		
		// C:/io_test/20251014 폴더를 지정
		// 제일 앞에 "/" 시작의 의미 : 현재 실행중인 프로젝트의 루트 디렉토리
		// (== 최상위 폴더 : root, 절대 경로의 기준점)
		// 즉, 드라이브를 의미함.
		
		// 절대경로 작성법 :
		// 명시적으로 맨앞에 C: , D: 라고 작성 시 해당 드라이브에 폴더 생성됨
		// C:
		//  ㄴ io_test
		//        ㄴ 20251014
		
		// 상대경로 작성법 : 
		// io_test/20251014 작성 시 해당 프로젝트가 현재 위치!! 
		// 해당 프로젝트 안에 io_test/20251014 이 생성됨
		// 현재 프로젝트 : 12_io
		//					 ㄴ io_test
		//							ㄴ 20251014
		
		File directory = new File("/io_test/20251014");
		
		// 폴더가 존재하지 않으면 생성
		if( !directory.exists() ) {
			// 폴더를 모두 생성
			directory.mkdirs();
			
			System.out.println(directory.getName());
			System.out.println(directory.getPath());
		}
		
		
	}
	
	
	/**
	 * File 객체를 이용해서 지정된 위치에 파일 생성하기
	 */
	public void method2() {
		
		// 문자열에서 "\" 는 이스케이프 문자로 사용됨
		// -> 역슬래시 자체를 문자로 사용하고 싶을땐 2개를 사용
		// -> \\
		File file = new File("\\io_test\\20251014\\파일생성.txt");
		
		if( !file.exists() ) { // 존재하지 않으면
			// 파일 생성
			
			// File 클래스의 메서드는 대부분 IOException 발생시킴
			// -> IOException는 반드시 예외처리를 해야하는 Checked Exception
			// -> 예외 처리 필수!
			
			try {
				if(file.createNewFile()) { // 파일이 정상 생성된 경우
					System.out.println(file.getName() + " 파일이 생성됨.");
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	
	/**
	 * File 클래스 제공 메서드 활용하기
	 */
	public void method3() {
		
		// File 객체 생성
		File directory = new File("\\workspace\\01_Java\\12_io");
		
		// 지정된 경로에 있는 모든 파일/디렉토리를 File[] 형태로 얻어오기
		File[] files = directory.listFiles();
		
		// 향상된 for문
		for(File f : files) {
			
			// 파일명
			String fileName = f.getName(); // 파일 이름 조회 메서드
			
			// 마지막으로 수정한 날짜
			long lastModified = f.lastModified(); // 17351253124
			
			// java.text.SimpleDateFormat 
			// : 간단히 날짜 형식을 지정할 수 있는 객체
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
													// 2025-10-14 오후 12:30
			// String SimpleDateFormat.format(long) :
			// 매개변수 long 값을 지정된 패턴 형식으로 변환하여 
			// 문자열 형태로 반환 메서드
			String date = sdf.format(lastModified);
			
			// 파일 유형
			String type = null;
			if(f.isFile()) type = "파일";
			else		   type = "폴더";
			
			// 파일 크기(byte)
			String size = f.length() + "B";
			if(f.isDirectory()) size = ""; // 폴더라면 사이즈 빈문자열로 변경
			// -> 폴더 크기를 구하는 메서드는 따로 존재하지 않음
			// -> 구하려면 폴더안의 모든 파일을 순회하여 각 파일 크기 합산하여 사용
			
			String result = String.format("%-20s %-20s %-5s %10s", 
						fileName, date, type, size);
			
			System.out.println(result);
		}
		
	}
	
	
	


	
}
