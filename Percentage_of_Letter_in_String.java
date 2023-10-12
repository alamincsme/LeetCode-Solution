public class Percentage_of_Letter_in_String {
    public static int percentageLetter(String s, char letter) {
        int count = 0 ;
        for (char c : s.toCharArray()) {
            if (letter == c) {
                count ++ ;
            }
        }
        return (count * 100) / s.length();
    }

    public static void main(String[] args) {
        int r = percentageLetter("foobar", 'o');
        System.out.println(r);
    }
}
