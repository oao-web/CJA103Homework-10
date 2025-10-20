package hw1;

public class TestNineNine1{
	public static void main(String[] args) {
//1.使用for迴圈+while迴圈
		for (int i = 1; i <= 9; i++) {	
			int  j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
//2.使用for迴圈+do while迴圈		
		for (int i = 1; i <= 9; i++) {
			int  j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;			
			}
			while (j <= 9); 		
				System.out.println();	
		}
//3.使用while迴圈+do while迴圈
		int i = 1;
		while (i <= 9) {
			int  j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			while (j <= 9); 		
			System.out.println();
			i++;
			}
		//計算1~1000的偶數和 (2+4+6+8+...+1000)
		
		for (int r =2;r <= 1000;r+=2) {
			System.out.print(r +"  ");   
		}
		System.out.println();   
		int s = 1;
		for (int l = 1; l <= 10; l++) {
			s*=l;
		}
		System.out.print("1到10的連乘積為" +s);
		System.out.println();   
//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int d = 1,t = 1;
		while (t <= 10) {
		    d *= t;
		    t++;
		}System.out.print("1到10的連乘積為" +d);
		System.out.println();   
		//請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		
		for (int p = 1; p <= 10; p++) {
            int e = p * p;
            System.out.print(e);
            if (p < 10) {
                System.out.print(" ");
            }
            System.out.println();   
        }
		//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
		//請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?		
		
		int count = 0;
	        for (int x = 1; x <= 49; x++) {
	        	if (x/10==4 || x%10==4) {
	                continue; 
	            }
	            System.out.print(x + " ");
	            count++;
	        }
	        System.out.println("\n總共有 " + count + " 個號碼可以選擇。");
	        
	      
	        for (int y = 10; y >= 1; y--) {
	            for (int u = 1; u <= y; u++) {
	                System.out.print(u+"  ");
	            } 
	            System.out.println();   
	        }
	          
	        
	        
	        
	        for (int v = 1; v <= 6; v++) {
	            char letter = (char) ('A' + v - 1);
	            for (int k = 1; k <= v; k++) {
	                System.out.print(letter);
	            } 
	            System.out.println();   
	        }
	        
	        
	}
	}
	        
		
		

		

	

