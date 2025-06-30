import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length();i++) {
            if ((s.charAt(i) == ')') && (!(stack.isEmpty())) && (((char) stack.peek())=='(')){
                stack.pop();}
            else if ( (s.charAt(i) == ']') && (!(stack.isEmpty())) && (((char)(stack.peek()))=='[')){
                stack.pop();}
            else if((s.charAt(i) == '}')  && ((!(stack.isEmpty())) && ((char)(stack.peek()))=='{')){
                stack.pop();}
            else{
                stack.push(s.charAt(i));}
    }
        return stack.isEmpty();
    }

}