package com.example.pattern.state;

/**
 * 狀態模式測試類
 * @author Administrator
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 創建活動對象，獎品池裡有1個獎品
        RaffleActivity activity = new RaffleActivity(1);

        // 我們連續抽30次獎
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i + 1) + "次抽獎----------");
            // 防呆：若已經沒獎品，結束活動
            if (activity.getState() == activity.getDispensOutState()) {
                System.out.println("抽獎活動結束!!");
                break;
            }
            // 參加抽獎，第一步點擊扣除積分
            activity.debuctMoney();

            // 第二步抽獎
            activity.raffle();
        }
	}
}
