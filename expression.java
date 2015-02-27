import java.util.* ;
import java.io.* ;
class Main{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in) ;
		int a , b , c ;
		a = sc.nextInt() ;
		b = sc.nextInt() ;
		c = sc.nextInt() ;
		System.out.println(Math.max(Math.max(Math.max(a+(b*c),(a+b)*c),Math.max(a*(b+c),(a*b)+c)),Math.max(a+b+c,a*b*c))) ;
	}
}