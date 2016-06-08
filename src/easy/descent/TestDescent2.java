package easy.descent;
import java.util.*;

public class TestDescent2
{
	
	int getMax(ArrayList<Integer> nums){
		int maxNumber=0;
		for(Integer n:nums){
			if(maxNumber<n)maxNumber=n;
		}
		return maxNumber;
	}
	
	public static void main(String[] args){
		
		TestDescent2 td2=new TestDescent2();
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> mountainHight=new ArrayList<Integer>();
		boolean maxHeightFounded=false;
		String shipAction=null;
		
		while(true){
			System.out.println();
			System.out.print("SX: ");
			int SX = in.nextInt();
			System.out.println();
			System.out.print("SY: "); 
			int SY = in.nextInt();
			
			for (int i = 0; i < 8; i++){
				System.out.print("MH: ");int MH = in.nextInt();
				mountainHight.add(i,MH);
			}

			for(Integer m:mountainHight){
				System.out.print(m+", ");
				
				if(td2.getMax(mountainHight)==m){
					maxHeightFounded=true;
					mountainHight.set(mountainHight.indexOf(SX),0);
				}else{
					maxHeightFounded=false;
				}

				if(maxHeightFounded==true){
					shipAction="FIRE";
				}else{
					shipAction="HOLD";
				}
				System.out.print(shipAction+", ");
			}
			for(Integer m:mountainHight){
				System.out.print(m+", ");
			}
		}
	}
}
