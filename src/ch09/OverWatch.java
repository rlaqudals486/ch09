package ch09;

public class OverWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player = new Player();
		Character ch;
		ch = new McCree();
		
		player.cMove(ch);
		player.cAttack(ch);
		player.cSkill(ch);
		player.cStop(ch);
		
		ch = new Genzi();
		
		player.cMove(ch);
		player.cAttack(ch);
		player.cSkill(ch);
		player.cStop(ch);
		
	}

}
