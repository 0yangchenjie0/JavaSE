//package Array;
//
//import java.util.Random;
//import java.util.Scanner;
//
////用户在控制台输出（1.石头 2.剪刀 3.布），系统随机出石头 剪刀 布，判断输赢！
//public class RockPaperScissors {
//    public static void main(String[] args) {
//        //生成随机数
//        Random api.random = new Random();
//        //输入
//        Scanner api.scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("请输入:1--石头/2--剪刀/3--布");
//
//            int i = api.scanner.nextInt();
//            System.out.println("你:" + input(i));
//
//            if (i == 1 || i == 2 || i == 3) {
//                int j = api.random.nextInt(3)+1;//[0,3)
//                System.out.println("电脑:" + input(j));
//                if ((i == 1 && j == 2) || (i == 2 && j == 3) || (i == 3 && j == 1)) {
//                    System.out.println("你赢了");
//                } else if (i == j) {
//                    System.out.println("平局");
//                } else {
//                    System.out.println("你输了");
//                }
//            } else {
//                System.out.println("输入有误");
//            }
//
//        }
//    }
//
////    public static String input(int i) {
////        return switch (i) {
////            case 1 -> "石头";
////            case 2 -> "剪刀";
////            case 3 -> "布";
////            default -> "";
////        };
////    }
////}


