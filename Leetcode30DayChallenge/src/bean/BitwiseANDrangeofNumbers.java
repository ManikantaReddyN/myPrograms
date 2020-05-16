package bean;

public class BitwiseANDrangeofNumbers {
private static int fun(int m,int n) {
	  int shift=0;
	  while(m<n) {
		  m=m>>1;
	      n=n>>1;
	      shift++;
	  }
	  m=m<<shift;
	return m;
}
	public static void main(String[] args) {
		int m=5,n=7;
		System.out.println(fun(m,n));

	}

}
