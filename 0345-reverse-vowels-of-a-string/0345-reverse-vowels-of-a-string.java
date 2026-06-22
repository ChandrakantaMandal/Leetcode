class Solution {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int st = 0, e = ch.length - 1;


        while (st <= e) {
            while (st < e && !isVowels(ch[st]))
                st++;
            while (st < e && !isVowels(ch[e]))
                e--;

            char temp = ch[st];
            ch[st] = ch[e];
            ch[e] = temp;

            st++;
            e--;
        }
  return new String(ch);
    }
    private boolean isVowels(char c){
     return "aeiouAEIOU".indexOf(c)!=-1;
    }
}