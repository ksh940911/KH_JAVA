package test;
/*
 텔레비전을 나타내는 Television 클래스를 정의하고, 
 Television 배열을 이용하는 프로그램을 작성하시오.

- Television 클래스: 채널(정수형) 필드를 가짐
 
- TelevisionTest 클래스: main 메소드에서 다음을 수행
  (1) 크기가 3인 텔레비전 배열에 텔레비전을 생성하여 저장
  (2) 텔레비전 채널을 7, 9, 11로 지정
  (3) 반복문을 이용하여 배열에 저장된 모든 텔레비전의 채널을 출력
 */
public class Television {
	private int channel;

	public int getChannel() {
		return channel;
	}

	public Television(int channel) {
		super();
		this.channel = channel;
	}
}