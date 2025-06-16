import java.util.Stack;

/**
 * Algorithm
 * Steps:
1. Initialize an empty stack.

2. Iterate through each character ch in the string expression:

    - If ch is an opening bracket ((, {, or [):

        -Push ch onto the stack.

    - Else if ch is a closing bracket (), }, or ]):

        -If the stack is empty, return false (no matching opening bracket).

        -Pop the top character from the stack.

        -Check if the popped character is the matching opening bracket for ch:

            -If it doesn't match, return false.

3. After the loop, check if the stack is empty:

    - If the stack is empty, return true (all brackets matched).

    - If not, return false (some opening brackets were not closed).

💡 Matching pairs:
( matches with )

{ matches with }

[ matches with ]

📌 Example:
Input: {[()]}
Stack Operations:

{ → push

[ → push

( → push

) → matches ( → pop

] → matches [ → pop

} → matches { → pop
Stack is empty → ✅ Valid

 **/

public class ParenthesisValidator {

    public static boolean isValid(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket, check for match
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }

        // Stack should be empty if all brackets matched
        return stack.isEmpty();
    }

    // Helper method to match opening and closing brackets
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[}]()";

        System.out.println(test1 + " is valid: " + isValid(test1));  // true
        System.out.println(test2 + " is valid: " + isValid(test2));  // false
    }
}
