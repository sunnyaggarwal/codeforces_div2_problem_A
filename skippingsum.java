import java.util.* ;
import java.io.* ;
class Main{

	public static void main(String []args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		BufferedOutputStream bos = new BufferedOutputStream(System.out) ;	
		try{
			 
			String str ;
			int N,Q,L,R,K ;
			str = br.readLine() ;
			StringTokenizer st = new StringTokenizer(str," ") ;
			N = Integer.parseInt(st.nextToken()) ;
			Q = Integer.parseInt(st.nextToken()) ;
			int A[] = new int[N+1] ;
			str = br.readLine() ;
			st = new StringTokenizer(str," ") ;
			for(int i=1;i<=N;i++){
				A[i] = Integer.parseInt(st.nextToken()) ;
			}
			long[][] DP = new long[60][N+1] ;
			int index = 0 ;	
			for(int i=1;i<=10;i++){ // maximum value of K
				for(int j=1;j<=i;j++){
					++ index ;
					for(int k=1;k<=N;k++){
						if((k-j)%i == 0){
							DP[index][k] += A[k] ;
						}
						DP[index][k] += DP[index][k-1] ;
					}
				}
			} 
			while(Q-- > 0){
				str = br.readLine() ;
				st = new StringTokenizer(str," ") ;			
				L = Integer.parseInt(st.nextToken()) ;
				R = Integer.parseInt(st.nextToken()) ;
				K = Integer.parseInt(st.nextToken()) ;	
				int starting_index = (L-1)%K+1 ;
				starting_index += ((K-1)*(K)/2) ;
				long ans = DP[starting_index][R] - DP[starting_index][L-1] ;
				System.out.println(ans) ;	
			}
		}catch(IOException ioe){
			ioe.printStackTrace() ;
		}		
	}
};