package easy.ship;

import java.util.*;
import java.io.*;
import java.math.*;

class ShipPlayerV2 {

    public static void main(String args[]) {
            
    	Scanner in = new Scanner(System.in);

        while (true) {
                
	        int spaceX = in.nextInt();
	        int spaceY = in.nextInt();
	                
	        String actionShip=null;
	        int indexOfMaxMountain=0;
	        int maxHeight=0;
	     
	        for (int i = 0; i < 8; i++) {
	        	int mountainH = in.nextInt();
	            System.err.println("mountainH "+i+"="+mountainH);
	            if(maxHeight<mountainH){
	            	maxHeight=mountainH;
	                indexOfMaxMountain=i;
	            }
	        }
	                
	        if(spaceX==indexOfMaxMountain){
	        	actionShip="FIRE";
	        }else{
	        	actionShip="HOLD";
	        }
	        System.out.println(actionShip);
        }
    }
}