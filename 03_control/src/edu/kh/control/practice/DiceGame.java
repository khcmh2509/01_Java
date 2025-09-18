package edu.kh.control.practice;

import java.util.Scanner;

// While문 중첩해서 쓰는 방법
public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int totalTries = 0;   // 전체 시도 횟수
        int correctTries = 0; // 정답 맞힌 횟수
        boolean running = true; // 전체 게임 실행 여부

        System.out.println("=== 주사위 맞히기 게임 시작 ===");
        System.out.println("1~6 사이 숫자를 맞혀보세요. (종료하려면 \"종료\" 입력)");

        while (running) { // 전체 게임이 실행중 일 때
            // 새로운 주사위 숫자 생성
            int answer = (int)(Math.random() * 6 + 1);

            boolean guessed = false; // 이번 라운드 정답 여부

            while (!guessed && running) { // guessed가 false이고(아직 맞추지 못했고, 게임을 종료하지 않은경우)
            	// !guessed : guessed가 가진 값 자체는 false인데 조건식에 사용하면 수행되지 못하니 
            	// !(부정연산자)사용하여 조건식에서만 true값으로 변경하여 수행되도록 함
                System.out.print("숫자 입력 >> ");
                String input = sc.next();
               
                // 종료 조건
                if (input.equals("종료")) {
                    running = false; // 전체 게임 종료를 위해 false로 변경
                    break; // 안쪽 while(이번 라운드)의 반복 종료를 위해 break
                }

                // 입력이 숫자인지 검증
                if (!input.matches("[0-9]+")) { // 숫자가 아니면
                    System.out.println("잘못된 입력입니다. 숫자(1~6)나 '종료'를 입력하세요.");
                    continue;
                }

                int guess = Integer.parseInt(input); // 입력한 input 값을 정수형태로 변경
                // input 에 "종료"가 아닌 "1" 같은 문자열 형태로 숫자가 들어가있음
                // Integer.parseInt(input) 진행 시 변수 guess에는 정수형 1로 변환되어 저장됨

                // 숫자 범위 검증
                if (guess < 1 || guess > 6) {
                    System.out.println("잘못된 입력입니다. 1~6 사이 숫자를 입력하세요.");
                    continue;
                }

                // 시도 횟수 증가
                totalTries++;

                // 정답 비교
                if (guess == answer) {
                    System.out.println("정답입니다! 🎉");
                    correctTries++;
                    guessed = true; // 이번 라운드 종료
                    System.out.println("새로운 주사위 숫자가 생성되었습니다.\n");
                } else if (guess < answer) {
                    System.out.println("틀렸습니다. 더 큰 수를 입력하세요.");
                } else {
                    System.out.println("틀렸습니다. 더 작은 수를 입력하세요.");
                }
            }
        }

        // 게임 종료 후 결과 출력
        System.out.println("\n=== 게임 종료 ===");
        System.out.println("총 시도 횟수: " + totalTries + "번");
        System.out.println("정답 횟수: " + correctTries + "번");

        if (totalTries > 0) {
            int accuracy = (correctTries * 100) / totalTries;
            System.out.println("정답률: " + accuracy + "%");
        } else {
            System.out.println("게임을 플레이하지 않았습니다.");
        }

	}
}
