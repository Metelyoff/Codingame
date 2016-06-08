package easy.descent;

import java.util.*;
import java.io.*;
import java.math.*;

public class TestDescent {

	int getMax(int[] nums){
		int max=0;
		for(int n:nums){
			if(max<n) max=n;
		}
		return max;
	}
	
	public static void main(String[] args) {
		TestDescent td=new TestDescent();
		Scanner in = new Scanner(System.in);
		int[] mountHeight=new int[8];
		String shipAction="";
		boolean maxHeightFounded=false;
		
		while (true){
			System.out.print("SX: ");
			int SX = in.nextInt();
			System.out.println();
			System.out.print("SY: ");
			int SY = in.nextInt();
			
			for (int i = 0; i < 8; i++){
				System.out.println();
				System.out.print("MH: ");
				int MH = in.nextInt();
				mountHeight[i]=MH;
				if(td.getMax(mountHeight)==mountHeight[i]){
					maxHeightFounded=true;
				}else{
					maxHeightFounded=false;
				}
				if(maxHeightFounded==true){
					shipAction="FIRE";
				}else{
					shipAction="HOLD";
				}
            }
            for(int n:mountHeight){
                if(td.getMax(mountHeight)==n){
                    maxHeightFounded=true;
					break;
                }
                else{
                    maxHeightFounded=false;
                    }
				if(maxHeightFounded=true){
					shipAction="FIRE";
				}else{
					shipAction="HOLD";
				}
            System.out.println(shipAction);
            }
		}
	}
}
