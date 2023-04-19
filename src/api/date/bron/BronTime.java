package api.date.bron;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
需求：计算你来到了这个世界多少天
分析：
    1.键盘录入用户的生日（日期字符串）
    2.创建SimpleDateFormat对象，指定模式，用于将日期字符串解析为Date日期对象（birthdayDate）
    3.创建Date日期对象，封装此刻的时间（todayDate）
    4.long time = todayDate.getTime()-birthdayDate.getTime();
    5.将毫秒值转换为天的单位。
 */


public class BronTime {
    public static void main(String[] args) throws ParseException {
        //1.键盘录入用户的生日（日期字符串）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日：xxxx年xx月xx日 xx时xx分xx秒");
        String birthday = sc.nextLine();

        //2.使用指定格式创建一个日期格式化对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        //将日期字符串转换成日期对象
        Date birthdayDate = simpleDateFormat.parse(birthday);

//        3.创建Date日期对象，封装此刻的时间（todayDate）
        Date today = new Date();

        //活了多少毫秒
        long time = today.getTime() - birthdayDate.getTime();

//
        System.out.println(time / 1000 / 60 / 60 / 24 / 365);//年
        System.out.println(time / 1000 / 60 / 60 / 24 /30);//月
        System.out.println(time / 1000 / 60 / 60 / 24 );//日
        System.out.println(time/1000/60/60);//时
        System.out.println(time/1000/60);//分
    }
}
