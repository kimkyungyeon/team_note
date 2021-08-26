package team_note.impl;

import java.util.Scanner;

public class ImplKnight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//현재 나이트의 위치 입력받기
		String inputData = sc.next();
		int row = inputData.charAt(1)-'0';
		int col = inputData.charAt(0)-'a'+1;
		
		//나이트가 이동할 수 있는 8가지 방향 정의
		int[] dx = {-2,-1,1,2,2,1,-1,-2};
		int[] dy = {-1,-2,-2,-1,1,2,2,1};
		//8가지 방향에 대하여 각위치로 이동이 가능한지 확인
		int result = 0;
		for (int i =0; i<8; i++) {
			//이동하고자 하는 위치확인
			int nextRow = row +dx[i];
			int nextCol = col +dy[i];
			//해당위치로 이동가능하다면  count 
			if(nextRow>=1 && nextRow<=8 && nextCol>=1 && nextCol <=8) {
				result +=1;
			}
		}
		System.out.println(result);
	}
}
