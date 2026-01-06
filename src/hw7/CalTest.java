package hw7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            try {
                System.out.print("請輸入x的值: ");
                int x = sc.nextInt();
                
                System.out.print("請輸入y的值: ");
                int y = sc.nextInt();

                int result = cal.powerXY(x, y);
                System.out.println(x + "的" + y + "次方等於" + result);
                break; // 成功得到結果，跳出迴圈

            } catch (InputMismatchException e) {
                System.out.println("輸入格式不正確！");
                sc.nextLine(); // 清除掉 Scanner 緩衝區中錯誤的字串，避免無限迴圈
            } catch (CalException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
