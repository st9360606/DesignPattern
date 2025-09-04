package com.example.principles.inversion.improve;

/**
 * 七大設計原則
 * 依賴倒轉原則
 */

//分析 : 如果我們獲取的對象是 多個 EX 微信 LINE Google ... 則新增類，同時Person也要新增相應的接收方法
//解決 : 引入一個抽象接口(IReceiver)，表示接受者，這樣Person類 與 接口(IReceiver) 發生依賴
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Weixin());
    }
}

interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    public String getInfo() {
        return "電子郵件內容 : Hello World !";
    }
}

class Weixin implements IReceiver {
    public String getInfo() {
        return "微信內容 : Hello World !";
    }
}

class Person {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}


