public class isPalindrome {
    boolean isPalindrome(int x){
        int reverseNum = 0;
        if(x<0 || (x%10 == 0 && x != 0)){
            return false;
        }
        while(x>reverseNum){
            reverseNum = reverseNum*10 + x%10;
            x=x/10;
        }
        return (x==reverseNum || x== reverseNum /10);
    }
}
