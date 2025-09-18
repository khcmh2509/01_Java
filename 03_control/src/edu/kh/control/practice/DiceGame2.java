package edu.kh.control.practice;

import java.util.Scanner;

//While문 한번만 쓰는 방법
public class DiceGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTries = 0;    // 전체 시도 횟수
        int correctTries = 0;  // 정답 횟수
        boolean running = true;

        int answer = (int)(Math.random() * 6) + 1;

        System.out.println("=== 주사위 맞히기 게임 시작 ===");
        System.out.println("1~6 사이 숫자를 맞혀보세요. (종료하려면 \"종료\" 입력)");

        while (running) {
            System.out.print("숫자 입력 >> ");
            String input = sc.next();

            // 종료
            if (input.equals("종료")) {
                running = false;
                break;
            }

            // 숫자 검증
            if (!input.matches("[0-9]+")) {
                System.out.println("잘못된 입력입니다. 숫자(1~6)나 '종료'를 입력하세요.");
                continue;
            }

            int guess = Integer.parseInt(input);

            // 범위 검증
            if (guess < 1 || guess > 6) {
                System.out.println("잘못된 입력입니다. 1~6 사이 숫자를 입력하세요.");
                continue;
            }

            // 시도 증가
            totalTries++;

            // 판정
            if (guess == answer) {
                System.out.println("정답입니다! 🎉");
                correctTries++;
                // 다음 라운드: 새 정답 생성 (단일 while 유지 포인트)
                answer = (int)(Math.random() * 6) + 1;
                System.out.println("새로운 주사위 숫자가 생성되었습니다.\n");
            } else if (guess < answer) {
                System.out.println("틀렸습니다. 더 큰 수를 입력하세요.");
            } else {
                System.out.println("틀렸습니다. 더 작은 수를 입력하세요.");
            }
        }

        // 결과
        System.out.println("\n=== 게임 종료 ===");
        System.out.println("총 시도 횟수: " + totalTries + "번");
        System.out.println("정답 횟수: " + correctTries + "번");
        if (totalTries > 0) {
            int accuracy = (correctTries * 100) / totalTries;
            System.out.println("정답률: " + accuracy + "%");
        } else {
            System.out.println("게임을 플레이하지 않았습니다.");
        }

        sc.close();
    }
}
