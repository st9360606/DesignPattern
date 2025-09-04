package com.example.principles.interface_isolation.improve;

/**
 * 七大設計原則
 * 接口隔離原則
 */
public class Segregation2 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B()); // A類 通過接口去依賴B類
        a.depend2(new B()); // A類 通過接口去依賴B類
        a.depend3(new B()); // A類 通過接口去依賴B類

        C c = new C();
        c.depend1(new D()); // C類 通過接口去依賴D類
        c.depend4(new D());
        c.depend5(new D());
    }
}

//接口
interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}


class B implements Interface1, Interface2 {
    public void operation1() {
        System.out.println("B 實現了 operation1");
    }

    public void operation2() {
        System.out.println("B 實現了 operation2");
    }

    public void operation3() {
        System.out.println("B 實現了 operation3");
    }
}

class D implements Interface1, Interface3 {
    public void operation1() {
        System.out.println("D 實現了 operation1");
    }

    public void operation4() {
        System.out.println("D 實現了 operation4");
    }

    public void operation5() {
        System.out.println("D 實現了 operation5");
    }
}

// A Class 通過接口 Interface1,Interface2 使用 B class ，但只會用到1,2,3方法
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}

// C Class 通過接口 Interface1,Interface3 使用 D class ，但只會用到1,4,5方法
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend4(Interface3 i) {
        i.operation4();
    }

    public void depend5(Interface3 i) {
        i.operation5();
    }
}