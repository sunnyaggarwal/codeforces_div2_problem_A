import java.util.* ;

public class Main{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in) ;
		int N , A , B , C , sum1 , sum2 ,sum3 ;
		sum1 = sum2 = sum3 = 0 ; 
		N = sc.nextInt() ;
		while(N-->0){
			A = sc.nextInt() ;
			B = sc.nextInt() ;
			C = sc.nextInt() ;
			sum1 += A ;
			sum2 += B ;
			sum3 += C ;
		}
		System.out.println(((sum1 == 0 && sum2 == 0 && sum3 == 0)?"YES":"NO")) ;
	}
}