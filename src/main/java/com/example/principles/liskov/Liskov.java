package com.example.principles.liskov;

/**
 * 七大設計原則
 * 里氏替換原則
 * 處理繼承的問題
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3= " + a.func1(11, 3));
        System.out.println("1-8= " + a.func1(1, 8));

        System.out.println("--------------------");
        B b = new B();
        System.out.println("11-3= " + b.func1(11, 3));
        System.out.println("1-8= " + b.func1(1, 8));
        System.out.println("11+3+9= " + b.func2(11, 3));
    }
}


class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {
    //因為B已經重寫父類A的方法了
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}