package com.example.principles.inversion;

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
    }
}

class Email {
    public String getInfo() {
        return "電子郵件內容 : Hello World !";
    }
}

class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}


