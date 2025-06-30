import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length();i++) {
            if ( (!(stack.isEmpty())) && (((char) stack.peek())=='(') && (s.charAt(i) == ')') ){
                stack.pop();}
            else if ((!(stack.isEmpty())) && (((char)(stack.peek()))=='[') && (s.charAt(i) == ']')  ){
                stack.pop();}
            else if( ((!(stack.isEmpty())) && ((char)(stack.peek()))=='{') && (s.charAt(i) == '}') ){
                stack.pop();}
            else{
                stack.push(s.charAt(i));}
    }
        return stack.isEmpty();
    }

}