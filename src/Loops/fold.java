package Loops;

//一张A4纸厚度是0.104mm，珠穆朗玛峰8848.86m,
//假设A4纸可以无限折叠，问折叠多少次可以大于或者等于珠穆朗玛峰高度！
public class fold {
    public static void main(String[] args) {
        //珠穆朗玛峰高度
        double zmlmf = 8848680;
        //纸张厚度
        double paper = 0.104;
        //计数器 计算折叠次数
        int count = 0;
        //因为要反复折叠,所以要使用循环,又因为循环次数不确定,所以适合使用while.
        while (paper < zmlmf) {
            //每次折叠纸张的厚度加倍
            paper *= 2;
            //累加折叠次数
            count++;
        }
        //打印计数器的值.
        System.out.println("需要折叠:" + count + "次");

        double i = 0.104;
        int count2 = 0;
        do {
            i *= 2;
            count2++;
            //纸张厚度 mm 除以一千 换算成 m
        } while (i / 1000 < 8848.86);
        System.out.println("count=" + count2);
    }
}

