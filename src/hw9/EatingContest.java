package hw9;


import java.util.Random;

public class EatingContest implements Runnable {
//	• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//	• 參考範例:CounterRunnable.java
//	• 需留意主執行緒執行順序
//	答案是:-----大胃王快食比賽開始!-----
//	饅頭人吃第一碗飯
//	詹姆士吃第一碗飯
//	饅頭人吃第二碗飯
//	詹姆士吃第二碗飯
//	饅頭人吃第3碗飯
//	詹姆士吃第3碗飯
//	饅頭人吃第4碗飯
//	詹姆士吃第4碗飯
//	饅頭人吃第5碗飯
//	詹姆士吃第5碗飯
//	饅頭人吃第6碗飯
//	詹姆士吃第6碗飯
//	饅頭人吃第7碗飯
//	詹姆士吃第7碗飯
//	饅頭人吃第8碗飯
//	詹姆士吃第8碗飯
//	饅頭人吃第9碗飯
//	饅頭人吃第10碗飯
//	詹姆士吃第9碗飯
//	饅頭人吃完了 !
//	詹姆士吃第10碗飯
//	詹姆士吃完了 !
//-----大胃王快食比賽結束!-----
    private String name;        // 參賽者名稱
    private int bowls = 10;     // 要吃的碗數
    private Random random;      // 亂數產生器
    
    // 建構子
    public EatingContest(String name) {
        this.name = name;
        this.random = new Random();
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= bowls; i++) {
            try {
                // 產生 500~3000 毫秒的隨機延遲時間
                int sleepTime = random.nextInt(2501) + 500;  // 2501 = 3000-500+1
                Thread.sleep(sleepTime);
                
                // 輸出吃飯訊息
                if (i == 1) {
                    System.out.println(name + "吃第1碗飯");
                } else if (i == 2) {
                    System.out.println(name + "吃第2碗飯");
                } else if (i == 3) {
                    System.out.println(name + "吃第3碗飯");
                } else {
                    System.out.println(name + "吃第" + i + "碗飯");
                }
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // 吃完所有碗後輸出完成訊息
        System.out.println(name + "吃完了 !");
    }
    
    public static void main(String[] args) {
        System.out.println("-----大胃王快食比賽開始!-----");
        
        // 建立兩個競賽者物件
        EatingContest contestant1 = new EatingContest("饅頭人");
        EatingContest contestant2 = new EatingContest("詹姆士");
        
        // 建立兩個執行緒
        Thread thread1 = new Thread(contestant1);
        Thread thread2 = new Thread(contestant2);
        
        // 啟動兩個執行緒
        thread1.start();
        thread2.start();
        
        // 主執行緒等待兩個執行緒都完成
        try {
            thread1.join();  // 等待饅頭人完成
            thread2.join();  // 等待詹姆士完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("-----大胃王快食比賽結束!-----");
    }
}