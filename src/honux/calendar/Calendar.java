package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public int getmaxDaysOfMonth(int month) { 
		return MAX_DAYS[month - 1];
	}
	
	/**
	 * - 월을 입력하면 해당월의 달력을 출력한다.
	 * - 달력은 모양을 1단계에서 작성한 모양으로 만든다.
	 * - 1일은 일요일로 정해도 무방하다.
	 * - -1을 입력받기 전까지 반복 입력받는다.
	 * - 프롬프트를 출력한다.
	 */
	
	public void printSampleCalendar() {
		System.out.println("  일    월    화    수    목    금    토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
		
	public static void main(String[] args) {

		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("달을 입력하세요");
		int month = scanner.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d월은 %d일까지 있습니다. \n",  month, cal.getmaxDaysOfMonth(month));
		
		cal.printSampleCalendar();
		scanner.close();
	}

}
