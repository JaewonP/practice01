package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		
	//    System.out.println(text);

		// 중첩 for문 (Loop)
	    int length = text.length();
	    System.out.println(length);
	    
	 /*  
	    char c0 = text.charAt(0); // 메소드 사용 
	    char c1 = text.charAt(1);
	    char c2 = text.charAt(2);
	    
	    System.out.println(c0 + ":" + c1 + ":" + c2);
	   */ 
	    for (int i = 0; i < length ; i++ ) {
	    	for(int j = 0; j <= i ; j++) {
	    	char c = text.charAt(j);	
	    	System.out.print(c);
	    	}
	     System.out.print("\n");
	    }
	    
		scanner.close();
	}
}