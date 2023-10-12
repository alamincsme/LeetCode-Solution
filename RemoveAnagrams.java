
import java.util.*;


import java.util.*;

public class RemoveAnagrams {
    public static List<String> removeAnagrams(String[] words) {
        String pre = "";
        List<String> word = new ArrayList<>();

        for (int i = 0 ; i < words.length ; i++) {
            char [] ch = words[i].toCharArray();
            Arrays.sort(ch);

            String curr = String.valueOf(ch);

            if ( ! curr.equals(pre))  {
                word.add(words[i]);
                pre = curr;
            }
        }
        return word;
    }

    public static void main(String[] args) {
        List<String> r = removeAnagrams(new String[] {"baba", "abba", "cd", "dc"});
        for (String s : r) {
            System.out.println(s);
        }
    }
}

