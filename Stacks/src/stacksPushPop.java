import java.util.*;

public class stacksPushPop {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("bottom plate");
		printStack(stack);
		stack.push("middle plate");
		printStack(stack);
		stack.push("top plate");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	
	private static void printStack(Stack<String> s) {
		if (s.isEmpty())
			System.out.println("You have nothing in your stack");
		else
			System.out.printf("%s TOP\n", s);
	}
}
