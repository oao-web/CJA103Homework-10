package hw4;

public class TestScores {
//	班上有8位同學,他們進行了6次考試結果如下:請算出每位同學考最高分的次數
	 public static void main(String[] args) {
	        int[][] score = {
	            {10, 35, 40, 100, 90, 85, 75, 70}, 
	            {37, 75, 77, 89, 64, 75, 70, 95}, 
	            {100, 70, 79, 90, 75, 70, 79, 90},
	            {77,95 ,70 ,89, 60, 75, 85, 89},
	            {98, 70, 89, 90, 75, 90, 89, 90},
	            {90, 80, 100, 75, 50, 20, 99, 75}  
	        };
	        int a = 8;
	        int s = 6;
	        int[] d = new int[a];
	        for (int i = 0; i < s; i++) {
	            int max = score[i][0];
	            for (int j = 1; j < a; j++) {
	                if (score[i][j] > max) {
	                    max = score[i][j];
	                }
	            }
	            for (int j = 0; j < a; j++) {
	                if (score[i][j] == max) {
	                    d[j]++;
	                }
	            }
	        }
	        for (int i = 0; i < a; i++) {
	            System.out.println("同學 " + (i+1) + " 考最高分的次數: " + d[i]);
	        }
	    }
}
