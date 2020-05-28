package alsten;

import java.util.Stack;
import java.util.Scanner;
public class CheckBalancedParentesisMain {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string");
    String ct=s.next();
String checkBalancedExpr1=checkBalancedParentesis(ct);
System.out.println(ct+" is "+checkBalancedExpr1);

}
public static String checkBalancedParentesis(String expr)
{
if (expr.isEmpty())
return "True";

Stack<Character> stack = new Stack<Character>();
for (int i = 0; i < expr.length(); i++)
{
char current = expr.charAt(i);
if (current == '{' || current == '(' || current == '[')
{
stack.push(current);
}
if (current == '}' || current == ')' || current == ']')
{
if (stack.isEmpty())
return "False";
char last = stack.peek();
if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
stack.pop();
else 
return "Not Balanced";
}
}
return stack.isEmpty()?"Balanced":"Not Balanced";
}

}
