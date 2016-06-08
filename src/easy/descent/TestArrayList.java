package easy.descent;

import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class TestArrayList {
	
	static int getMax(ArrayList<Integer> nums){
		//int MMH=0;
		Integer MMH=0;
		/*for(Integer n:nums){
			if(MMH<n) MMH=n;
		}*/
		Iterator<Integer> itNums=nums.iterator();
		while(itNums.hasNext()){
			Integer element=itNums.next();
			if(MMH<element){MMH=element;}
		}
		return MMH;
	}

	public static void main(String[] args) {
		Random r=new Random();
		Scanner in = new Scanner(System.in);
		int n=10;
		ArrayList<Integer> mountHeight=new ArrayList<Integer>();
		Iterator<Integer> itMH=mountHeight.iterator();
		String actions="";
		mountHeight.add(1);
		mountHeight.add(1);
		mountHeight.add(2);
		mountHeight.add(2);
		mountHeight.add(1);
		mountHeight.add(6);
		mountHeight.add(1);
		mountHeight.add(6);
		while(n!=2){
			n--;
			/*for(int i=0;i<8;i++){
				int MH=r.nextInt(8);
				int MH=in.nextInt();
				mountHeight.add(MH);
				System.out.print(MH+" ");
			}*/
			for(Integer num:mountHeight){
				System.out.print(num+" ");
			}
			System.out.println();
			/*for(Integer num:mountHeight){
				if(getMax(mountHeight)==num){actions="F";}else{actions="H";}
				System.out.print(actions+" ");
			}*/
			itMH=mountHeight.iterator();
			while(itMH.hasNext()){
				Integer num=itMH.next();
				if(num==getMax(mountHeight)){
					actions="F";
					itMH.remove();
				}else{actions="H";}
				System.out.print(num+" ");
				System.out.print(actions+" ");
			}
			System.out.println();
			/*itMH=mountHeight.iterator();
			while(itMH.hasNext()){
				Integer num=itMH.next();
				System.out.print(num+" ");
			}
			System.out.println();*/
		}
	}
}
