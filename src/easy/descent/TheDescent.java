package easy.descent;

import java.util.*;
import java.io.*;
import java.math.*;

class TheDescent {
    
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		int[] mountHeight=new int[8];
		int[] distance=new int[8];
		String action="";
		
		while (true){
			int SX = in.nextInt();
			int SY = in.nextInt();
			for (int i = 0; i < 8; i++){
				int MH = in.nextInt();
				int D=SY-MH;
				mountHeight[i]=MH;
				distance[i]=D;
            }
            for(int n:mountHeight){
                int D=SY-n;
                if(new MinHeight().getMin(distance,SY)==D){
                    action="FIRE";
                }
                else{
                    action="HOLD";
                    }
            System.out.println(action);
            }
		}
	}
}

class MinHeight{
    int getMin(int[] nums,int num){
		int min=num;
		for(int n:nums){
			if(min>n) min=n;
		}
		return min;
	}
}