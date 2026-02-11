package Numbers.Assignment;

public class Ecommerce {
	public static void main(String[] args) {
		
		//read
		int age = 30;
		double total_price = 5000;
		double price_after_discount = total_price;
		//lets apply discount
		if(age>=13 && age<=19) {
			//apply 5% discount
			price_after_discount = total_price-(total_price*0.05);
			//s2: apply another 5% if after disc price > 5000
			if(price_after_discount > 5000) {
				price_after_discount = price_after_discount-price_after_discount*0.05;
			}//end of inner-if	
		}
		else if(age>=20 && age <= 29) {
			price_after_discount = total_price-(total_price*0.06);
			if(price_after_discount > 4000) {
				price_after_discount = price_after_discount-(price_after_discount*0.06);
			}
		}
		else if(age>29) {
			price_after_discount = total_price-(total_price*0.15); 
		}
		System.out.println(total_price);
		System.out.println(price_after_discount);
		System.out.println(age);
		
	}
}
