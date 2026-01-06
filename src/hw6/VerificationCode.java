package hw6;

public class VerificationCode {
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:
//	本次隨機產生亂碼為:GLSe3X81
	    public static String genAuthCode() {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"    // 大寫字母
	                     + "abcdefghijklmnopqrstuvwxyz"    // 小寫字母
	                     + "0123456789";                  // 數字

	        StringBuilder code = new StringBuilder();
	        for (int i = 0; i < 8; i++) {
	            int index = (int)(Math.random() * chars.length());
	            code.append(chars.charAt(index));
	        }

	        return code.toString();
	    }

	    // 測試 main()
	    public static void main(String[] args) {
	        String authCode = genAuthCode();
	        System.out.println("本次隨機產生亂碼為: " + authCode);
	    }
	
}
