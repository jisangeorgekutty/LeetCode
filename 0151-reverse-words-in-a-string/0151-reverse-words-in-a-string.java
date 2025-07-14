class Solution {
    public static String reverseWords(String s) {
        String trimmed=s.trim();
        String[] words=trimmed.split("\\s+");

        String result = "";
        for(int i=words.length-1;i>=0;i--){
            result+=words[i];
            if(i!=0){
            result+=" ";
            }
        }
        return result;
    }

    public static void main(String[] args){
        String s=" Hello World ";
        System.out.println(reverseWords(s));
    }

    }