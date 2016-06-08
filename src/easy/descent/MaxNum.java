package easy.descent;

public class MaxNum {
	boolean printTopNum(int[] nums){
		int maxOne=0;
		//int maxTwo=0;
		for(int n:nums){
			if(maxOne<n)
				maxOne=n;
		}
		System.out.println("First Max Number: "+maxOne);
		return false;
		//System.out.println("Second Max Number: "+maxTwo);
	}
	public static void main(String[] args) {
		String action="";
		int num[]={45,48,66,77,33,3,99,1};
		MaxNum mn=new MaxNum();
		if(mn.printTopNum(num)){action="FIRE";}else{action="HOLD";}
		System.out.println(action);
	}

}
