package ch09;

public class McCree implements Character {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("맥크리가 이동합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("맥크리가 이동을 멈춥니다.");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("맥크리가 피스키퍼 권총으로 공격합니다.");
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("맥크리가 황야의 무법자를 사용합니다.");
	}

}
