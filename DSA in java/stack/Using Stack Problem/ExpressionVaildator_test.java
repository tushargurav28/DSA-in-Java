import java.util.Scanner;

public class ExpressionVaildator_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expresstion to check it is valid or not : ");
        String expr = sc.nextLine();
        boolean isValid = isValidExpression(expr);
        System.out.println("The expression \""+expr+"\" is "+(isValid ? "valid":"invalid")); //ternary operator

        /*
        ternary operator syntax
        (condition) ? "first exprestion " : "Second expretion"

        */ 

    }

    // method / function for check the exprestion is valid or invalid 
    public static boolean isValidExpression(String expr) {
        int stackSize = 0;
       // declare stack using character array
        char[] stack = new char[expr.length()];

        // iterate expression using for loop
        
        for(int i = 0; i < expr.length(); i++) {
            // check each character and compair
            char c = expr.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack[stackSize++] = c;
            } else if (c == ')' || c == ']' || c == '}') {
                if (stackSize == 0) {
                    return false;
                } else if (c == ')' && stack[stackSize - 1] == '(' ||
                          c == ']' && stack[stackSize - 1] == '[' ||
                          c == '}' && stack[stackSize - 1] == '{') {
                    stackSize--;
                } else {
                    return false;
                }
            }
        }
        return stackSize == 0;
    }
}

