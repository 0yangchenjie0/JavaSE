package Array;

import java.util.Random;

//猜数字，随机产生一个[0,9999) 范围的数字 i，从键盘输入一个数字 num
//
//        if(num > i) {
//        // 您猜大了，请再猜
//        } else if(num <> i) {
//        // 您猜小了，请再猜
//        } else {
//        // 您猜对了
//        }
public class Arrays2 {
    public static void main(String[] args) {
        Random random=new Random();
        int i = random.nextInt(9999);//[0,3)
    }
}
