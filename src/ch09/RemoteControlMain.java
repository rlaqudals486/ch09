package ch09;

public class RemoteControlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televison tv = new Televison();
		Audio audio = new Audio();
		
		tv.turnOn();
		tv.setMute(true);
		tv.setVolume(15);
		tv.turnOff();
		
		audio.turnOn();
		audio.setMute(false);
		audio.setVolume(-10);
		audio.turnOff();
		
//		인터페이스도 다형성 구현이 가능함
//		인터페이스 타입의 변수는 생성이 가능함(객체화는 불가)
//		인터페이스 타입의 변수에 구현 클래스 타입의 객체를 대입할 수 있음
		
		
		System.out.println("----- interface의 다형성 -----");
		RemoteControl rc;
		rc = tv;
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(5);
		rc.turnOff();
		
		rc = audio;
		rc.turnOn();
		rc.setMute(false);
		rc.setVolume(0);
		rc.turnOff();
		
		System.out.println("----- 추상 클래스로 구현한 RemoteControl -----");
		
		Televison2 tv1 = new Televison2();
		Audio2 audio1 = new Audio2();
		
		tv1.turnOn();
		tv1.setMute(true);
		tv1.setVolume(15);
		tv1.turnOff();
		
		audio1.turnOn();
		audio1.setMute(false);
		audio1.setVolume(-10);
		audio1.turnOff();
		
		System.out.println("----- 추상 클래스로 구현한 다형성");
		
		RemoteControlClass rcc;
		
		rcc = tv1;
		rcc.turnOn();
		rcc.setMute(true);
		rcc.setVolume(5);
		rcc.turnOff();
		
		rcc = audio1;
		rcc.turnOn();
		rcc.setMute(false);
		rcc.setVolume(0);
		rcc.turnOff();
		
		System.out.println("\n----- 익명 구현 객체 사용 -----\n");
		
//		익명 구현 객체 사용
//		익명 구현 객체도 클래스임
//		익명이기 때문에 상속이 안됨, 인터페이스로부터 상속받은 모든 추상메서드를 필수로 구현해야함
		RemoteControl rc1 = new RemoteControl() {
			private int volume; // 클래스의 멤버 변수
			@Override
			public void turnOn() {
				System.out.println("전원이 켜집니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("전원이 꺼집니다.");
			}
			@Override
			public void setVolume(int volume) {
				if (volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
				}
				else if (volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}
				else {
					this.volume = volume;
				}
				
				System.out.println("현재 볼륨은 " + this.volume);
			}
		};
//		사용 방법은 동일함
		rc1.turnOn();
		rc1.setVolume(10);
		rc1.setMute(true);
		rc1.turnOff();
	}

}
