package easy.descent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class TestIterator {

	static String changedElement="Err";
		
/*	public static String changeElement(Object[] words,String element){
		for(int i=0;i<words.length;i++){
			String elementsOfWords;
			if(elementsOfWords.equals(element)){
				changedElement=words.set(words.indexOf(element), "FIRE");
				return changedElement;
			}
			else{
				changedElement=words.set(words.indexOf(element), "HOLD");
				return changedElement;
			}
		}
		return changedElement;
	}
*/	
	
	public String changeElement(ArrayList<String> words, String elementBeforeChange, String elementAfterChange){
		boolean searchElement=false;
		for(String w:words){
			if(w.equals(elementBeforeChange)){
				searchElement=true;
				break;
			}else{
				searchElement=false;
			}
		}
		if(searchElement==true){
			elementAfterChange=words.set(words.indexOf(elementBeforeChange), elementAfterChange);
		}else{
			System.err.println("Not found: "+elementAfterChange);
		}
		return elementAfterChange;
	}
	
	public static void main(String[] args) {
		
		TestIterator ti=new TestIterator();
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");

		System.out.println("Original contents of al: ");
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
			String element=it.next();
			System.out.print(element+" ");
		}
		System.out.println();
		
		//System.out.println();
		/*ListIterator litr=al.listIterator();
		while(litr.hasNext()){
			Object element=litr.next();
			litr.set(element+" + ");
		}
		
		System.out.println("Modified contents of al: ");
		it=al.iterator();
		while(it.hasNext()){
			Object element=it.next();
			System.out.print(element+" ");
		}
		System.out.println();
		*/
		
		//System.out.println(changeElement(al.toArray(), "S"));
		
		System.out.println("Remove item from al content:  ");
		it=al.iterator();
		while(it.hasNext()){
			Object element=it.next();			
			System.out.print(element+" ");
		}
		
		System.out.println();

		for(int i=0;i<al.size();i++){
			System.out.print(i+"="+al.get(i)+" ");
		}
		
		System.out.println();

		ti.changeElement(al, "A", "R");
		for(String s:al){
			System.out.print(s+" ");
		}
	}
}
