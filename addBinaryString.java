/**
 * addBinaryString
 */
public class addBinaryString {

    static String add_binary(String x,String y){
        //this steps is very imp for convert string value to binary
       int num1 = Integer.parseInt(x,2);
       int num2 = Integer.parseInt(y,2);
       int sum = num1+num2;
       String result = Integer.toBinaryString(sum);
       return result;
    }

    public static void main(String[] args) {
        String x =  "10";
        String y = "01";
        System.out.println(add_binary(x, y));
    }
}