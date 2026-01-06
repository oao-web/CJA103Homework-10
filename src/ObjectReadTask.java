import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectReadTask {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            System.out.println("--- 開始讀取物件並執行 speak() ---");
            
            while (true) {
                try {
                    // 利用多型：將讀出的物件向上轉型為 Animal 介面 (需先讓兩者實作 Animal)
                    // 如果沒定義 Animal，這裡就必須用 Object 並搭配 instanceof
                    Object obj = ois.readObject();
                    
                    if (obj instanceof Dog) {
                        ((Dog) obj).speak();
                    } else if (obj instanceof Cat) {
                        ((Cat) obj).speak();
                    }
                    
                } catch (EOFException e) {
                    break; // 讀完檔案，跳出迴圈
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}