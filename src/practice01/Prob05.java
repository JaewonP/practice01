package practice01;

public class Prob05 {

	public static void main(String[] args) {
		// 3, 6, 9 
		int n = 36;
		String s = String.valueOf(n); // 숫자를 문자로 만듬 
		
		System.out.println(s);
		
		int clapCount = 0;
		int length = s.length();
		for(int i=0; i < length; i++) {
			char c = s.charAt(i);
			if(c == '3' || c == '6' || c == '9') {
				clapCount++;
			}
		}// int count -> 결과 값에 따라 짝 
		
		
		System.out.println(clapCount);
		
		for( int j = 1; j <= clapCount; j++ ) {
			System.out.println("짝");
		}
	}
}
