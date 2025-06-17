class PalindromeString{
    private static boolean isPalindrome(String input){
        String reverse = "";
        for(int i=input.length()-1; i>=0; i--){
            reverse += input.charAt(i);
        }
        if(reverse.equalsIgnoreCase(input)) return true; 
        else return false;
    }
    
    
    public static void main(String[] args){
        String input = "A AA B";
        String[] inputs = {
    // ✅ Valid Palindromes
    "madam",
    "racecar",
    "level",
    "noon",
    "deified",
    "civic",
    "rotor",
    "radar",
    "refer",
    "a",
    "",

    // ❌ Non-Palindromes
    "hello",
    "world",
    "java",
    "example",
    "palindrome",
    "openai",
    "chatgpt",
    "reverse",
    "string",

    // 🔁 Mixed Case Palindromes
    "Madam",
    "RaceCar",
    "LeVel",
    "Rotor",
    "Radar",

    // 🧹 Palindromes with Spaces
    "nurses run",
    "was it a car or a cat I saw",
    "never odd or even",

    // ✨ Palindromes with Punctuation & Spaces
    "A man, a plan, a canal, Panama",
    "Eva, can I see bees in a cave?",
    "Madam, in Eden, I'm Adam",

    // 😃 Emojis / Unicode
    // "😊madam😊",
    // "💡racecar💡",
    // "madam😊",
    // "🏠level🏠",

    // ⚙️ Edge/Invalid Inputs
    null,
    " ",
    "   ",
    "  a  "
};
        
        for(String arg: inputs){
            if(isPalindrome(arg.replace(" ", ""))) System.out.println("Is Palindrome");
            else System.out.println("Is Not Palindrome");
        }
    }
}