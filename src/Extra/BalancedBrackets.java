package Extra;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {

    static String isBalanced(String s) {

        Stack<Character> stack =new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');


        int len = s.length();
        for(char ch : s.toCharArray()) {

            if(map.containsKey(ch)){
                    if(stack.empty())
                        return "NO";
                    else if(stack.peek() == map.get(ch))
                        stack.pop();
                    else
                        return "NO";

            }
            else
                stack.add(ch);
        }
        return stack.empty()?"YES":"NO";
    }


    public static void main(String[] args) {

        System.out.println(isBalanced("{{[[(())]]}}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("{(([])[])[]]}"));
    }

}
