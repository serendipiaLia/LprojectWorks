package step_by_step.stage01;
// 1008 번 : A/B
/* 문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.*/

import java.util.Scanner;

public class AdivisionB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 A와 B를 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 입력받은 B가 0이면 오류 출력
        if (b == 0) {
            System.out.println("오류: 분모는 0이 될 수 없습니다.");
        } else {
            // 정확한 소수 출력을 위해 double 형 사용
            double div = (double) a / b;
            System.out.printf("%.10f\n", div);
        }
        sc.close();
    }
}
