/* ����Ŀ��� �ڵ� Ÿ�� ��ȯ */ 
package kr.co.multicampus_2;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;  //compile Error
		
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; //compile Error
		
		int intValue2 = charValue1 + charValue2;
		System.out.println("uniCode =" + intValue2 );
		System.out.println("��¹��� =" + (char)intValue2 );
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10/4.0 // compile Error
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);

	}

}