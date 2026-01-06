package hw4;

public class StringArray {
//	• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
	public static void main(String[] args) { 
		 String[] a = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		 String s = "aeiou";
		 int count = 0;
		 for (String A : a) {
			 for(char c :A.toCharArray()) {
				 //toCharArray()作用是把一個字串轉換成一個字元陣列 (char[])。
				 //如"hello" 變成 {'h', 'e', 'l', 'l', 'o'}
			 if(s.contains(String.valueOf(c))) {
				 //String.valueOf()把其他資料型態轉成字串
				 count++;
			 }
			 }
		 }     
	        System.out.println("總母音數量: " + count);
}
}