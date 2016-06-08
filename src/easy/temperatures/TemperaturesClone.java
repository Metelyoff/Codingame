package easy.temperatures;

import java.util.Scanner;
import java.util.*;

public class TemperaturesClone {
	
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
	    
		TemperaturesClone temp=new TemperaturesClone();
		Scanner in=new Scanner(System.in);
		
		ArrayList<Integer> negativeTemps=new ArrayList<Integer>();
		ArrayList<Integer> positiveTemps=new ArrayList<Integer>();
		
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
				if(tempsIn<0){negativeTemps.add(tempsIn);}
				if(tempsIn>0){positiveTemps.add(tempsIn);}
			}
			System.out.println();
			System.out.print("The temperature closest to Zero is ");
			System.out.println(temp.getClosestTemperatureToZero(arrayTemps));
			System.out.println();
			for(Integer n:negativeTemps){
				System.out.print(n+" ");
			}
			System.out.println();
			for(Integer p:positiveTemps){
				System.out.print(p+" ");
			}
			System.out.println();
			System.out.println("Negative="+temp.getNegativeTemp(negativeTemps));
			System.out.println("Positive="+temp.getPositiveTemp(positiveTemps));
			System.out.println("The temperature closest to Zero is "+temp.getClosestTemperatureToZero(temp.getNegativeTemp(negativeTemps), temp.getPositiveTemp(positiveTemps)));
		}
    }
}
