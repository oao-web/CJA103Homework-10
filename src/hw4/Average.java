package hw4;

public class Average {
//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素(提示:陣列,length屬性)
	public static void main(String[] args) {
	int[] a = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
        sum += a[i];
    }
    double average = (double) sum / a.length;
    System.out.println("平均值: " + average);
    System.out.print("大於平均值的元素: ");
    for (int i = 0; i < a.length; i++) {
        if (a[i] > average) {
            System.out.print(a[i] + " ");
        }
    }
	}
}

