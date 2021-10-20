import java.util.Stack;

public class reverse {
    public int reverse(int x){
        int neg = 0;
        int counter = 1;
        int temp =  1;
        int tempCounter = 1;
        int reverse= 0;
        Stack<Integer> stack = new Stack<>();
        if (x< Math.pow(-2, 31) || x>(Math.pow(2, 31)-1)){
            return 0;
        }
        if(x<0) {
            neg = 1;
            x=-x;
        }
        while(x>0){
            temp = x%(int)(Math.pow(10,counter));
            stack.push(temp/tempCounter);
            x=x-temp;
            tempCounter = tempCounter*10;
            counter++;
        }
        counter = 1;
        while(!stack.empty()) {
            int y = stack.pop();
            reverse += +y * (counter);
            counter = counter * 10;
        }
        if(neg == 1){
            reverse = -reverse;
        }
        return reverse;
    }
}
