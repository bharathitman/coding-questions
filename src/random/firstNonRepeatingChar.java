package random;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by bharath on 3/9/2016.
 *
 * Get the First Non Repeating Character in a String
 *
 */

public class firstNonRepeatingChar {

    public static void main(String[] args) {


        fNRC_LinkedHashSet("bharath");

    }

    /*
        Uses Linked Hash Set
     */
    public static void fNRC_LinkedHashSet(String s) {

        Set<Character> set = new LinkedHashSet<>();
        for(Character c : s.toCharArray()) {
            if(set.contains(c)) {
                set.remove(c);
            }
            else {
                set.add(c);
            }
        }

        System.out.println(set.iterator().next());

    }

    /*
        Uses a Traditional Hash Map
     */
    public static void firstNonRepeatingCharacter(String s) {


        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if(m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), m.get(s.charAt(i))+1);
            }
            else {
                m.put(s.charAt(i), 1);
            }
        }

        //Get the count
        for (int i = 0; i < s.length(); i++) {
            if(m.get(s.charAt(i)) == 1) {
                System.out.println("First non repeating character is "+s.charAt(i));
                break;
            }
        }
    }
}
