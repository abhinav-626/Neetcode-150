class Solution {
    public boolean isValid(String s) {
        Stack<Character> sh = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(char c: s.toCharArray()){
            if(map.containsValue(c)){
                sh.push(c);
            }
            else if(map.containsKey(c)){
                if(sh.empty() || map.get(c)!=sh.pop()){
                    return false;
                }
            }
        }
        return sh.isEmpty();

        
    }
}