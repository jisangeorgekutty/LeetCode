class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            if((candy+extraCandies)>=max){
            result.add(true);
        }else{
        result.add(false);
        }
    }
    return result;
    }

    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println("Result " + result);
    }
}