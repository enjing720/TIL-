//실행 예외 처리
package kr.co.multicampus_2;

public class TryCatchFinallyRunTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행매개값의 수가 부족합니다.");
			System.out.println("=== 실행 방법 ===");
			System.out.println("java TryCatchFinallyRunTimeExceptionExample num1 num2");
			
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(data1 +"+" + data2 + "=" + result);
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
		} finally {
			System.out.println("=======================");
			System.out.println(" 다시 실행하세요");
		}
	}
}