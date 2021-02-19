package com.example.workstudy.jdk;

public class SortStudy {

    public static void main(String[] args) {

        int[] ints = {12,1,23,45,67,12};
        int[] intsSort = insertSort(ints);
        for (int i = 0; i < intsSort.length; i++) {
            System.out.println(intsSort[i]);
        }

        int[] chooseSort = chooseSort(ints);
        for (int i = 0; i < chooseSort.length; i++) {
            System.out.println(chooseSort[i]);
        }

        int[] bubblingSort = bubblingSort(ints);
        for (int i = 0; i < bubblingSort.length; i++) {
            System.out.println(bubblingSort[i]);
        }
    }

    /**
     * 直接插入排序
     * 两个以上排序
     * 第i+1位和之前的所有位置的元素进行比较，并进行交换位置
     * 稳定性
     * @param ints
     */
    public static int[] insertSort(int[] ints ){
        for (int i = 1; i < ints.length; i++) {
            int smallTemp = ints[i];
            int j = i - 1;
            while (j >= 0 && smallTemp < ints[j]){
                ints[j+1] = ints[j];
                j = j-1;
            }
            ints[j+1] = smallTemp;
        }
        return ints;
    }

    /**
     * 选择排序
     * 不稳定
     * 数组中找到合适的元素放置到合适的位置
     * 比如第一小放到第一位，第二小放到第二小
     *
     * @param ints
     * @return
     */
    public static int[] chooseSort(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            //放置元素的位置
            int smallTamp = i;
            for (int j = i+1; j < ints.length; j++) {
                if (ints[j] < ints[i]){
                    smallTamp = j;//第i小的元素位置
                }
            }
            swap(ints, i, smallTamp);
        }
        return ints;
    }

    private static void swap(int[] ints, int i, int smallTamp) {
        int choose = ints[i];
        ints[i] = ints[smallTamp];
        ints[smallTamp] = choose ;
    }

    /**
     * 冒泡排序
     * 进行n-1轮两两比较交换
     * 标志位：是否发生逆序对交换，默认false
     * @param ints
     * @return
     */
    public static int[] bubblingSort(int[] ints){
        for (int i = 0; i < ints.length; i++) {
            boolean swap = false;
            for (int j = ints.length-1; j >i ; j--) {
                if (ints[j] < ints[j-1]){
                    swap(ints,j-1,j);
                    swap = true;
                }
            }
            if (swap == false){
                return ints;
            }
        }
        return ints;
    }
}
