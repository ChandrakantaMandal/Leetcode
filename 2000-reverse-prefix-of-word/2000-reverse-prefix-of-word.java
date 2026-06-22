class Solution {
    public String reversePrefix(String word, char ch) {
         int s=0,e=-1;
 char chrArr[]=word.toCharArray();
  for(int i=0;i<word.length();i++){
    if(ch==chrArr[i]){
        e=i;
        break;
    }
  }
 if (e == -1) return word;
while(s<=e){
    char temp=chrArr[s];
    chrArr[s]=chrArr[e];
    chrArr[e]=temp;

    s++;
    e--;
}
   return new String(chrArr);     
    }
}