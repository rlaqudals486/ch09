package ch09;

public class Genzi implements Character {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("겐지가 벽타고 이동합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("겐지가 벽타고 이동을 멈춥니다.");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("겐지가 수리검으로 공격합니다.");
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("겐지가 용검을 사용합니다.");
	}

}
