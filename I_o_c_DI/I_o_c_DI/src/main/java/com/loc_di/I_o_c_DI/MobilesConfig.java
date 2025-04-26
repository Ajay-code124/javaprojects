package com.loc_di.I_o_c_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MobilesConfig {
	
	@Bean
	public Color getColor() {
		return new Color();
	}
	
	@Bean
	public Mobiles getOneplus(Color getColor) {
		return new OnePlus(getColor);
	}
	
	@Bean
	public Mobiles getIPhone(Color getColor) {
		return new IPhone(getColor);
	}

}
