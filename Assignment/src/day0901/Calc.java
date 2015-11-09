package day0901;

public class Calc {
	
	public static void calc(int[] ia) {
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i : ia) {
			if (i%2==0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		
		System.out.println(123);
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 : " + evenSum);
	}

	public static void main(String[] args) {
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
		int[] ib = new int[]{1,2,3,4,5};
		
		//Prob18 p = new Prob18();
		System.out.println("( 배열 ia )");
		Calc.calc(ia);
		System.out.println("( 배열 ib )");
		Calc.calc(ib);
	}

}
