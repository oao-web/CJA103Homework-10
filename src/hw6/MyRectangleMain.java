package hw6;

public class MyRectangleMain {
	    public static void main(String[] args) {
	        // (1) 使用無參數建構子
	        MyRectangle rect1 = new MyRectangle();
	        rect1.setWidth(10);
	        rect1.setDepth(20);
	        System.out.println("rect1 面積：" + rect1.getArea());

	        // (2) 使用帶參數建構子
	        MyRectangle rect2 = new MyRectangle(10, 20);
	        System.out.println("rect2 面積：" + rect2.getArea());
	    }
}


