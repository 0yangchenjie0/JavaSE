package api.random;

import java.util.Random;
import java.util.Scanner;
//猜数字小游戏
public class GuessNumber {
    public static void main(String[] args) {
        gussnumber();
    }

    public static void gussnumber() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        //使用 Random 产生一个1~100之间的随机数
        int randomNumber = r.nextInt(100) + 1;
        //System.out.println(randomNumber);         //破解版..

        while (true) {
            //使用 Scanner 从键盘录入猜的数字
            System.out.println("请输入数字：");
            int scannerNumber = sc.nextByte();

            //对比
            if (scannerNumber > randomNumber) {
                System.out.println("猜大了");
            } else if (scannerNumber < randomNumber) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你猜对了！");
                break;
            }
        }
    }
}
