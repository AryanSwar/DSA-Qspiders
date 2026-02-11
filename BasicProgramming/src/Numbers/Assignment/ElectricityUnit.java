package Numbers.Assignment;

public class ElectricityUnit {
	public static double electricityBill(int total_units) {
		
		int total_unit = 400;
		double total_amount = 0; 
		
		
		if(total_unit>0 && total_unit<=100) {
			total_amount = total_unit*2;
			
			
		}
		else if(total_unit >=101 && total_unit <= 300) {
			total_amount = total_unit*4;
			
		}
		else if(total_unit > 300) {
			total_amount = total_unit*6;
			
		}
		
		if(total_amount > 2000) {
			total_amount = total_amount+total_amount*0.10;
		}
		
		return total_amount;
	}
	public static void main(String[] args) {
		//with method
		int units = 101;
		System.out.println(electricityBill(units));
		
		
		
		//without methods
//		int total_unit = 400;
//		double total_amount = 0; 
//		
//		
//		if(total_unit>0 && total_unit<=100) {
//			total_amount = total_unit*2;
//			
//			
//		}
//		else if(total_unit >=101 && total_unit <= 300) {
//			total_amount = total_unit*4;
//			
//		}
//		else if(total_unit > 300) {
//			total_amount = total_unit*6;
//			
//		}
//		
//		if(total_amount > 2000) {
//			total_amount = total_amount+total_amount*0.10;
//		}
//		System.out.println(total_amount);
	}
}
