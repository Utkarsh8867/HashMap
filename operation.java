import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class operation {

    public static void main(String[] args) {
        // Create 
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("us" , 10);
        hm.put("china" ,20 );
        hm.put("India" , 100);
        
        System.out.println(hm);

        // get  o(1)
        int population =hm.get("India");
        System.out.println(population);

        // ContainsKey - o(1)
      System.out.println(hm.containsKey("India"));
      System.out.println(hm.containsKey("US"));
      
      //Remove

     System.out.println( hm.remove("India"));
     System.out.println(hm);

     System.out.println(hm.size());


     hm.clear();

     System.out.println(hm.isEmpty());

     // Iterate
     hm.put("us" , 10);
     hm.put("china" ,20 );
     hm.put("India" , 100);
     Set<String> keys = hm.keySet();
     System.out.println(keys);
     for(String k: keys){
        System.out.println("key="+k+"value"+hm.get(k));
     }

     
    }
}