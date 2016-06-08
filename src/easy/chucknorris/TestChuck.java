package easy.chucknorris;

import java.util.*;

public class TestChuck
{
	String one="0 ";
	String zero="00 ";
	String space=" ";
	String code=null;
	
    public static void main(String args[])
	{
		ChuckNorris cn=new ChuckNorris();
		TestChuck tc=new TestChuck();
		ArrayList<String> blocks=new ArrayList<String>();
		ArrayList<String> amount=new ArrayList<String>();
		boolean exit;
		String MESSAGE;
		do{
			System.out.println("Enter the message:");
			Scanner in = new Scanner(System.in);
			MESSAGE = in.nextLine();
			if (MESSAGE.equals(""))
			{
				System.err.println("Please enter the message");
				exit = true;
			}
			else
			{exit = false;}
		}while(exit);{
			char[] arrayOfMessage;
			byte[] byteMessage=MESSAGE.getBytes();
			System.out.println();
			
			for (byte b:byteMessage)
			 {
				 String binaryString=Integer.toBinaryString(b);
				 arrayOfMessage=new char[binaryString.length()];
				 System.out.println(binaryString.length());
				 System.out.println((char)b + "=" + binaryString);
				 boolean equalsNext=true;
				 int temp;
				 int i=0;
				 for(;i<binaryString.length();i++){
					 int nextIndex=i+1;
					 //System.out.print(i);
					 /*
					 	if(nextIndex!=binaryString.length()){
					 		if(binaryString.charAt(i)<binaryString.charAt(nextIndex)){
								i=nextIndex;
					 		}
						}
						*/
					 arrayOfMessage[i]=binaryString.charAt(i);
				 }
				 /*
				 int a=0;
				 for(;a<binaryString.length();a++){
					 int nexta=a+1;
					 if(nexta!=binaryString.length()){
						 if(binaryString.charAt(a)==binaryString.charAt(nexta)&&binaryString.charAt(a)=='1'){
							 System.out.print("0");
							 a=nexta;
						 }else{
							 System.out.print(binaryString.charAt(a));
							 a=nexta;
						 }
					 }
				 }
				 */
				 for(int j=0;j<arrayOfMessage.length;j++){
					 if(arrayOfMessage[j]==arrayOfMessage[j+1]){
						 arrayOfMessage[j]=arrayOfMessage[j+1];
					 }
				 }
			}
		}
    }
}
