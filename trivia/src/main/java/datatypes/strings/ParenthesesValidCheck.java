package datatypes.strings;

import datatypes.stacks.IStack;
import datatypes.stacks.StackCustom;

/**
 * Created by Alexander on 11.07.2017.
 */
public class ParenthesesValidCheck {

    /** Check for validity string with parentheses
     * (<>) -> true, <(>) -> false etc.
     * */
    public static boolean checkForValidPrentheses(String string) {

        IStack<Character> stack = new StackCustom<Character>();

        for (char c : string.toCharArray()) {
            if (c == '(' || c == '<') {
                stack.push(c);
            }
            if (c == ')' || c == '>') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != reverseParenthes(c))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private static char reverseParenthes(char c){
        if(c=='(') return ')';
        if(c==')') return '(';
        if(c=='>') return '<';
        if(c=='<') return '>';
        return ' ';
    }


}
