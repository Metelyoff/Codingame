package easy.chucknorris;

class ChuckNorris{

	public static String convertMessage(char[] charArray){
		String convertedMessage="";
		int index=0;
		int nextIndex=0;
		int count;
		//int[] tempArray
		for(;index<charArray.length;index++){
			nextIndex=index+1;
			//System.out.println("index before="+index);
			//System.out.println("next index="+nextIndex);
			if(nextIndex!=charArray.length){
				if(charArray[index]=='1'){
					System.out.println(index);
					convertedMessage+="0";
				}else{
					System.out.println(index);
					convertedMessage+="00";
				}
				if(charArray[index]==charArray[nextIndex]){
					index=nextIndex;
				}
				convertedMessage+="_";
			}
			//System.out.println("index after="+index);
		}
		return convertedMessage;
	}
	
	public static void showCodeMessage(char[] code){
		for(char c:code){
			System.out.print(c);
		}
	}
	
	private static int getTotalCount(String message){
		int totalCount=0;
		for(byte b:message.getBytes()){
			totalCount+=Integer.toBinaryString(b).length();
		}
		return totalCount;
	}
	
	private static char[] addToCharArray(String message){
		char[] arrayOfCharacter=new char[getTotalCount(message)];
		int indexOfArray=0;
		for(byte b:message.getBytes()){
			for(char c:Integer.toBinaryString(b).toCharArray()){
				//System.out.print(c);
				arrayOfCharacter[indexOfArray]=c;
				indexOfArray++;
			}
		}
		return arrayOfCharacter;
	}
	
	private static void showBytes(String message){
		System.out.println("Message length="+message.length());
		long totalCount=0;
		for(byte b:message.getBytes()){
			System.out.println((char)b+"="+Integer.toBinaryString(b));
			totalCount+=Integer.toBinaryString(b).length();
		}
		System.out.println("total count="+totalCount);
	}
	
	public static void main(String[] args){
		String message="h";
		showBytes(message);
		System.out.println("---------------");
		//String result=convertMessage(addToCharArray(message));
		//System.out.println(result);
		//String result=Integer.toBinaryString(message).toString();
		StringBuilder binaryString=new StringBuilder();
		char[] charH=message.toCharArray();
		for (char stringChar : charH) {
            binaryString.append(String.format("%7s", Integer.toBinaryString((int) stringChar)).replace(' ', '0'));
        }
		System.out.println(binaryString.toString());
		String groups[] = binaryString.toString().split("(?<=1)(?=0)|(?<=0)(?=1)");
		for(String s:groups){
			System.out.println(s);
		}
	}
}
