/*
 * 
 * Encode Decode (Contest)
Medium

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Person A and Person B uses an encryption based system for their conversation. Each conversation message is encoded from the source end and decoded in the destination end using a shared private positive number key known to each other.
The algorithm is illustrated with an example.
Input
The first line of the input contains an integer O denoting the operation (1 for Encoding and 2 for Decoding)
The Next line of the input contains the key K, and the next line contains the message M.

Constraints
1 ≤ O ≤ 2
1 ≤ |K| ≤ 105
1 ≤ |M| ≤ 105
Note : Not necessarily |M| = |K|, this can also be the case |M| ≠ |K| so for this cases operations performed will end if it either reach the message length or the key length.
Output
Print the final string after performing the operation, or -1 to all exception scenarios.
Example
Sample Input 1
1
123
open

Sample Output 1
oppeeen

Explanation
Here Input message characters are duplicated based on each digit of the key.

Sample Input 2
1
112
ramm

Sample Output 2
ram


Here the message characters are compressed based on each digit of the key.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int O=sc.nextInt();
        String message=sc.next();
        String key=sc.next();
        System.out.println(secureChannel(O, message, key));
    }

    static final String negResponse = "-1";

    static String secureChannel(int operation, String key, String message) {

        switch (operation) {
            case 1:
                return encoded(message, key);
            case 2:
                return decoded(message, key);
            default:
                return negResponse;
        }

    }

    private static String isEmpty(String message, String key) {
        if (message == null || key == null)
            return negResponse;

        if (message.isEmpty() && key.isEmpty())
            return message;

        if (!message.isEmpty() && key.isEmpty())
            return message;

        if (message.isEmpty() && !key.isEmpty())
            return negResponse;


        return null;

    }

    private static String decoded(String message, String key)
    {
        String corner = isEmpty(message, key);
        if (corner != null)
            return corner;


        if (key.equals("0"))
            return message;

        int index = 0;
        final StringBuilder res = new StringBuilder();

        char keys[] = key.toCharArray();

        int i;
        
        for (i=0; i< keys.length; i++)
        {
            if (Character.isDigit(keys[i])) 
            {
                int keyV = keys[i] - '0';
                char current = message.charAt(keyV+index-1);
                index += keyV;
                res.append(current);
            }
            else{
                return "-1";
            }
        }
        
        return getMessage(message, index, res, keys, i);
    }

    private static String getMessage(String message, int index, StringBuilder res, char[] keys, int i) {
        if (index < message.length()) {
            String remaining = message.substring(index);
            res.append(remaining);
        }
        return res.toString();

    }
    private static String encoded(String message, String key) {
        String corner = isEmpty(message, key);
        if (corner != null)
            return corner;


        int index = 0;
        final StringBuilder res = new StringBuilder();

        char keys[] = key.toCharArray();

        int i;
        for (i = 0; i < keys.length; i++) {

            if (index < message.length()) {
                char current = message.charAt(index);

                if (Character.isDigit(keys[i])) {
                    int keyV = keys[i] - '0';

                    for (int x = 0; x < keyV; x++) {
                        res.append(current);
                    }

                    index++;
                } else
                    return negResponse;
            } else
                break;

        }

        return getMessage(message, index, res, keys, i);

    }
}