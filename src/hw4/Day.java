package hw4;

import java.util.Scanner;

public class Day {
//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("輸入年份(yyyy): ");
		int year = a.nextInt();
		System.out.println("輸入月份(mm) ");
		int month = a.nextInt();
		System.out.println("輸入日期(dd): ");
		int day = a.nextInt();
		int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			daysInMonth[1] = 29;
		}
		int dayofYear = 0;
		for (int i = 0; i< month -1; i++) {
			dayofYear += daysInMonth[i];
		}
		dayofYear += day;
		System.out.println("輸入的日期為該年第 " + dayofYear + " 天");
		a.close();
	} 
        
}
