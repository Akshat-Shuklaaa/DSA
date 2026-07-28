class Solution {
    public boolean isPalindrome(int x) {

if(x < 0)
        return false;
    long original = x;
    long reverse = 0;
    while(x!=0){
        long digit = x % 10;
        x /= 10;
        reverse = reverse * 10 + digit;
    }
    return original == reverse;
}

}