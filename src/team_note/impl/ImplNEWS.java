package team_note.impl;

import java.util.ArrayList;
import java.util.Scanner;


// 첫시작은 1,1에서 출발
// 범위를 벗어나면 숫자가 바뀌지않음

public class ImplNEWS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int y = 1;
		int n = sc.nextInt();
		ArrayList<Character> arr = new ArrayList<Character>();
		
		for(int i=0; i<n; i++) {
			arr.add(sc.next().charAt(0));
		}
		
//					L,R,U,D
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		char[] move_types = {'L','R','U','D'};
		int nx = 0;
		int ny = 0;
//		입력한 길이만큼 반복문
		for(int i=0; i<arr.size(); i++) {
//			i번째 값이랑 move_types의 값을 비교해서 같으면 위치 이동
			for(int j=0; j<move_types.length; j++) {
				if(arr.get(i).equals(move_types[j])) {
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			x=nx;
			y=ny;
		}
		System.out.println("x=" +x + ", y = " +y);
	}
}
