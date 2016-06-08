package easy.ship;

class Test2
{
	int getMax(int[] nums){
		int maxNum=0;
		for(int n:nums){
			if(maxNum<n)maxNum=n;
		}
		return maxNum;
	}
	
	public static void main(String args[]){
		Test2 t2=new Test2();
		String s="";
		int[] random={0,1,2,1,2,1,2,0,1};
		for(int n:random){
			if(n==t2.getMax(random)){
				s="fire";}
				else{
					s="hold";}
			System.out.println(s);
		}
	}
}
