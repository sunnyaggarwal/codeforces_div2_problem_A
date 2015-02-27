import java.util.* ;
class Main{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in) ;
		int T , A , B ;
		T = 1 ; 
		while(T-->0){
			A = sc.nextInt() ;
			B = sc.nextInt() ;
			A = Math.min(A,B) ;
			if(A%2 == 0){
				System.out.println("Malvika") ;
			}else{
				System.out.println("Akshat") ;
			}
		}
	}
}