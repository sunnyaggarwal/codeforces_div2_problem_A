import java.util.* ;
public class Main{

	public static void main(String []args){
		Scanner sc = new Scanner(System.in) ;
		int N , M ;
		N = sc.nextInt() ;
		M = sc.nextInt() ;
		int F[] = new int[M] ;
		for(int i=0;i<M;i++){
			F[i] = sc.nextInt() ;
		}
		Arrays.sort(F) ;
		int ans = 10000 ;
		for(int i=0;i<=M-N;i++){
			ans = Math.min(ans,F[i+N-1]-F[i]) ;
		}
		System.out.print(ans) ;
	}
}