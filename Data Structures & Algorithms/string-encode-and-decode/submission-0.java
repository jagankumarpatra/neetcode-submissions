class Solution {
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);         // find the delimiter
            int len = Integer.parseInt(str.substring(i, j)); // read length
            result.add(str.substring(j + 1, j + 1 + len));  // read exactly `len` chars
            i = j + 1 + len;                     // advance past the string
        }
        return result;
    }
}