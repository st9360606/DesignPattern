package com.example.principles.inversion.improve;

/**
 * 七大設計原則
 * 依賴倒轉原則
 */

//分析 : 如果我們獲取的對象是 多個 EX 微信 LINE Google ... 則新增類，同時Person也要新增相應的接收方法
//解決 : 引入一個抽象接口(IReceiver)，表示接受者，這樣Person類 與 接口(IReceiver) 發生依賴
public class DependencyInversion2 {
    public static void main(String[] args) {
        LG lg = new LG();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new LG());
    }
}

interface IOpenAndClose {
    public void open(ITV tv);
}

interface ITV {
    public void play();
}

class LG implements ITV {
    @Override
    public void play() {
        System.out.println("LG TV Opening...");
    }
}

class OpenAndClose implements IOpenAndClose {
    public void open(ITV tv) {
        tv.play();
    }
}


