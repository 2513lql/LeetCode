package com.lql.leetcode;

/**
 * Created by LQL on 2016/3/10.
 * ��һ���Ǹ���������λ�������ظ��Ӻͣ������Ϊһ��һλ��ʱ���򷵻ء�
 * num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */
public class AddDigits {


    public static void main(String []a){
        System.out.println(addDigits(0));
    }

    public static int addDigits(int num){
        String str = String.valueOf(num);
        if(str.length() == 1){
            return num;
        }

        char[] nums = str.toCharArray();
        int sum = 0;
        for(char c : nums){
            int tmp = Integer.valueOf(String.valueOf(c));
            sum += tmp;
        }

        return addDigits(sum);
    }

}
