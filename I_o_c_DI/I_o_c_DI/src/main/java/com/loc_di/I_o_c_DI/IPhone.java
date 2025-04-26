package com.loc_di.I_o_c_DI;

public class IPhone implements Mobiles {
	
	Color color;

	public IPhone(Color getIPhoneColor) {
		// TODO Auto-generated constructor stub
		this.color=getIPhoneColor;
	}

	@Override
	public void getModelAndColor() {
		// TODO Auto-generated method stub
		System.out.println("IPhone Model is : 13 pro");
		color.getIPhoneColor();

	}

}
