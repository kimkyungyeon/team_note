package team_note.class1;

import java.util.ArrayList;
import java.util.Scanner;

public class Average1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//과목의 개수
		int a = sc.nextInt();
		ArrayList<Integer> jumsu = new ArrayList<Integer>();
		
		for(int i=0; i<a; i++) {
			jumsu.add(sc.nextInt());
		}
		
		int max=-1;
		for(int i=0;i<jumsu.size();i++) {
			if(jumsu.get(i)>max) {
				max=jumsu.get(i);
			}
		}
		
		double[] avgArr = new double[jumsu.size()];
		for(int i=0;i<jumsu.size();i++) {
			avgArr[i] = (double) jumsu.get(i)/max*100;
		}
		
		double sum=0;
		for(int i=0;i<jumsu.size();i++) {
			sum += avgArr[i];
		}
		
		System.out.println(sum/jumsu.size());
	}
}
