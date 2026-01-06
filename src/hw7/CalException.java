package hw7;

public class CalException extends Exception {
    public CalException(String message) {
        super(message);
    }
}
//	請設計三個類別Calculator.java,CalException.java與CalTest.java,在Calculator.java裡有個自訂
//	方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。 CalTest.java執行後,使用者可
//	以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:
//	1. x與y同時為0,(產生自訂的CalException例外物件)
//	2. y為負值,而導致x的y次方結果不為整數
//	3. x與y皆正確情況下,會顯示運算後結果
//	1.請輸入x的值:0請輸入y的值:0  0的0次方沒有意義! 請輸入x的值:2請輸入y的值:4 2的4次方等於16
//	2.請輸入x的值:2請輸入y的值:-1  次方為負值，結果回傳不為整數! 請輸入x的值:2請輸入y的值:4 2的4次方等於16
//	3.請輸入x的值:abc 輸入格式不正確! 請輸入x的值:2請輸入y的值:4 2的4次方等於16
	
	
	
