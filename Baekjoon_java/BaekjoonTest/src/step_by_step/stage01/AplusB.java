package step_by_step.stage01;

import java.util.Scanner;

// 1000번 : A+B
/* 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. 
 		 Given two integers A and B, calculate their sum.
 */
public class AplusB {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
			int a, b;
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println(a+b);
		sc.close();
	}
}	

	/* Another code..1
	  public static void main(String args[]){ 
	  	Scanner sc = new Scanner(System.in);
			int a = sc.nextInt(); 
			int b = sc.nextInt(); 
			int sum = a+b;
			System.out.println("A+B =" + sum);
			sc.close();
			}
	 */
	/* Another code..2
		public static void main(String args[]){
	 		Scanner sc = new Scanner(System.in); 
	 		
	 		System.out.print("정수 A 입력 : ");
	 		int a = scaaner.nextInt();
	 		
	 		System.out.print("정수 B 입력 : ");
	 		int b = scaaner.nextInt();
	 
	 		int sum = a+b;
	 		System.out.println("A+B =" + sum);
	 		sc.close();
			}
	 */

