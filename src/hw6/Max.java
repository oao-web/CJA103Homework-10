package hw6;

public class Max {
//	利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳,如圖:
//	int[][] intArray = {
//			{1,6,3},
//			{9,5,2}
//	};
//	double[][] doubleArray = {
//			{1.2, 3.5, 2.2},
//			{7.4, 2.1, 8.2}
//	};
//	Work03 w = new Work03();
//	System.out.println(w.maxElement(intArray));
//	System.out.println(w.maxElement(doubleArray));
	    // 找 int[][] 最大值
	    public int maxElement(int[][] x) {
	        int max = x[0][0];

	        for (int i = 0; i < x.length; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                if (x[i][j] > max) {
	                    max = x[i][j];
	                }
	            }
	        }
	        return max;
	    }

	    // 找 double[][] 最大值（Overloading）
	    public double maxElement(double[][] x) {
	        double max = x[0][0];

	        for (int i = 0; i < x.length; i++) {
	            for (int j = 0; j < x[i].length; j++) {
	                if (x[i][j] > max) {
	                    max = x[i][j];
	                }
	            }
	        }
	        return max;
	    }
	    public static void main(String[] args) {

	        int[][] intArray = {
	                {1, 6, 3},
	                {9, 5, 2}
	        };

	        double[][] doubleArray = {
	                {1.2, 3.5, 2.2},
	                {7.4, 2.1, 8.2}
	        };

	        Max w = new Max();

	        System.out.println(w.maxElement(intArray));    
	        System.out.println(w.maxElement(doubleArray)); 
	    }
}

