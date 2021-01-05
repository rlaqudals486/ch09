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
		
		
	}

}
