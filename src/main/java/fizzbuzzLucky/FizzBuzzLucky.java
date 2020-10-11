package fizzbuzzLucky;

public class FizzBuzzLucky {
    private String seriesString = "";

    public String printSeries(int num) {
        String spacer = " ";
        for (int i=1; i<=num; i++) {
            seriesString += testDivisorsAndSubstring(i);
            if(i!=num) seriesString += spacer;
        }
        System.out.println(seriesString);

        return seriesString;
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

