package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*
		 * a. 입력 받은 숫작 홀수/인 경우, /0부터 입력 값까지 /홀수의 합 출력 
		 * 
		 * b. 입력 받은 숫자가 짝수 인 경우, 0부터 입력 값까지 짝수의 합 출력
		 */
		int a = scanner.nextInt();
	//	int b = scanner.nextInt();
		
		if(a%2 == 1) {

			    int sum = 0;
				for(int result = 0; result <= a; result++ )
				{
					if(result%2 == 0) {
						continue;
					}
					sum = sum + result;
					System.out.println(sum);				
			}
				
			
		  
		}

		scanner.close();
		
	}

}
