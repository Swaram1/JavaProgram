package Binary;

public class addbinary {

		    public static String addBinary(String a, String b) {
		        int num1= Integer.parseInt(a,2);
		        int num2=Integer.parseInt(b,2);
		        int sum=num1+num2;
		        String result = Integer.toBinaryString(sum);
		        return result;
		    }
		
public static void main(String args[])
{
    String x = "10", y = "11";

    System.out.print(addBinary(x, y));
}
}
 


