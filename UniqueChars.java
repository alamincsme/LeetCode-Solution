import java.util.HashSet;
import java.util.Set;

public class UniqueChars {
    public static int  UniqueCharacter (String  str ) {
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }

        return set.size();
    }
    public static void main(String[] args) {
        int r = UniqueCharacter ("alamin");
        System.out.println("Unique character  :" + r);
    }
}