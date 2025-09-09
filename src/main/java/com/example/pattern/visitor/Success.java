package com.example.pattern.visitor;

public class Success extends Action {

	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println(" 男性給的評價該歌手很棒 !");
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println(" 女性給的評價該歌手很棒 !");
	}

}
