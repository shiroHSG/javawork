package _07_ex;

public class Product_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv();

        // 전원 켜기
        tv.powerOn();

        // 볼륨 올리기
        tv.volumeUp(10);

        // 채널 변경
        tv.setChannel(5);

        // 볼륨 내리기
        tv.volumeDown(3);

        // 전원 끄기
        tv.powerOff();

        // 전원이 꺼진 상태에서 동작 테스트
        tv.volumeUp(5);
        tv.setChannel(10);
	}

}
