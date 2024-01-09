package step_by_step.stage01;

import java.util.Scanner;

// 1001번 : A-B
/* 문제 : 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오. */
public class AminusB {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
			int	a = sc.nextInt();
			int	b = sc.nextInt();
			int sum = a-b;
			System.out.println(sum);
		sc.close();
	}
}	
