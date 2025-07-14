class Solution {
    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";

        int start=0;
        int end=s.length()-1;
        char[] c=s.toCharArray();

        while(start<end){
            while(start<end&&vowels.indexOf(c[start])==-1){
                start++;
            }
            while(start<end&&vowels.indexOf(c[end])==-1){
                end--;
            }

            char temp=c[start];
            c[start]=c[end];
            c[end]=temp;

            start++;
            end--;
        }

        return new String(c);
    }

    public static void main(String[] args){
        String s="IceCreAm";
        System.out.println(reverseVowels(s));
    }
}