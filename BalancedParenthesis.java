import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String s = "[()]{}{[()()]()}";
		boolean ans = checkBalanced(s);
		System.out.println(ans);

	}

	public static boolean checkBalanced(String s) {
		Stack<Character> st = new Stack<Character>();
		boolean res = true;
		for (int i = 0; i < s.length(); i++) {
      //If opening parenthesis then push to stack
			if ((s.charAt(i) == '(') || (s.charAt(i) == '{') || (s.charAt(i) == '['))
				st.push(s.charAt(i));
      //If  closing parenthesis then compare with top element of stack
			else {
				if (s.charAt(i) == ')') 
					if (!st.peek().equals('(')) {
						return false;
					}
				} else if (s.charAt(i) == '}') {
					if (!st.peek().equals('{')) {
						return false;
					}
				} else if (s.charAt(i) == ']') {
					if (!st.peek().equals('[')) {
						return false;
					}
				}
        //If openning parenthesis in stack matches with closing paranthesis in string then popout the element
				st.pop();
			}

		}
		return res;
	}
}
