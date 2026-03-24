package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {
	//Longest substring without repeating character and maximum length
	public static void main(String[] args) {
		
		String s="abcgthfabcdefghi";
		int maxLength=0;
		Map<Character,Integer > map=new HashMap<Character, Integer>();
		int l=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(map.containsKey(c)&& map.get(c) >= l) {
				l=map.get(c)+1;
				
			}
			map.put(c, i);
			if((i-l+1)>maxLength) {
				maxLength=i-l+1;
			}
		}
		System.out.println("longest substring without repeating char : "+s.substring(l,l+maxLength));
		System.out.println("maximum length is : "+maxLength);
	}
}
