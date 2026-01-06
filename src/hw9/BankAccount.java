package hw9;

public class BankAccount {
    private int balance = 0;  // 帳戶餘額
    
    // 媽媽存錢 (synchronized 確保執行緒安全)
    public synchronized void deposit(int amount) {
        // 如果餘額超過 3000，媽媽暫停匯款
        while (balance > 3000) {
            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
            try {
                wait();  // 等待熊大提款
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // 存錢
        balance += amount;
        System.out.println("媽媽存了" + amount + "，帳戶共有:" + balance);
        
        // 通知熊大帳戶有錢了
        notify();
    }
    
    // 熊大提款 (synchronized 確保執行緒安全)
    public synchronized void withdraw(int amount) {
        // 如果餘額低於要提款的金額，熊大暫停提款
        while (balance < amount) {
            System.out.println("熊大看到帳戶沒錢，暫停提款");
            System.out.println("媽媽被熊大要求匯款!");
            try {
                wait();  // 等待媽媽存錢
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("熊大被老媽告知帳戶已經有錢!");
        }
        
        // 提款
        balance -= amount;
        System.out.println("熊大領了" + amount + "，帳戶共有:" + balance);
        
        // 如果餘額在 2000 以下，要求媽媽匯款
        if (balance <= 2000) {
            System.out.println("熊大看到餘額在2000以下，要求匯款");
            notify();  // 通知媽媽匯款
        }
    }
    
    public static void main(String[] args) {
        // 建立共享的銀行帳戶物件
        final BankAccount account = new BankAccount();
        
        // 建立媽媽執行緒
        Thread momThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    account.deposit(2000);  // 每次存 2000
                }
            }
        });
        
        // 建立熊大執行緒
        Thread bearThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    account.withdraw(1000);  // 每次領 1000
                }
            }
        });
        
        // 啟動兩個執行緒
        momThread.start();
        bearThread.start();
        
        // 等待兩個執行緒完成
        try {
            momThread.join();
            bearThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}