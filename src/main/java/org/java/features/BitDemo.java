package org.java.features;

public class BitDemo {
	public static void main(String[] args) {
		
		byte x = 3;							//0011, 0010, 1100  1101
		byte y = 2;
		int r;
		
		r = x & y;						// & (AND) : both 1 -> 1, either 0 -> 0
		System.out.println(r);
		
		r = x | y;						// | (OR) : either 1 -> 1
		System.out.println(r);
		
		r = ~x;							// ~ (NOT) : 1 -> 0, 0 -> 1 					?
		System.out.println(r);
		
		r = x ^ y;						// ^ (XOR) : 1,0 -> 1, otherwise 0
		System.out.println(r);
		
		r = x << 2; 					// << (left shift) : 2 bit left   (put 0 for the empty)
		System.out.println(r);
		
		r = x >> 2;						// >> (right shift) : 2 bit right (put the same digit with first one for the empty)
		System.out.println(r);
		
		r = x >>> 2;					// >>> (logical right shift) :2 bit right (put 0 for the empty)
		System.out.println(r);
		
		byte a = 10;  // 00001010
	    byte b = 9;   // 00001001
	    byte c = 1;  //시프트할 칸수
	    System.out.println(a + " & " + b + " = " + (a&b));  //논리합
	    System.out.println(a + " | " + b + " = " + (a|b));  //논리곱
	    System.out.println(a + " ^ " + b + " = " + (a^b));  //배타적 논리합(xor)
	    
	    System.out.println("~10 = " + (~a));  //a 의 보수(반전)
	    System.out.println(a + " << " + c + " = " + (a<<c));  //왼쪽 1비트 시프트(뒤를 0 으로 채움)
	    System.out.println(a + " >> " + c + " = " + (a>>c));  //오른쪽 1비트 시프트(앞을 밀리기전 첫째자리와 동일한 비트로 채움)
	    System.out.println(a + " >>> " + c + " = " + (a>>>c)); //오른쪽 1비트 논리 시프트(앞을 0 으로 채움)
	    System.out.println(-1 * a + " >> " + c + " = " + (-1*a >> c));
	
	
	}
	
}
