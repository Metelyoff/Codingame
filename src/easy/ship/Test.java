package easy.ship;

public class Test
{
	int max(int[] num){
		int result;
			for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]>num[j]){
					
					int res=num[i];
					num[i]=num[j];
					num[j]=res;
					result=res;
				}
			}
			}
			result=num[num.length-1];
			System.out.println(result);
		return result;
	}
	
	public static void main(String args[]){
		Test t=new Test();
		int[] arr={5,0,7,3,1,9,0,8,6};
		t.max(arr);
	}
}
