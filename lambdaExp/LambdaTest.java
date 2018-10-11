package lambdaExp;
@FunctionalInterface
interface oddInterface{
	public boolean Odd(int a);
}
@FunctionalInterface
interface primeInterface{
	public boolean isPrime(int a);
}
@FunctionalInterface
interface palindromeInterface{
	public boolean isPalindrome(int a);
}
public class LambdaTest {
	public static void main(String[] args) {
		oddInterface odd=a -> {
			if(a%2==0)return false;
			else return true;
		};
		System.out.println("Odd number: " + odd.Odd(12));
		
		primeInterface prime=a -> {
			for(int i=2;i<a/2;i++){
				if(a/i==0){
					return false;
				}
			}
			return true;
		};
		System.out.println("Prime number: " + prime.isPrime(13));
		
		palindromeInterface palin=a -> {
			int n,s=0;
			n=a;
			while(n>0){
				s=s*10+n%10;
				n=n/10;
			}
			if(s==a)return true;
			else return false;
		};
		System.out.println("Palindrome number: " + palin.isPalindrome(121));
	}

}
