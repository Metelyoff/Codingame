package easy.ship;

import java.util.*;

class Test3
{
	public static void main(String args[]) {
        //Scanner in = new Scanner(System.in);
		Test3 sp=new Test3();
        Random r=new Random();
		String action="";
        int[] mount=new int[8];
        while (true) {
            for (int i = 0; i < 8; i++) {
				int max=0;
                int MH = r.nextInt(8);
				System.out.print(MH+" ---> ");
				mount[i]=MH;
				for(int n:mount){
					if(max<n){max=n;}
					
				}
				if(MH==max){action="fire";}
				else{action="hold";}
				System.out.println(action);
            }
			break;
        }
    }
}
