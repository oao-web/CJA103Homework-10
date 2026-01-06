package hw7;

public class Calculator {

	public int powerXY(int x, int y) throws CalException {
        if (x == 0 && y == 0) {
            throw new CalException("0的0次方沒有意義！");
        } else if (y < 0) {
            throw new CalException("次方為負值，結果回傳不為整數！");
        }
        
        // Math.pow 回傳的是 double，題目要求回傳 int所以需要做轉型。
        return (int) Math.pow(x, y);
    }
}
