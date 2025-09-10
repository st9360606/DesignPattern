package com.example.pattern.state;

/**
 * 發放獎品的狀態
 * @author Administrator
 *
 */
public class DispenseState extends State {

	 // 初始化時傳入活動引用，發放獎品後改變其狀態
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }
    

    @Override
    public void deductMoney() {
        System.out.println("不能扣除積分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽獎");
        return false;
    }

    //發放獎品
    @Override
    public void dispensePrize() {
        // 1) 先檢查是否還有獎品
        if (activity.getCount() <= 0) {
            System.out.println("很遺憾，獎品已經發送完畢了~");
            activity.setState(activity.getDispensOutState());
            return;
        }

        // 2) 發放獎品
        System.out.println("恭禧中獎了~");

        // 3) 只有在真的發獎時才扣庫存
        activity.decreaseCount();

        // 4) 依扣完後的庫存切狀態
        if (activity.getCount() == 0) {
            activity.setState(activity.getDispensOutState());
        } else {
            activity.setState(activity.getNoRafflleState());
        }
    }
}
