import java.math.BigInteger;

public class FactorialCash {
	
	private static final int size = 20;
	private BigInteger[] fact = new BigInteger[size]; 
	private int count = 2;
	
	FactorialCash(){
		fact[0] = BigInteger.valueOf(1);
		fact[1] = BigInteger.valueOf(1);
	}
	
	public BigInteger factorial(int n){
		
		if ((n>(size-1))||(n<0)) return BigInteger.valueOf(-1);
		else if(n<count) return fact[n];
		else return countFact(n);
		
	}

	private BigInteger countFact(int n) {
		
		for(int i=count;i<=n;i++){
			fact[count]=fact[count-1].multiply(BigInteger.valueOf(i));
			count++;
		}
		
		return fact[n];
	}

}
