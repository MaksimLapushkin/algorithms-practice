package algorithms.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public boolean isAnagram (String str1, String str2){
        if (str1.isBlank() && str2.isBlank()){
            return true;
        }
        if (str1.length() != str2.length()){
            return false;
        }

        Map<Character,Integer>hashmap = new HashMap<>();
        for(char ch:str1.toCharArray()){
            hashmap.put(ch,hashmap.getOrDefault(ch,0)+1);
        }

        for (char ch:str2.toCharArray()){
            if (!hashmap.containsKey(ch)) {
                return false;
            }
            hashmap.put(ch, hashmap.get(ch)-1);
            if(hashmap.get(ch)==0){
                hashmap.remove(ch);
            }
        }

        return (hashmap.isEmpty());
    }

}
