package random;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by bharath on 3/9/2016.
 */
public class firstNonRepeatingChar {

    public static void main(String[] args) {


        firstNonRepeatingCharacter("Geek for Geeks");

    }

    public static void firstNonRepeatingCharacter1(String s) {

        Set<Character> set = new LinkedHashSet<Character>();
        for(Character c : s.toCharArray()) {


        }

    }

    public static void firstNonRepeatingCharacter(String s) {


        Map<Character, Integer> m = new HashMap<Character, Integer>();

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
