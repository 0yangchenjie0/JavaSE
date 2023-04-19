package Loops;

//从任意一个数字开始报数，当要报的数字包含7或者是7的倍数的时候说”过“。
public class Ever7Over {
    public static void main(String[] args) {
        //获取1~1000的数
        for (int num = 1; num <= 1000; num++) {
            //      7的倍数             个位=7          十位是7              百位是7
            if (num % 7 == 0 || num % 10 == 7 || num / 10 == 7 || (num / 100) % 10 == 7) {
                System.out.println("pass");
            } else {
                System.out.println(num);
            }
        }
    }
}
