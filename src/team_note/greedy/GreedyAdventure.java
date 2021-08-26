package team_note.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class GreedyAdventure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();  
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 0 ; i<count; i++) {
			arrayList.add(sc.nextInt());
		}
		Collections.sort(arrayList);
		
		int result = 0; //총그룹의 수
		int n = 0;		//현재 그룹에 포함된 사람의 수 
		for(int i=0;i<count;i++) {
			n+=1;
			//현재 그룹에 포함된 사람의수가 i번째 사람의 공포도보다 크거나 같다면
			if(n>=arrayList.get(i)) {
				result+=1;
				n=0;
			}
		}
		System.out.println(result);
	}
}
