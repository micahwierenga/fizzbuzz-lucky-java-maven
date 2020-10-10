package fizzbuzzLucky;

public class FizzBuzzLucky {
    public void printSeries(int num) {
        for (int i=1; i<=num; i++) {
            System.out.println(testDivisorsAndSubstring(i));
        }
    }

    public String testDivisorsAndSubstring(int num) {
        String strNum = Integer.toString(num);
        if(strNum.contains("3")) {
            return "lucky";
        } else if(num % 15 == 0) {
            return "fizzbuzz";
        } else if(num % 5 == 0) {
            return "buzz";
        } else if(num % 3 == 0) {
            return "fizz";
        } else {
            return strNum;
        }
    }
}

