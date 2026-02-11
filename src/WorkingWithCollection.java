import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class WorkingWithCollection {
	
	public String name="bbiiippppiiiiinnnnnn";

	public static void main(String[] args) {
		WorkingWithCollection start=new WorkingWithCollection();
		start.countCharacter();

	}

	public void countCharacter() {
		char word;int count=0;
		
		Map<Character,Integer> character=new HashMap<Character,Integer>();
			
		for(int i=0;i<name.length();i++) {
			word=name.charAt(i);
			
			character.put(word, character.getOrDefault(word, 0) + 1);
		}
		
		
		System.out.println(character);
		
		
		
		
	}

}
