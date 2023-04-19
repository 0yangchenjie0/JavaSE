package Array;

//1.定义一个int类型的数组，初始化值为 1 - 100。打印输出每个下标对应的值
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[100];                  // 定义一个int类型的数组，长度是100
        // 通过for循环，遍历数组所有元素
        for (int i = 0; i < arr.length; i++) {     // 通过length属性，获取数组元素的个数
            // 给数组赋值
            arr[i] = i + 1;
            // 通过下标获取数组中的元素
            System.out.println("第" + (i + 1) + "个元素值:" + arr[i]);
        }




        //        获取10个学生的成绩，然后保存在数组中，最后计算学生的总分和平均分。
//         分析：长度10
//         数据类型 double
        double[] scores = {93, 95.5, 102, 106.5, 150, 136, 140, 108, 82.5, 66};
        System.out.println(scores.length);

        double total = 0.0;    //定义一个变量存储分数
        for (int i = 0; i < scores.length; i++) {   //循环遍历每个分数
            total += scores[i];    //累加分数
        }
        System.out.println("总分为"+total);
        System.out.println("平均分为"+total / scores.length);    //分数除以数组长度计算平均分




    }
}



