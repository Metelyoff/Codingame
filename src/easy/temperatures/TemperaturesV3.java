package easy.temperatures;

import java.util.Scanner;
import java.util.*;

public class TemperaturesV3 {
	
	public static final int MIN_TEMP=-273;
	public static final int MAX_TEMP=5526;

    int getClosestTemperatureToZero(int[] arrayOfTemps){
		int minTemp=MAX_TEMP;
		for(int t:arrayOfTemps){
			if(minTemp>t)minTemp=t;
		}
        return minTemp;
    }
    
    int getClosestTemperatureToZero(int negativeNum,int positiveNum){
    	int result=0;
    	if(Math.abs(negativeNum)<Math.abs(positiveNum)){
    		result=negativeNum;
    	}else{
    		result=positiveNum;
    	}
    	return result;
    }
	
    int getNegativeTemp(ArrayList<Integer> negativeArray){
    	int maxNegative=MIN_TEMP;
    	for(Integer n:negativeArray){
    		if(maxNegative<n)maxNegative=n;
    	}
    	return maxNegative;
    }
    
    int getPositiveTemp(ArrayList<Integer> positiveArray){
    	int minPositive=MAX_TEMP;
    	for(Integer p:positiveArray){
    		if(minPositive>p)minPositive=p;
    	}
    	return minPositive;
    }
	
	public static void main(String args[]) {
	    
		TemperaturesV3 temp=new TemperaturesV3();
		Scanner in=new Scanner(System.in);
		
		ArrayList<Integer> negativeTemps=new ArrayList<Integer>();
		ArrayList<Integer> positiveTemps=new ArrayList<Integer>();
		
		System.out.println("Enter count of the temperatures: ");
		int N=in.nextInt();
		int tempsIn;
		
		switch(N){
		case 0:
			System.out.println();
			System.out.println("The temperature closest to Zero is 0");
			break;
		case 1:
			System.out.println("ENTER TEMPERATURES:");
			tempsIn=in.nextInt();
			System.out.println("The temperature closest to Zero is "+tempsIn);
			break;
		default:
			System.out.println();
        	for(int t=0;t<N;t++){
				System.out.println();
				System.out.println("ENTER TEMPERATURES:");
				tempsIn=in.nextInt();
				if(tempsIn<0){negativeTemps.add(tempsIn);}
				if(tempsIn>0){positiveTemps.add(tempsIn);}
        	}
        	System.out.println("The temperature closest to Zero is "+temp.getClosestTemperatureToZero(temp.getNegativeTemp(negativeTemps), temp.getPositiveTemp(positiveTemps)));
		}
    }
}
