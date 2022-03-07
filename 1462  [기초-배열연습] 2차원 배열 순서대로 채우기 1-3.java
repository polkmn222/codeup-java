
/*
다음과 같은 n*n 배열 구조를 출력해보자.

입력이 3인 경우 다음과 같이 출력한다.
1 4 7
2 5 8
3 6 9

입력이 5인 경우는 다음과 같이 출력한다.
1 6 11 16 21
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25

입력이 n인 경우의 2차원 배열을 출력해보자.
 */

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[][] b = new int[a][a];
		int c = 1;
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b.length; j++) {
				b[i][j] += c;
				System.out.print(b[i][j] + " ");
				c+=a;
			}
			c=i+2;
			
			System.out.println();
		}
			
	}
		
}	
	

