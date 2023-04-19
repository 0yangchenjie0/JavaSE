package oop.phone;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        //创建一个手机类的实例
        Phone iPhone = new Phone();

        //给属性赋值
        iPhone.brand = "iPhone";
        iPhone.kind = "iPhone 13 Pro 128G";
        iPhone.color = "远峰蓝";
        iPhone.price = 7999;
        iPhone.stock = 1000;

        //打印产品说明
        iPhone.introduce();//调用方法

        //从键盘接收购买数量
        Scanner sc = new Scanner(System.in);

        //重复购买
        while (true) {
            System.out.println("请输入购买数量");
            int num = sc.nextInt();
            //检查库存是否充足
            //获取付款金额
            //库存不足时跳出循环 结束购买
            if (iPhone.checkStock(num)) iPhone.pay(num);
            else break;
        }
    }
}

