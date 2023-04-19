package Array;

import java.util.Random;

//产生10个1~100之间的随机数并找出最小值
public class RandomArray {
    public static void main(String[] args) {

        Random r = new Random();
        int[] randomNums = new int[10];
        //遍历数组 填充随机数
        int min = 101; //(int) (1.0 / 0.0);
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = r.nextInt(100) + 1;
            if (randomNums[i] < min) {
                min = randomNums[i];
            }
            //打印产生的随机数
            System.out.print(randomNums[i] + " ");
        }
        System.out.println("\n" + min);
    }
}
