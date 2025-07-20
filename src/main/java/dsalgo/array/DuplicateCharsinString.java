package dsalgo.array;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DuplicateCharsinString {

    public static void main(String[] args) {
        String s = "I am interviewing Ramya";

        HashMap<Character,Integer> freqMap = new HashMap<>();
        char[] schar = s.toLowerCase().trim().toCharArray();
        for(int in=0;in<schar.length;in++) {
            if (!(schar[in] == ' ')) {
                if (!freqMap.containsKey(schar[in])) {
                    freqMap.put(schar[in], 1);
                } else {
                    int count = freqMap.get((Character) schar[in]);
                    freqMap.put(schar[in], ++count);
                }
            }
        }
        for(Map.Entry<Character,Integer> entry: freqMap.entrySet()){
            if(entry.getValue()>1)
            System.out.println(entry.getKey() + " count: "+entry.getValue());
        }

       /* for(int i=0;i<10;i=i+1){
            System.out.println("ramya is a very bad girl ");
        }*/
    }

}
