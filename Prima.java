public class Prima{
	public static void main(String[] args) {
		int tamp=0;
		for(int i=0; i<=15; i++){
			
			for (int j=2; j<=15; j++) {
				if(i%j==0) tamp++;
			}
		if(tamp==1) System.out.println(i+" adalah bilangan prima.");
		else System.out.println(i+" bukan bilangan prima");
		tamp=0;
		}
	}
}