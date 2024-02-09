package stepdefination;

import io.cucumber.java.en.And;
import page.cart;

public class cartstep {
	
	cart ct = new cart();
	
	 @And("click cart btn")
	 public void click_cart_btn(){
		 
	 
	 ct.click_cart_btn();

	
	}

}
