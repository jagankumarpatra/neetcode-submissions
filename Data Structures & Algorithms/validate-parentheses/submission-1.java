class Solution {
    public boolean isValid(String s) {
        Stack<Character>st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='[' || ch=='(' || ch=='{'){
                st.push(ch);
            }
             if (ch == ']' || ch == ')' || ch == '}') {  // fix 1: separate if
                if (st.isEmpty()) return false;           // fix 2: empty check
                char top = st.pop();                      // fix 3: top is opening bracket
                if (ch == ')' && top != '(') return false; // fix 4: pair check
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;
            }
        }
        return st.isEmpty();
    }
}
