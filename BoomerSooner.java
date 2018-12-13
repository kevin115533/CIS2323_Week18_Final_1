public class BoomerSooner{
	public static void main (String[] args){
		for(int i = 1; i<=1000; i++){
			if((i%3) == 1){
				System.out.println("Boomer");
			}
			if((i%5) == 1){
				System.out.println("Sooner");
			}
			if((i%3) == 1 && ((i%5) == 1)){
				System.out.println("Boomer Sooner");
			}
			else{
				System.out.println(i);
			}
		}
	}
	
}
