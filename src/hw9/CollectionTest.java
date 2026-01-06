package hw9;

import java.util.*; 
import java.math.BigInteger;

public class CollectionTest {
//	請建立一個Collection物件並將以下資料加入:
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
//
//		• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//		• 移除不是java.lang.Number相關的物件
//		• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
	public static void main(String[] args) {
        // 建立 Collection 物件 (使用 ArrayList 實作)
        List<Object> list = new ArrayList<>();

        // 加入資料
        list.add(100);                    // Integer(100)
        list.add(3.14);                   // Double(3.14)
        list.add(21L);                    // Long(21L)
        list.add(Short.parseShort("100")); // Short("100")
        list.add(5.1);                    // Double(5.1)
        list.add("Kitty");                // String
        list.add(100);                    // Integer(100)
        list.add(new Object());           // Object 物件
        list.add("Snoopy");               // String
        list.add(new BigInteger("1000")); // BigInteger("1000")

        // 印出所有元素
        System.out.println("--- 原始集合內容 ---");
        
        // 使用 Iterator
        System.out.print("Iterator: ");
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " | ");
        }
        System.out.println();

        // 傳統 for 迴圈
        System.out.print("傳統 for: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " | ");
        }
        System.out.println();

        // foreach 迴圈
        System.out.print("foreach : ");
        for (Object obj : list) {
            System.out.print(obj + " | ");
        }
        System.out.println();

        // 移除不是 java.lang.Number 相關的物件
        // 注意：在遍歷中移除元素，建議使用 Iterator 的 remove() 以避免 ConcurrentModificationException
        Iterator<Object> itRemove = list.iterator();
        while (itRemove.hasNext()) {
            Object obj = itRemove.next();
            // 如果物件不是 Number 類別或其子類別，就移除
            if (!(obj instanceof Number)) {
                itRemove.remove();
            }
        }


        System.out.println("\n--- 移除非 Number 物件後的內容 ---");
        for (Object num : list) {
            System.out.println(num + " (型別: " + num.getClass().getSimpleName() + ")");
        }
    }
}
