package com.lql.leetcode;

/**
 * Created by LQL on 2016/3/10.
 * LeetCode �е�ȡ����Ϸ�㷨
 */
public class NimGame {

    public static void main(String []a){
        System.out.println(canWin(4));
    }


    public static boolean canWin(int n){

        if(n % 4 == 0){
            return false;
        }

        return true;
    }



}
