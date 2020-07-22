/**
 * 题目描述
输入两个整数 a,b，输出它们的和（|a|,|b|<= 10^9）。

注意

Pascal 使用 integer 会爆掉哦！
有负数哦！
C/C++ 的 main 函数必须是 int 类型，而且最后要 return 0。这不仅对洛谷其他题目有效，而且也是 NOIP/NOI/CSP 比赛的要求！
好吧，同志们，我们就从这一题开始，向着大牛的路进发。

任何一个伟大的思想，都有一个微不足道的开始。

输入格式
两个整数以空格分开。

输出格式
一个整数。

https://www.luogu.com.cn/problem/P1001
 */



package luogu;

import java.io.*;
import java.util.*;
public class P1001 {
    public static void main(String args[]) throws Exception {
        Scanner cin=new Scanner(System.in);
        int a = cin.nextInt(), b = cin.nextInt();
        System.out.println(a+b);
    }
}