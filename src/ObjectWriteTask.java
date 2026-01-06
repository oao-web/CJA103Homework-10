

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTask {
//	請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//			append功能讓每次執行結果都能被保存起來)
//
//			• 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//			代表的檔案會複製到第二個參數代表的檔案
//
//			• 請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//			意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
//
//			• 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//			型簡化本題的程式設計)
	public static void main(String[] args) {
        // 檢查並建立資料夾
        File dir = new File("C:\\data");
        if (!dir.exists()) {
            dir.mkdirs(); // 建立多層資料夾
        }

        // 建立物件
        Dog d1 = new Dog("小白");
        Dog d2 = new Dog("小黑");
        Cat c1 = new Cat("咪咪");
        Cat c2 = new Cat("花花");

        // 寫入檔案
        try (FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(d1);
            oos.writeObject(d2);
            oos.writeObject(c1);
            oos.writeObject(c2);
            
            System.out.println("物件已成功寫入 C:\\data\\Object.ser");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
