package rpn_calculator;

import java.io.IOException;
import java.util.Stack;

/**
 *
 * @author Kristin
 */
public class RPN_Calculator 
{
    public static void main(String[] args) throws IOException 
    {
        Calculator calc = new Calculator();
        Stack<Integer> stack = new Stack<>();
        calc.calculating(stack);
        
    }
    
}
