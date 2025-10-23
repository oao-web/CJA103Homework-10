package hw2;

import java.util.Scanner;

public class test {
	public static void main(String[] args){
//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形
		Scanner sc = new Scanner (System.in);
        System.out.println("請輸入3個數字");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
        	if (a == b && b == c) {
                System.out.println("正三角形");
            } else if (a == b || a == c || b == c) {
                System.out.println("等腰三角形");
            } else {
                System.out.println("其它三角形");
            }
        } else { 
        	System.out.println("不是三角形");
        	}
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息
		int r1 = (int)(Math.random()*10);
		
        System.out.println("請輸入");
        int data1 = sc.nextInt();
        if (data1 == r1) {
            System.out.println("正確！");
        } else {
            System.out.println("錯誤，答案是：" + r1);
        }

//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數
        System.out.println("輸入不想要的數字：");
        int z = sc.nextInt();
        if (z < 1 || z > 9) {
            System.out.println("輸入1到9的數字");
            return;
	}
        System.out.println("可以選擇的號碼：");
        int count = 0;
        for (int i = 1; i <= 49; i++) {
        	 if (!String.valueOf(i).contains(String.valueOf(z))) {
                 System.out.print(i + " ");
                 count++;
             }
         }
        System.out.println();
        System.out.println("總數有: " + count );
}
	}
	
