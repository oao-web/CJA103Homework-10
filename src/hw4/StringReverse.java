package hw4;

public class StringReverse {
//	請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH(提示:String方法,陣列)
	public static void main(String[] args) {	
		char[] charArray = {'H','e','l','i','o',' ','W','o','r','l','d' };
    	String result = "";
    	for (int i = charArray .length- 1; i >= 0; i--) {
    		result += charArray[i];
    	}
    	System.out.println(result);
    	
	}
	
}
