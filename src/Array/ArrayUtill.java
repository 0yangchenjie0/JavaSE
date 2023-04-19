package Array;

public class ArrayUtill {
    /**
     * 获取数组中的最大值
     *
     * @param arr 传入的数组
     * @return 最大值
     */
    static int getMaxValueInAarry(int[] arr) {
        //假设第一个元素就是最大值
        int max = arr[0];
        //遍历数组，获取到每一个元素
        for (int i = 1; i < arr.length; i++) {
            //逐个比较
            if (arr[i] > max) {
                //记录更大的元素
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取数组中的最小值
     *
     * @param arr 传入的数组
     * @return 最大值
     */
    public static int getMinValueInArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 数组求和
     *
     * @param arr 传入的数组
     * @return 和
     */
    public static int getSumValueInArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    /**
     * 获取数组中的平均值
     *
     * @param arr 传入的数组
     * @return 平均值
     */
    public static double getAvgValueInMarry(int[] arr) {
//        double avg = 0;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            avg = (sum * 1.0) / arr.length;
//        }
//        return avg;
        int sum = getSumValueInArray(arr);
        double avg = (sum * 1.0) / sum;
        return avg;
    }
}




