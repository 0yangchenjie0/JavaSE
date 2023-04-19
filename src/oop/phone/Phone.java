package oop.phone;

//在控制台输出手机的产品信息
//根据购买数量获取手机的应付款金额
 public class Phone {
    String brand;//品牌
    String kind;//型号
    String color;//颜色
    double price;//价格
    int stock;//库存

    /**
     * 产品说明
     */
    //类的成员方法中是可以访问类的成员变量的。
    void introduce() {
        System.out.println("品牌" + brand);
        System.out.println("型号" + kind);
        System.out.println("颜色" + color);
        System.out.println("价格" + price);
        System.out.println("库存" + stock);
    }

    // 检查库存是否充足 充足返回 true 不足返回false
    boolean checkStock(int buyNum) {
        if (stock - buyNum >= 0) {
            System.out.println("库存充足");
            return true;
        }
        System.out.println("库存不足");
        return false;
    }

    // 根据购买数量获取手机的应付款金额
    double getPayable(int buyNum) {
        return price * buyNum;
    }

    //付款
    //获取商品总价
    void pay(int buyNum) {
        double totalPrice = getPayable(buyNum);
        //扣减库存
        stock -= buyNum;
        System.out.println("剩余" + stock);
        System.out.println("付款成功 您购买了" + buyNum + "台" + brand + "手机，" + "共支付了" + totalPrice + "元");
    }









    public  void call(String name) {
        System.out.println("打电话给" + name);
    }

    public void sendMessage(String name) {
        System.out.println("发短信给"+name);
    }

    public static void main(String[] args) {
      Phone a =new Phone();
      a.sendMessage("jack");
      a.call("rose");

    }
}



