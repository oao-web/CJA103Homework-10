package hw9;

import java.util.Objects;

public class Train {
//	• 請設計一個Train類別,並包含以下屬性:
//		- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//		- 目的地 dest,型別為String - 票價 price,型別為double
//		• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//		需使用的集合裡
//		- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
//		- (118, “自強”, “高雄”, “台北”, 500)
//		- (1288, “區間”, “新竹”, “基隆”, 400)
//		- (122, “自強”, “台中”, “花蓮”, 600)
//		- (1222, “區間”, “樹林”, 七堵, 300)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
	private int number;      // 班次
    private String type;     // 車種
    private String start;    // 出發地
    private String dest;     // 目的地
    private double price;    // 票價
    
    // 建構子
    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }
    
    // Getter 方法
    public int getNumber() {
        return number;
    }
    
    public String getType() {
        return type;
    }
    
    public String getStart() {
        return start;
    }
    
    public String getDest() {
        return dest;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Setter 方法
    public void setNumber(int number) {
        this.number = number;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setStart(String start) {
        this.start = start;
    }
    
    public void setDest(String dest) {
        this.dest = dest;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    // 覆寫 equals 和 hashCode 以支援去重複
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Train train = (Train) obj;
        return number == train.number &&
               Double.compare(train.price, price) == 0 &&
               Objects.equals(type, train.type) &&
               Objects.equals(start, train.start) &&
               Objects.equals(dest, train.dest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }
    
    @Override
    public String toString() {
        return String.format("班次:%d, 車種:%s, %s -> %s, 票價:%.0f元", 
                           number, type, start, dest, price);
    }
}
