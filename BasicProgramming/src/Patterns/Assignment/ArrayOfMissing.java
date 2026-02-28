package Patterns.Assignment;

public class ArrayOfMissing {
	public static void main(String[] args) {
		String str = "I have a meeting today";
		String rev = "";
		for(int i=1;i<=str.length()-1;i++) {
			String revw = "";
			for(int j=1;j<=str.length()-1;j++) {
				char c = str.charAt(i);
				if(c != ' ') {
					revw = revw+c;
				}
				else {
					rev = rev+revw;
					
				}
				break;
			}
			
		}
		System.out.println(rev);
	}
}
