package api.date;

import java.util.Date;

/*
Date类：表示时间的类

    构造方法
        public Date( )：将当前时间封装为Date日期对象。
        public Date(long date)  将时间毫秒值转换成Date日期对象。

    常见方法
        long getTime( )：返回1970年1月1日00:00:00到对象封装时间的毫秒数。
        void setTime(long time)：根据给定的毫秒值设置现有的 Date 对象。

 */
public class DateDemo01 {
    public static void main(String[] args) {
        //将当前时间封装为 Date对象
        Date date1 = new Date();
        System.out.println(date1);//Mon Apr 17 20:11:48 CST 2023

        //把时间值转换为 Date对象
        Date date2 = new Date(0L);
        System.out.println(date2);//Thu Jan 01 08:00:00 CST 1970

        //增加 1 秒
        Date date3 = new Date(1000L);
        System.out.println(date3);//Thu Jan 01 08:00:01 CST 1970

        System.out.println(date1.getTime());//1681733508104
        System.out.println(date2.getTime());//0
        System.out.println(date3.getTime());//Thu Jan 01 08:00:00 CST 1970


        //将时间毫秒值转换成Date日期对象。
        Date date4 = new Date(); //此刻时间
        date4.setTime(0L);      //修改时间
        //<=> Date date = new Date(0L)

        System.out.println(date4);////Thu Jan 01 08:00:00 CST 1970
    }
}
