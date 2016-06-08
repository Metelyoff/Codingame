package easy.ship;

import java.util.*;
import java.io.*;
import java.math.*;

class ShipPlayer {

    int getMax(ArrayList<Integer> nums){
		int maxNumber=0;
		for(Integer n:nums){
			if(maxNumber<n)maxNumber=n;
		}
		return maxNumber;
	}

    public static void main(String args[]) {
        
        ShipPlayer p=new ShipPlayer();
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> mountainHight=new ArrayList<Integer>();
		boolean maxHeightFounded=false;
		String shipAction=null;
		
        while(true){
			int SX = in.nextInt();
			int SY = in.nextInt();
			
			for (int i = 0; i < 8; i++){
				int MH = in.nextInt();
				mountainHight.add(i,MH);
			}
			
			for(Integer m:mountainHight){
				if(p.getMax(mountainHight)==m){
					maxHeightFounded=true;
				}else{
					maxHeightFounded=false;
				}
				
				if(maxHeightFounded==true){
				    shipAction="FIRE";
				}else{
				    shipAction="HOLD";
				}
				 System.out.println(shipAction);   
			}
		}
    }
}