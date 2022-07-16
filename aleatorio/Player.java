package aleatorio;

public class Player {
	
	 int number;
		
	
	public void guess() {
		number = (int) (Math.random() * 10);
		
		System.out.println("Meu numero é:" +number);
	}

}
