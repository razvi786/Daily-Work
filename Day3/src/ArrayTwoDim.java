
public class ArrayTwoDim {
	
	public static boolean is_prime(int n) {
		
		int count=0;
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				
				count++;
			}
			
		}
		
		if(count==0)
			return true;
		else
			return false;
		
	}
	
	public static int prime_count(int start,int end) {
		
		int count=0;
		
		for(int i=start;i<=end;i++) {
			
			if(i==1)
				continue;
			
			if(is_prime(i)) {
				count++;
			}
		}
		return count;
		
	}
	
	public static int[] prime_values(int start,int end) {
		
		int iterator=0;
		
		int range=prime_count(start,end);
		
		int a[]=new int[range];
		
		for(int i=start;i<=end;i++) {
			
			if(i==1)
				continue;
			
			if(is_prime(i)) {
				a[iterator]=i;
				iterator++;
			}
		}
		
		return a;
		
	}
	
	public static void display(int a[]) {
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String args[]) {
		
		int prime[][]=new int[10][];
		
		for(int i=1,j=10,itr=0 ; i<=100 ; i+=10,j+=10,itr++) {
				
				int range=prime_count(i,j);
					
					prime[itr]=new int[range];
					
					prime[itr]=prime_values(i,j);
					
					display(prime[itr]);
					
					System.out.println();
			
		}
		
	}
	
}
