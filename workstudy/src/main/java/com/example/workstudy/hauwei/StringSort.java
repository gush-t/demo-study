package com.example.workstudy.hauwei;



import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringSort {
    /**
     * 问题分析，分解
     * 1.接收输入字符串，并将两个字符串进行拼接
     * 2.奇数位元素进行从小到大排序，并进行奇数位放置，偶数同理
     * 2.1 首先获取奇数或者偶数位的元素，并将其拼接为字符串
     * 2.2 将字符串转换为数组进行排序，然后将其排序后的元素放置到对应的位置上
     *
     * 3.遍历字符串，如果字符串在0~9，A~F ,a~f 之间，将元素
     *  3.1将字符转换为10进制，10进制转换为2进制
     *  3.2 2进制数据补全，倒序
     *  3.3将2进制转换为10进制，将10进制转换为16进制
     * 4.将字符进行拼接
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String origenStr  = scanner.nextLine();
            origenStr = origenStr.replace(" ","");
            //拼接元素采用StringBuffer，线程安全并且没有频繁创建String,String不可变，用final修饰
            StringBuffer oddStr = new StringBuffer();
            StringBuffer evenStr = new StringBuffer();
            String[] strings =  origenStr.split("");
            for (int i = 0; i < strings.length; i++) {
                if(i%2 ==0){//奇数
                    oddStr.append(strings[i]);
                }else {//偶数
                    evenStr.append(strings[i]);
                }
            }
            //排序后结果采用数组形式返回，进行放置
            String[] oddArray =  sortStringBuffer(oddStr);
            String[] evenArray =  sortStringBuffer(evenStr);
            int odd = 0;
            int even =0;
            StringBuffer sortStr  = new StringBuffer();
            for (int i = 0; i < origenStr.length(); i++) {
                if (i%2 == 0){// 奇数
                    sortStr.append(oddArray[odd]);
                    odd++;
                }else {// 偶数
                    sortStr.append(evenArray[even]);
                    even++;
                }
            }
            //对排好序的元素进行进制转换处理
            //System.out.println(sortStr.toString());
            StringBuffer resultStr = new StringBuffer();
            char[] sortStrArray = sortStr.toString().toCharArray();
            for (int i = 0; i < sortStrArray.length; i++) {
                if(matchString(sortStrArray[i])){
                    Integer numberHex = Integer.valueOf(String.valueOf(sortStrArray[i]),16);
                    String binary = Integer.toBinaryString(numberHex);
                    int appendNumber = 4-binary.length();
                    StringBuffer binaryBuffer = new StringBuffer();
                    for (int j = 0; j < appendNumber; j++) {
                        binaryBuffer.append("0");
                    }
                    binaryBuffer.append(binary);
                    binaryBuffer = binaryBuffer.reverse();
                    Integer numberBinary = Integer.valueOf(binaryBuffer.toString(),2);
                    String hex = Integer.toHexString(numberBinary);
                    resultStr.append(hex.toUpperCase());
                }else {
                    resultStr.append(sortStrArray[i]);
                }
            }
            System.out.println(resultStr.toString());
        }
    }

    /**
     * 判断字符串元素是否是需求中的元素
     * @param s
     * @return
     */
    private static boolean matchString(char s) {
        if ( (s>='0' && s <= '9')
            || (s >= 'A' && s<= 'F')
                ||(s >= 'a' && s <= 'f')){
            return true;
        }
        return false;
    }

    /**
     * 字符串排序，并返回排好序的字符数组
     * @param oddStr
     * @return
     */
    private static String[] sortStringBuffer(StringBuffer oddStr) {
        String[] strArray = oddStr.toString().split("");
        Arrays.sort(strArray);
        return strArray;
    }
}
