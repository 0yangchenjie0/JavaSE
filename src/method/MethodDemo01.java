package method;

//设计一个方法用于打印两个数中的较大数
public class MethodDemo01 {
    public static void main(String[] args) {
        double result = getMax(1024, 1007);
        System.out.println(result);
    }

    public static double getMax(int num01, int num02) {
        double max = num01 > num02 ? num01 : num02;
        return max;
    }

}
