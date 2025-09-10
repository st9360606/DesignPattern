package com.example.pattern.state;

/**
 * 不能抽獎的狀態
 * @author Administrator
 *
 */
public class NoRaffleState extends State {

	 // 初始化時傳入活動引用，發放獎品後改變其狀態
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 當前狀態可以扣積分。扣除後，將狀態設置成可以抽獎的狀態
    @Override
    public void deductMoney() {
        System.out.println("扣除50積分成功，您可以抽獎了");
        activity.setState(activity.getCanRaffleState());
    }

    // 當前的狀態不能抽獎
    @Override
    public boolean raffle() {
        System.out.println("扣了積分才能抽獎喔!");
        return false;
    }

    // 當前狀態不能發放獎品
    @Override
    public void dispensePrize() {
        System.out.println("不能發放獎品");
    }
}
