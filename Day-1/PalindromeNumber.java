class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x%10;

            reversed = reversed * 10  + digit ;
            x=x/10;
        }
        return original == reversed;
    }
}
public class Main{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int x = scanner.nextInt();

        Solution solution = new Solution();
        boolean result = solution.isPalindrome(x);
        System.out.println(result);

    }
}