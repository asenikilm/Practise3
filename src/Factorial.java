import java.math.BigInteger;
//factorial
public class Factorial {

	public static BigInteger fact(int n){
		if (n<0) return BigInteger.valueOf(-1);
		else if (n<2) return BigInteger.valueOf(0);
		else {
			BigInteger res = BigInteger.valueOf(1);
			for (int i=2;i<=n;i++)
				res = res.multiply(BigInteger.valueOf(i)); // 5!=1*2*3*4*5;
			return res;
		}
			
	}

   //for counting big numbers
}
