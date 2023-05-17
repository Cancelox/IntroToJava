package PartI;


public class BalancedParentheses {

	public static boolean isBalanced(String inString) {
		MyStack<String> ms = new MyStack<String>();
		for(int i=0; i<inString.length(); i++) {
			String ch = inString.substring(i, i+1);
			if(ch.equals("(")) ms.push(ch); 
			else {
				if(ms.empty()) return false;
				else ms.pop();
			}
		}
		return ms.empty();
	}
	
	public static void main(String[] args) {
		boolean result = isBalanced("(()()()())");
		System.out.println(result);
		result = isBalanced("(((())))");
		System.out.println(result);
		result = isBalanced("((((((())");
		System.out.println(result);
	}
}
