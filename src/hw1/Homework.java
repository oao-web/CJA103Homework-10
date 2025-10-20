package hw1;

public class Homework {
	
	public static void main(String[]args) {
		
		int a=6 ,b=12;
		
		System.out.println("和: "+ (a+b));
		
		System.out.println("積: "+a*b);
		
		int egg = 200,dozen = 12;
						
		System.out.println("一共"+egg / dozen+"打"+egg % dozen+"顆");
		
		int z= 256559, min =60, hr =60*60, day=24*60*60;
		int d= z/day,c= z%day,h= c/hr,m=c%hr/min,s=c%min;
		
		System.out.println(d+"天"+h+"小時"+m+"分"+s+"秒");
		
			
		final double pi = 3.1415,w= 5.0;
		
		System.out.println("半徑為"+w+"的圓");
		System.out.println("圓面積 ="+pi*w*w);
		System.out.println("圓周長 ="+2*pi*w);
		
	
		double e=1_500_000.0,r= 0.02;
		int t = 10;
		double money = e *Math.pow(1+r,t);
		System.out.println("本金加利息共:"+money);
		
		System.out.println(5+5);//兩個都是整數，所以執行的是數值加法，直接加總得10
		System.out.println(5+'5');/*'5'是字元常數，在java中被視為Unicode編碼值，
		字元'5'的Unicode編碼是53，所以執行的是5+53=58，型別還是整數*/
		System.out.println(5+"5");/*"5"是字串，java會自動進行字串轉型與串接
		，5被轉成"5"，在和右邊的"5"串接起來，答案是"55"*/
		
		
		
		
		
		
	}
	
}
