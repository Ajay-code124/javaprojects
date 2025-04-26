package com.loc_di.I_o_c_DI;

public class OnePlus implements Mobiles {
	Color color; //Variable it will using by using constructor
	
	public OnePlus(Color getOnePlusColor) {


		this.color=getOnePlusColor;
	}

	@Override
	public void getModelAndColor() {
		System.out.println("OnePlus model : 9 pro");
		color.getOnePlusColor();
	}

}
