/* 
 * Alice's library
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Alice is rearranging her library. She takes the innermost shelf and reverses the order of books. She breaks the walls of the shelf. In the end, there will be only books and no shelf walls. Print the order of books.
Opening and closing walls of shelves are shown by '/' and '\' respectively whereas books are represented by lower case alphabets.
Input
The first line contains string s displaying her library.

Constraints
2 ≤ |s| ≤ 103
Output
Print only one string displaying Alice's library after rearrangement.
Example
Sample input
/u/love\i\

Sample Output
iloveu

Explanation
/u/love\i\
Here Alice breaks the inner most shelf and reverse the order. So the library will be /uevoli\.
Now she breaks the outermost wall and reverses the order. So the library will be iloveu.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
 public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ipStr = br.readLine();
 
		Stack<String> stack = new Stack<String>();
		StringBuffer sb = new StringBuffer();
 
		for (int i = 0; i < ipStr.length(); ++i) {
			if (ipStr.charAt(i) == '/') {
				if (sb.length() > 0) {
					stack.push(sb.toString());
					sb = new StringBuffer();
				}
				stack.push("/");
			} else if (ipStr.charAt(i) == '\\') {
				stack.push(sb.toString());
				sb = new StringBuffer();
				String s = stack.pop();
				StringBuffer sbNew = new StringBuffer();
				while (!s.equalsIgnoreCase("/")) {
					sbNew.insert(0, s);
					s = stack.pop();
				}
				stack.push(sbNew.reverse().toString());
			} else {
				sb.append(ipStr.charAt(i));
			}
		}
		System.out.println(stack.pop());
 
    }
}