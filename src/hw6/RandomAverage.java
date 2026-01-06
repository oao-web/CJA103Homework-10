package hw6;

import javax.xml.stream.XMLOutputFactory;

public class RandomAverage {
//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
//	int i ;
//	i = (int)(Math.random()*100);
	
	private static void randAvg() {
	    int[] nums = new int[10];
	    int sum = 0;

	    System.out.print("亂數：");

	    for (int i = 0; i < nums.length; i++) {
	        nums[i] = (int) (Math.random() * 101); // 0~100
	        System.out.print(nums[i] + " ");
	        sum += nums[i];
	    }

	    double avg = sum / 10.0;   // 平均值要用 double 才不會被整數除法截掉
	    System.out.println("\n平均值：" + avg);
	}
	public static void main(String[] args) {
	    randAvg();
	}


}
