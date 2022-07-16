package aleatorio;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		int guessp1= 0;
		int guessp2= 0;
		int guessp3= 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random()*10);
		System.out.println("Decidindo numero"+ targetNumber);
		
		while(true) {
			
			System.out.println("O numero escolhido foi: "+targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("o jogador um escolheu o numero "+guessp1);
			guessp2 = p2.number;
			System.out.println("o jogador dois escolheu o numero "+guessp2);
			guessp3 = p3.number;
			System.out.println("o jogador tres escolheu o numero "+guessp3);
			
			if(guessp1 == targetNumber) {
				p1isRight = true;
			}
			if(guessp2 == targetNumber) {
				p2isRight = true;
			}
			if(guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if(p1isRight || p2isRight || p3isRight) {
				
				System.out.println("O ganhador foi: ");
				System.out.println("o jogador um acertou? "+p1isRight);
				System.out.println("o jogador um acertou? "+p2isRight);
				System.out.println("o jogador um acertou? "+p3isRight);
				System.out.println("Fim");
				System.out.println("");
				break;
				
			}else {
				System.out.println("Nenhum ganhador, tentar novamente!");
			}
			
			
		}
		
	}

}
