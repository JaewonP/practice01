package practice01;

public class Prob05 {

	public static void main(String[] args) {
		// 3, 6, 9 
		//int n = 36;
		for(int raise_num = 1; raise_num <= 100; raise_num++)
		{
			
			String s = String.valueOf(raise_num); // 숫자를 문자로 만듬 
			
			int clapCount = 0;
			int length = s.length();
			for(int i=0; i < length; i++) {
				char c = s.charAt(i);
				if(c == '3' || c == '6' || c == '9') {
					clapCount++;
				}
			}// int count -> 결과 값에 따라 짝 
			
			
			for( int j = 1; j <= clapCount; j++ ) {
				System.out.println(s + "짝");	
			
		}
			// System.out.println(clapCount);
			// System.out.println(s);
}
	}
}
