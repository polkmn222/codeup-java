/*
두 수를 입력받아 비트단위로 OR연산한 후 결과를 출력하시오.

참고)

비트연산자 | 은 주어진 2개의 값을 2진법으로 변환한 뒤, 비트별로 OR 연산을 수행한 뒤 결과를 출력한다.

이러한 비트 연산을 OR 연산이라고도 부르고, |로 표시한다.

예)

7 : 0000 0111

4 : 0000 0100

7|4 : 0000 0111
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a|b);
	}

}
