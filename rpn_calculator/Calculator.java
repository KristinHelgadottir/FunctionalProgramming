package rpn_calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author Kristin 
 * // make a new Stack 
 * // switch case 
 * // a way to see if what is pop'ed() is a number or +,-,*,/
 */
public class Calculator {

    public Calculator() {
    }

    public String cleanUp(String toClean) 
    {
        String firstClean = toClean.replaceAll("[^\\^\\*\\+\\-\\d/\\s]", ""); // remouving everything that is not
        String allClean = firstClean.replaceAll("\\s+", " ");
        return allClean;
    }

    public Stack<Integer> calculating(Stack<Integer> stack) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String toClean = cleanUp(input);
        String[] splitStr = toClean.split("\\s");

        for (String bla : splitStr) {
            int operand = 0;

            switch (bla) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    stack.push(stack.pop() - stack.pop());
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    stack.push(stack.pop() / stack.pop());
                    break;

                default:
                    stack.push(Integer.parseInt(bla));
                    break;
            }
            getStack(stack);
            calculating(stack);
        }
        
        System.out.println("the stack");
        return stack;
    }

    public void getStack(Stack<Integer> stack) // The protocol
    {
        for (Integer integer : stack) 
        {
            System.out.println(">" + integer);
        }
    }

  
}
