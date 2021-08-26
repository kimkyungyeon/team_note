package team_note;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static void main(String[] args) {
		solution("25fivesixsix");
	}
	
	
	public static int solution(String s) {
		
		String[] arr = {"zero" , "one", "two" , "three" , "four", "five", "six", "seven", "eight", "nine"};
		
		Map<String,Integer> map = new HashMap<>();
		
		int i=0;
		for(String str : arr) {
			map.put(str, i++);
		}
		
		for(String str : arr) {
			s= s.replace(str, map.get(str).toString());
		}
		System.out.println(s);
		
		int answer =Integer.parseInt();
		return answer;
	}
}
