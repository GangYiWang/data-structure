package com.wgy.datastructure.recursion;

/**
 * Created by wanggy on 2021/6/28.
 *  求一个数的乘方
 * @author wanggy
 */
public class QuickPower {

    public double power(double x, int y) {
        return  y >= 0 ? quickPower(x, y) : 1.0 / quickPower(x, -y);
    }


    /**
     *
     * @param x 底数
     * @param y 大于或等于0的指数
     * @return x的y次方
     */
    public double quickPower(double x, int y) {
        if (y == 0) {
            return 1;
        }
        return y % 2 == 0 ? quickPower(x * x, y / 2) : quickPower(x * x, y / 2) * x;
    }

    public static void main(String[] args) {
        QuickPower power = new QuickPower();
        System.out.println(power.power(3, 4));
    }
}
