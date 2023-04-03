import java.util.Stack;
import java.util.*;

public class ExpressionValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expresstion to check it is valid or not : ");
        String expr = sc.nextLine();
        boolean isValid = isValidExpression(expr);
        System.out.println("The expression \""+"\" is "+(isValid ? "valid":"invalid"));
    }
    public static boolean isValidExpression(String expr){
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<expr.length();i++){
            char c = expr.charAt(i);
            if (c =='('||c =='['||c =='{'){
                stack.push(c);
            }
            else if (c ==')'||c ==']'||c =='}'){
                if(stack.isEmpty()){
                    return false;
                }else if (c == ')' && stack.peek()=='(' ||
                          c == ']' && stack.peek()=='[' ||
                          c == '}' && stack.peek()=='{'
                ){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
