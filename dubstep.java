import java.util.* ;
public class Main{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in) ;
		String str ;
		str = sc.next() ;
		int idx1 , idx2 , N ;
		N = str.length() ;
		idx1 = 0 ; 
		while(idx1 < N){
			int idx = idx1 ;
			if(idx < N && str.charAt(idx) == 'W'){
				idx ++ ;
				if(idx < N && str.charAt(idx) == 'U'){
					idx ++ ;
					if(idx < N && str.charAt(idx) == 'B'){
						idx ++ ;
					}
				}
			}
			if(idx - idx1 == 3){
				idx1 = idx ;
			}else{
				break ; 
			}
		}	
		idx2 = N-1 ; 
		while(idx2 >= idx1){
			int idx = idx2 ;
			if(idx >= idx1 && str.charAt(idx) == 'B'){
				idx -- ; 
				if(idx >= idx1 && str.charAt(idx) == 'U'){
					idx -- ; 
					if(idx >= idx1 && str.charAt(idx) == 'W'){
						idx -- ; 
					}
				}
			}
			if(idx2-idx == 3){
				idx2 = idx ;
			}else{
				break ; 
			}
		}	
		String ans = "" ;
		boolean ok = false ; 
		while(idx1 <= idx2){
			int idx = idx1 ;
			if(idx < N && str.charAt(idx) == 'W'){
				idx ++ ;
				if(idx < N && str.charAt(idx) == 'U'){
					idx ++ ;
					if(idx < N && str.charAt(idx) == 'B'){
						idx ++ ;
					}
				}
			}
			if(idx - idx1 == 3){
				idx1 = idx ;
				ok = true ; 
			}else{
				if(ok){
					ans += " " ;
				}
				ans += str.charAt(idx1) ;
				idx1 ++ ; 
				ok = false ;  
			}		
		}
		System.out.println(ans) ;
	}
}