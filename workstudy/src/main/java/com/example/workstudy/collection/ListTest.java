package com.example.workstudy.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTest {
    /**
     * 平时开发中研究源码
     * ArrayList
     * 数组转为集合：Arrays.asList(), 静态内部类ArrayList 没有重写add(),remove()方法，抛出UnsupportedOperationalException
     * 集合转为数组：list.toArray(), 需要调用有参构造函数
     * 当传入的数组大小小于 新建一个空数组进行复制
     * 等于
     * 大于 大于size的元素都置为null
     * 排序算法：timSort
     * JDk在1.7版本中使用TimSort排序替代了之前的归并排序，
     * 归并排序的解释：一个元素是有序的，两个元素，两个元素有序后，归并为4个元素有序，再向上归并
     * 插入排序的解释：从后向前，两两进行比较，
     * 归并排序的优化：减少归并次数
     * 采用二分法排序，减少元素检索次数
     * fail-fast 机制和 fail-safe机制
     * Java util 包下的集合采用的都是fail-fast机制
     * expectedModCount ModCount 两个值是否一致，不一致抛出CurrentModificationException
     * 内存中的实时ModCount和遍历运行中的expectedModCount是否一致
     *
     * foreach 遍历元素采用的游标 和size的值是否一致
     * current 包下的元素采用的是COW机制，Copy-On-Write
     * 如果发生新增或者修改操作，会复制一个新数组进行操作，然后将原来的引用指向现在的数据
     * CAP Consistency 一致性， Availability 可用性 Partition tolerance 分区容错  这3者之间的冲突
     * Copy - on - Write 中存在的问题
     * list中新增大量数据是进行，批量操作,
     * list数据一致性，查看不到最新的数据
     *
     */

    private static  final  int COUNT = 100*100*100;

    public static void main(String[] args) {
        List<Double> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < COUNT; i++) {
            list.add(i*1.0);//影响性能很恐怖啊，
        }
        Arrays.asList();
        Double[] doubles =  new Double[COUNT+10];
        list.toArray(doubles);
        for (Double doublea : doubles) {
            System.out.println(doublea);
        }
        List<List> lists = new LinkedList<>();
        lists.add(list);
    }
}
