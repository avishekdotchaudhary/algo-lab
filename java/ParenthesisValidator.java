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

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ParenthesisValidator {
    
    private static boolean isValid(String parenthesis){
        int parLen = parenthesis.length();
        Stack<Character> charStack = new Stack<>();
        
        if(parenthesis.isEmpty()) return false;
        
        for(int i = 0; i<parLen; i++){
            char ch = parenthesis.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                charStack.push(ch);
            }
            if(ch == ')' || ch == '}' || ch == ']'){
                if(charStack.isEmpty()) return false;
                
                char top = charStack.pop();
                
                if(!isMatching(top, ch)) return false;
            }
        }
        // Stack should be empty if all brackets matched
        return charStack.isEmpty();
    }
    
    public static boolean isMatching(char top, char ch){
        return (
            (top == '(' && ch == ')') || 
            (top == '{' && ch == '}') || 
            (top == '[' && ch == ']')
            );
    }
    
    
    public static void main(String[] args) {
        String parenthesis = "[{()}][][]{{}}{)";
        if(isValid(parenthesis)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
