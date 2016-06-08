package easy.ascart;

import java.util.Scanner;
import java.util.*;

public class ASCIIArt {

	int getStartIndexOfWord(char text,int lengthOfText){
		int indexOfWord=0;
		for(char c='A';c<='Z';c++){
			if(text==c){break;}
			//if(text!=c){indexOfWord=104;break;}
			indexOfWord+=lengthOfText;
		}
		return indexOfWord;
	}
	
	ArrayList<String> getRow(){
		ArrayList<String> row=new ArrayList<String>();
		row.add(0," #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ");
		row.add(1,"# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ");
		row.add(2,"### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ");
		row.add(3,"# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ");
		row.add(4,"# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");
		return row;
	}
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		ASCIIArt asc=new ASCIIArt();
        
        //int L = in.nextInt();
		int L=4;
        //System.err.println("L="+L);
        //in.nextLine();
        
        //int H = in.nextInt();
        int H=5;
        //System.err.println("H="+H);
        //in.nextLine();
        
        System.err.println("Enter text: ");
        String T = in.nextLine();
		System.out.println();
        System.err.println("Your text: "+T);
        
        String words = null;
        String ROW=null;

		for(String r:asc.getRow()){
			ROW=r;
			//System.out.print(ROW);
			//System.out.println();
			for(char c:T.toUpperCase().toCharArray()){
				int startIndex=asc.getStartIndexOfWord(c,L);
				int lastIndex=asc.getStartIndexOfWord(c,L)+L;
				words=ROW.substring(startIndex,lastIndex);
				System.out.print(words);
			}
			System.out.println();
		}
	}
}
/*
 * 
 #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###  
# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #  
### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##  
# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #        
# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  

*/
