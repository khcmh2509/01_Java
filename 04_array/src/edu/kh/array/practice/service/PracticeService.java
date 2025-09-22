package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	/*
	 * 실습문제 1 길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고
	 * 출력한 후 짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	 */
	public void practice1() {
		int[] arr = new int[9];

		int sum = 0; // 합계 저장용 변수

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

			if (i % 2 == 0) {
				sum += arr[i];
			}
		}

		System.out.println("\n짝수 번째 인덱스 합 : " + sum);

	}

	/*
	 * 실습문제 2 길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고
	 * 출력한 후 홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	 */
	public void practice2() {
		int arr[] = new int[9];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			// arr[0] = 9 - 0
			// arr[1] = 9 - 1
			// arr[2] = 9 - 2
			System.out.print(arr[i] + " ");

			if (i % 2 == 1) {
				sum += arr[i];
			}
		}

		System.out.println("\n홀수 번째 인덱스 합 : " + sum);

	}

	/*
	 * 실습문제 3 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	 */
	public void practice3() {

		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");

		}

	}

	/*
	 * 실습문제 4 정수 5개를 입력 받아 배열을 초기화 하고 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력. 배열에
	 * 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
	 */
	public void practice4() {

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("입력 %d : ", i);
			arr[i] = sc.nextInt();
		}

		System.out.print("검색할 값 : ");
		int search = sc.nextInt();

		boolean flag = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("인덱스 : " + i);
				flag = false; // 찾았다면 flag를 false로 변경
				break;
			}
		}

		if (flag) {
			System.out.println("일치하는 값이 존재하지 않는다.");
		}

	}

	/*
	 * 실습문제 5 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에
	 * 위치하는지 인덱스를 출력하세요. ex. 문자열 : application 문자 : i application에 i가 존재하는 위치(인덱스) :
	 * 4 8 i 개수 : 2
	 */
	public void practice5() {
		// 1. 사용자에게 문자열 입력받기
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		// 2. 사용자가 입력한 문자열을 하나하나 char 배열에 넣기
		// -> 사용자가 입력한 문자열의 길이만큼의 char 배열을 할당
		char[] arr = new char[str.length()];

		// 반복문을 통해 str.charAt(i) 값을 arr[i] 에 담는 과정
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		// 3. 문자 입력받기 (검색할 문자)
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		// String result = "";
		// 4. 검색할 문자가 문자열에 몇개가 존재하는지, 어느인덱스에 있는 파악
		int count = 0; // 검색할 문자가 몇개 들어있는지 세어줄 변수
		// 문자열에서 동일한 문자가 발견될때마다 1씩 증가

		// 반복문 수행 전 문자열 출력
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) :");

		// arr 배열의 인덱스마다 접근하기 위해 반복문 사용
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우
				System.out.print(i + " "); // 해당되는 인덱스 이어서 출력해주기(print)

				count++; // 그리고 count 값을 1 증가!
			}

		}

		System.out.println();
		System.out.println(ch + "개수 : " + count);

	}

	/*
	 * 실습문제 6 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 사용자가 직접 값을 입력하여
	 * 각각의 인덱스에 값을 초기화 하세요. 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
	 */
	public void practice6() {
		// 1. 사용자에게 값을 입력받고 그 값만큼 배열 선언 및 할당
		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		// 2. 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스값을 초기화하기
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}

		// 3. 전체 값 나열 및 총합 출력
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}

		System.out.println();
		System.out.println("총 합 : " + sum);

	}

	/*
	 * 실습문제 7 주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요. 단, char 배열 저장 시 성별을 나타내는 숫자 이후부터
	 * *로 저장하세요. [실행 화면] 주민등록번호(-포함) : 123456-1234567 123456-1******
	 */
	public void practice7() {

		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();

		char[] arr = new char[input.length()];

		for (int i = 0; i < arr.length; i++) {

			if (i <= 7) { // 7번 인덱스 이하 (생년월일, -, 성별)
				arr[i] = input.charAt(i);
			} else { // 8번 인덱스 이상부터는 *
				arr[i] = '*';
			}

			System.out.print(arr[i]);
		}

	}

	/*
	 * 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여
	 * 내림차순으로 값을 넣어 출력하세요. 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록
	 * 하세요.
	 */
	public void practice8() {

		while (true) {
			// 3 이상의 수가 입력 될 때 까지 무한 반복
			// -> 3 이상 홀수가 입력되면 원하는 코드 수행 후 break문 으로 종료 예정

			System.out.print("정수 : ");
			int input = sc.nextInt();

			if (input < 3 || input % 2 == 0) { // 3 미만 또는 짝수인 경우 -> 반복
				System.out.println("다시 입력하세요!");

			} else {
				// 입력 받은 정수 만큼의 크기를 가지는 배열 생성
				int[] arr = new int[input];

				int num = 0; // arr 배열에 대입될 값

				for (int i = 0; i < arr.length; i++) {

					// 요소에 값 대입하기
					if (i <= arr.length / 2) { // 중간 이전까지 -> 증가
						arr[i] = ++num;
					} else { // 중간 이후 -> 감소
						arr[i] = --num;
					}

					// 각 요소에 대입된 값 출력하기
					// 출력 시 , 추가 (단, 마지막 제외)
					if (i == arr.length - 1) { // 마지막 바퀴
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ", ");
					}

				} // for문끝

				break; // while 반복 멈춤

			}

		}

	}

	/*
	 * 실습문제 9 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고, 1~10 사이의 난수를 발생시켜 배열에 초기화한 후
	 * 출력하세요. [실행 화면] 발생한 난수 : 9 7 6 2 5 10 7 2 9 6
	 */
	public void practice9() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}

		System.out.print("발생한 난수 : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	/*
	 * 실습문제 10 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고, 1~10 사이의 난수를 발생시켜 배열에 초기화 후 배열 전체
	 * 값과 그 값 중에서 최대값과 최소값을 출력하세요. [실행 화면] 발생한 난수 : 5 3 2 7 4 8 6 10 9 10 최대값 : 10
	 * 최소값 : 2
	 */
	public void practice10() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);

			System.out.print(arr[i] + " ");
		}

		System.out.println();

		int max = 1; // 최대값을 담아줄 변수
		int min = 10; // 최소값을 담아줄 변수

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) { // 해당 인덱스의 값이 max보다 큰경우
				max = arr[i]; // 해당 값을 max 변수에 담아줌
			}

			if (arr[i] < min) { // 해당 인덱스의 값이 min보다 작은경우
				min = arr[i]; // 해당 값을 min 변수에 담아줌
			}

		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

	/*
	 * 실습문제 11 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에
	 * 초기화한 후 출력하세요.
	 */
	public void practice11() {
		// 1. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당
		int[] arr = new int[10];

		// 2. 1~10 사이의 난수를 발생시킨 값을 각 인덱스에 넣기(단, 중복없이)
		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 10 + 1);

			for (int j = 0; j < i; j++) { // 중복 제거용 for문

				if (arr[i] == arr[j]) { // 앞쪽 요소에 대입된 값을 현재 요소에 대입된 값과 비교
					i--;
					break;
				}
			}
		}

		// 3. 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	/*
	 * 실습문제 12 로또 번호 자동 생성기 프로그램을 만들기. 
	 * (중복 값 없이 오름차순으로 정렬하여 출력하세요.) 
	 * [실행 화면] 3 4 15 17 28 40
	 */
	public void practice12() {

		// 1. 크기가 6인 정수형 배열 선언 및 할당
		int[] lotto = new int[6];

		// 2. 배열에 중복값없이 1부터 45사이의 난수 초기화
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) { // 중복 제거
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			//System.out.print(lotto[i] + " "); // 이때는 정렬 전
		}
		
		Arrays.sort(lotto);

		// 4. 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

	/*
	 * 실습문제 13 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고 문자의 개수와 함께 출력하세요. (중복 제거)
	 * [실행화면] 문자열 : application 문자열에 있는 문자 : a, p, l, i, c, t, o, n 문자 개수 : 8
	 */
	// char 배열에 모든 글자 넣고, 중복값을 출력만 하지 않는 방식
	public void practice13() {
		// 1. 사용자에게 문자열 입력받기
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		// 2. 해당 문자열의 문자들을 char[]에 담기
		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		// 3. char 배열에서 중복값 존재할 경우 출력 X
		int count = 0; // 문자 개수 세기용 변수

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) {

			boolean flag = true; // 중복 체크용 flag 변수

			// 중복값이 있는지 검사하는 for
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					flag = false; // 중복 발생했을 때
					break;
				}

			}

			if (flag) { // 중복이 발생하지 않았을 경우

				// if문
				if (i == 0) { // 첫번째 글자
					System.out.print(arr[i]);
				} else { // 0번 인덱스가 아닌 글자
					System.out.print(", " + arr[i]);
				}

				count++; // 중복 아닐때만 count 갯수 늘리기

			}

		}

		System.out.println();
		System.out.println("문자 개수 : " + count);

	}

	// 처음부터 중복된 문자는 char 배열에 넣지 않는 방식
	public void practice13_2() {
		// 1. 사용자에게 문자열 입력받기
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		// 2. 중복 없이 저장할 char 배열 선언 (최대 str.length() 크기)
		char[] arr = new char[str.length()];
		int count = 0; // 실제로 배열에 저장된 문자 개수

		// 3. 문자열을 한 글자씩 탐색하면서 중복이 없으면 배열에 추가
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			boolean isDuplicate = false;

			// 4. 현재 문자가 이미 배열에 존재하는지 확인
			for (int j = 0; j < count; j++) {
				if (arr[j] == currentChar) {
					isDuplicate = true;
					break;
				}
			}

			// 5. 중복이 아니라면 배열에 추가
			if (!isDuplicate) {
				arr[count] = currentChar;
				count++;
			}
		}

		// 6. 결과 출력
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < count; i++) {
			if (i == 0) {
				System.out.print(arr[i]);
			} else {
				System.out.print(", " + arr[i]);
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);

	}

	/*
	 * 실습문제 14 사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고 배열의 인덱스에 넣을 값 역시 사용자가 입력하여
	 * 초기화 하세요. 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지, 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
	 * 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
	 * 
	 * 배열의 크기를 입력하세요 : 3 1번째 문자열 : 자바의 정석 2번째 문자열 : 알고리즘 3번째 문자열 : C프로그래밍 더 값을
	 * 입력하시겠습니까?(Y/N) : y 더 입력하고 싶은 개수 : 2 4번째 문자열 : 인간관계 5번째 문자열 : 자기계발 더 값을
	 * 입력하시겠습니까?(Y/N) : y 더 입력하고 싶은 개수 : 1 6번째 문자열 : 영단어600 더 값을 입력하시겠습니까?(Y/N) : n
	 * [자바의 정석, 알고리즘, C프로그래밍, 인간관계, 자기계발, 영단어600]
	 */
	public void practice14() {

		// 1. 첫 배열 크기 지정
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거

		String[] arr = new String[size];

		// 2. 첫 배열에 저장할 문자열 입력받기
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}

		// 3. 반복이 시작되는 구간부터 while 작성하여 내부에 종료조건 만들어서 break;
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
			char ch = sc.next().charAt(0);

			// 4. 값을 더 입력할 경우
			if (ch == 'y' || ch == 'Y') {

				// 5. 더 입력받을 개수 입력받기
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거

				// 6. 새로 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
				String[] newArr = new String[arr.length + addSize];

				// 7. 배열 복사 + 새로운 문자열 입력받기
				for (int i = 0; i < newArr.length; i++) {

					if (i < arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 (깊은복사)
						newArr[i] = arr[i]; // 기존 배열 요소 값 복사

					} else { // 인덱스의 크기가 기존배열 보다 클 경우 (새로운 값 입력받기)
						System.out.print((i + 1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}

				}

				// 8. 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입 (얕은 복사)
				// 더 입력? y
				// 위 코드를 반복할때 기존 배열인 arr의 길이를 기준으로
				// 새 배열(newArr)의 크기를 할당하기 때문에
				arr = newArr;

			} else if (ch == 'n' || ch == 'N') { // 값을 더 입력하지 않을 경우
				break; // while 반복문 종료

			} else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}

		}

		// 10. 배열값 모두 출력
		System.out.println(Arrays.toString(arr));

	}
	
}
