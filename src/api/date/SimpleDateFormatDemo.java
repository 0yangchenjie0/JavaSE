package api.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
用于日期格式化
    构造方法
        public SimpleDateFormat（）：使用默认格式创建一个日期格式化对象
        public SimpleDateFormat(String pattern)：使用指定格式创建一个日期格式化对象

    格式化方法
        public final String format(Date date)：将日期对象格式化成日期字/时间字符串
        public Date parse(String source)：将日期字符串转换成日期对象
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {

//        将日期字符串转换成日期对象
        String today = "2023/4/18";
//        使用指定格式创建一个日期格式化对象。
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");//日期字符串需要和日期格式相匹配
//        调用parse 将传入的字符串转换成Date日期对象
        Date date = format.parse(today);// A/t + Enter 抛出异常
        System.out.println(date);

    }

    private static void method() {
        //使用默认格式创建一个日期格式化对象
        //SimpleDateFormat format=new SimpleDateFormat();

        //使用指定格式创建一个日期格式化对象。
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss E a");

        //创建Date对象，封装此刻时间
        Date date = new Date();

        //将日期对象，转换为字符
        String result = format.format(date);

        System.out.println(result);//23-4-17 下午9:23
        System.out.println(result);//2023/04/17 21:25:13 星期一 下午
    }
}
