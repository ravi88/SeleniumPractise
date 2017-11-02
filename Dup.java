package hashmap;

import java.util.HashMap;
import java.util.Set;

public class Dup {
static void duplicateWords(String inputString)
{
	String[] words=inputString.split(" ");
	HashMap<String, Integer> h= new HashMap<String,Integer>();
	for(String word:words)
	{
		if(h.containsKey(word))
		{
			h.put(word, h.get(word)+1);
		}
		else
		{
			h.put(word,1);
		}
	}
	Set<String>wordsinString=h.keySet();
	for(String word:wordsinString)
	{
		if(h.get(word)>1)
		{
			System.out.println(word+" : "+h.get(word));
		}
	}
	}
public static void main(String[] args)
{
duplicateWords("ramu raju ramu ram ramu");	
duplicateWords("ravi rav ravi");
}
}
