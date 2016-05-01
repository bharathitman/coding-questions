package ctci.big.o.string_permutations;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Print all permutations of the given string
 */
public class stringPerm {

    public static void main(String[] args) {

        stringPerm("abc", "");
    }


    /*
        abc -
        abc, acb, bac, bca, cab, cba

        1st call
            abc, , i = 0 - > bc, a
                bc, a, i = 0 -> c, ab
                  c, ab, i = 0 -> "", abc
                  Printing -> abc
                bc, a, i = 1 -> bc


     */

    public static void stringPerm(String str, String prefix) {

       System.out.println("str -> "+str +" Prefix -> "+prefix);
        if(str.length() == 0) {
            System.out.println("Printing ");
            System.out.println(prefix);
        }
        else {
            for(int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i+1);
                stringPerm(rem, prefix + str.charAt(i));
            }
        }

    }
}