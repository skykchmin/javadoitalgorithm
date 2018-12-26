package chapter1;

public class Quiz1_12 {

	public static void main(String[] args) {
		System.out.println(""+"|");
		for(int k =1; k <=9; k++) {
			System.out.print(k+"\t");
		}
		System.out.println();
		
		System.out.println("---+-----------------");
		int result = 0;
		for (int i = 1; i <= 9; i++) {
			System.out.print(i+"|");
			for(int j =1;j <=9; j++) {
				result = i*j;
				System.out.print(result+"\t");
			}
			System.out.println();
		}

	}

}
   