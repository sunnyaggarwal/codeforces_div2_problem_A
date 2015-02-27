import java.util.* ;
public class Main{

	public static void main(String []args){
		Scanner sc = new Scanner(System.in) ;
		int N = sc.nextInt() ;
		int A[][] = new int[N][2] ;
		for(int i=0;i<N;i++){
			A[i][0] = sc.nextInt() ;
			A[i][1] = sc.nextInt() ;
		}
		int ans = 0 ; 
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(i!=j){
					if(A[i][0] == A[j][1])
						ans ++ ;
				}
			}
		}
		System.out.println(ans) ;
	}
}