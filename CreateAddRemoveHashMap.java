package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreateAddRemoveHashMap {  
	  
    public static void main(String[] args) {  
          
        String[] countries = {"INDIA", "NAMIBIA",   
                            "CROATIA", "MONGOLIA",   
                            "PERU", "CANADA", "SUN"};  
        String[] capitals = {"DELHI", "WINDHOEK",   
                            "ZAGREB", "ULAANBAATAR",   
                            "LIMA", "OTTAWA", "EARTH"};  
        int i;  
        String country = null;  
        String capital = null;  
          
        //Import Scanner to accept   
        //input values - KnowledgeHandshake.com  
        Scanner scanner = new Scanner(System.in);  
          
        // Creating HashMap. <String, String> means   
        // the key and value both are strings  
        Map<String, String> countriesToCapitals   
                    = new HashMap<String, String>();  
          
        // Loading the HashMap with matching countries and capitals  
        // warning : this is not the ideal way to load key-value pairs  
        // because there are chances that the values might get mixed up  
        // in the wrong order. I am only using this because I want to   
        // keep it simple.  
        for(i = 0; i < countries.length; i++){  
            countriesToCapitals.put(countries[i], capitals[i]);  
        }  
          
        // Removing invalid entry  
        countriesToCapitals.remove("SUN");  
          
        System.out.println("Key in the country for which "  
                + "you would like to know the capital :");  
        country = scanner.next();  
          
        scanner.close();  
          
        // Reading values from the HashMap by passing the key (Country)  
        // and the map returns its corresponding value stored for the   
        // key (Capital)  
        capital = countriesToCapitals.get(country.toUpperCase());  
          
        if(capital != null){  
            System.out.println("The capital of "+country.toUpperCase()+  
                    " is "+capital);  
        } else {  
            System.out.println("Sorry, capital not found in program for "  
                    +country.toUpperCase());  
        }  
  
    }  
  
}  