package leetCode;

public class Valid_Parentheses {
    public boolean isValid(String s) {

        int len = s.length();
        int top = 0 ;
        char[] Stack = new char[len];
        char lastItem;

        for (int i = 0 ; i < len ; i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '{' || x == '[') {
                Stack[top] = x ;
                top++;
            } else if ( x == ')' || x == '}' || x == ']') {
                if (top == 0) {
                    return false;
                }

                top -- ;
                lastItem = Stack[top];
                if (x == ')' && lastItem != '(' || x == ']' && lastItem != '[' || x == '}' &&
                        lastItem != '{')  {
                    return false;
                }
            }
        }
        return top == 0;
    }

}
