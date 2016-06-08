package easy.temperatures;

import java.util.Scanner;
import java.util.*;

public class Temperatures {
	
	public static final int MIN_TEMP=-273;
	public static final int MAX_TEMP=5526;

    int getClosestTemperatureToZero(int[] arrayOfTemps){
		
		int minTemp=MAX_TEMP;
		
		for(int t:arrayOfTemps){
			if(minTemp>t)minTemp=t;
		}
        return minTemp;
    }
	
	
	public static void main(String args[]) {
	    
		Temperatures temp=new Temperatures();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter count of the temperatures: ");
		int N=in.nextInt();
		int tempsIn;
		int[] arrayTemps=new int[N];
		
		if(N==0){
			System.out.println();
			System.out.println("The temperature closest to Zero is 0");
		}else{
			System.out.println();
        	for(int t=0;t<N;t++){
				System.out.println();
				System.out.println("ENTER TEMPERATURES:");
				tempsIn=in.nextInt();
				int absTemps=Math.abs(tempsIn);
				arrayTemps[t]=absTemps;
			}
			System.out.println();
			System.out.print("The temperature closest to Zero is ");
			System.out.println(temp.getClosestTemperatureToZero(arrayTemps));
		}
    }
}
