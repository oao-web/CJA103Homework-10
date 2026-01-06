package hw9;

import java.util.*;

public class Train1 {
//	• 請寫一隻程式,能印出不重複的Train物件
//
//	• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
//
//	• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
//
//	• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
	// 建立測試資料
    public static List<Train> createTrains() {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
        trains.add(new Train(1254, "區間", "屏東", "基隆", 700));
        trains.add(new Train(118, "自強", "高雄", "台北", 500));
        trains.add(new Train(1288, "區間", "新竹", "基隆", 400));
        trains.add(new Train(122, "自強", "台中", "花蓮", 600));
        trains.add(new Train(1222, "區間", "樹林", "七堵", 300));
        trains.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 重複
        return trains;
    }
    
    // 第一題: 印出不重複的Train物件
    public static void printUniqueTrains() {
        System.out.println("========== 第一題:印出不重複的Train物件 ==========");
        List<Train> trains = createTrains();
        
        // 方法1: 使用 HashSet
        Set<Train> uniqueTrains = new HashSet<>(trains);
        
        System.out.println("\n方法1 - 使用迭代器 (Iterator):");
        Iterator<Train> iterator = uniqueTrains.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("\n方法2 - 使用 for-each:");
        for (Train train : uniqueTrains) {
            System.out.println(train);
        }
        
        System.out.println("\n方法3 - 使用傳統 for 迴圈 (轉換為List):");
        List<Train> uniqueList = new ArrayList<>(uniqueTrains);
        for (int i = 0; i < uniqueList.size(); i++) {
            System.out.println(uniqueList.get(i));
        }
    }
    
    // 第二題: 以班次編號由大到小印出
    public static void printTrainsSortedByNumber() {
        System.out.println("\n\n========== 第二題:班次編號由大到小印出 ==========");
        List<Train> trains = createTrains();
        
        // 使用 Comparator 進行排序
        trains.sort((t1, t2) -> Integer.compare(t2.getNumber(), t1.getNumber()));
        
        System.out.println("\n方法1 - 使用 for-each:");
        for (Train train : trains) {
            System.out.println(train);
        }
        
        System.out.println("\n方法2 - 使用傳統 for 迴圈:");
        for (int i = 0; i < trains.size(); i++) {
            System.out.println(trains.get(i));
        }
        
        System.out.println("\n方法3 - 使用迭代器:");
        Iterator<Train> iterator = trains.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    // 第三題: 班次編號由大到小且不重複印出
    public static void printUniqueSortedTrains() {
        System.out.println("\n\n========== 第三題:班次編號由大到小且不重複 ==========");
        List<Train> trains = createTrains();
        
        // 方法1: 使用 TreeSet 自動排序且去重複
        TreeSet<Train> sortedUniqueTrains = new TreeSet<>(
            (t1, t2) -> {
                int cmp = Integer.compare(t2.getNumber(), t1.getNumber());
                if (cmp == 0) {
                    // 如果班次相同，比較其他屬性確保完全相同的物件被去除
                    cmp = t1.getType().compareTo(t2.getType());
                    if (cmp == 0) cmp = t1.getStart().compareTo(t2.getStart());
                    if (cmp == 0) cmp = t1.getDest().compareTo(t2.getDest());
                    if (cmp == 0) cmp = Double.compare(t1.getPrice(), t2.getPrice());
                }
                return cmp;
            }
        );
        sortedUniqueTrains.addAll(trains);
        
        System.out.println("\n方法1 - 使用 for-each:");
        for (Train train : sortedUniqueTrains) {
            System.out.println(train);
        }
        
        // 方法2: 先去重複再排序
        System.out.println("\n方法2 - 使用迭代器:");
        Set<Train> uniqueSet = new HashSet<>(trains);
        List<Train> uniqueList = new ArrayList<>(uniqueSet);
        uniqueList.sort((t1, t2) -> Integer.compare(t2.getNumber(), t1.getNumber()));
        
        Iterator<Train> iterator = uniqueList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        System.out.println("\n方法3 - 使用傳統 for 迴圈:");
        for (int i = 0; i < uniqueList.size(); i++) {
            System.out.println(uniqueList.get(i));
        }
    }
    
    public static void main(String[] args) {
        // 執行三個小題
        printUniqueTrains();
        printTrainsSortedByNumber();
        printUniqueSortedTrains();
    }
}
