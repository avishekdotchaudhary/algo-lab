class CheckPalindromeNumber{
    private static boolean isPalindrome(int number){
        int original = number;
        int reverse = 0;
        if(number<0) return false;
        while(number>0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return original == reverse;
    }
    
    public static void main(String[] args) {
        int number = 818;
        // Input can be hard coded or passed through terminal: eg. "javac CheckPalindromeNumber.java" will compile
        // "java CheckPalindromeNumber 818" will call the program. Here, 818 is the argument we are passing through terminal or command line.
        int value = (args != null && args.length > 0 && args[0] != null && !args[0].isEmpty())
            ? Integer.parseInt(args[0]) 
            : number;
        if(isPalindrome(value)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}