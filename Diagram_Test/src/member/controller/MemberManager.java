package member.controller;

import member.model.vo.Member;

public class MemberManager {
	Member[] arr = new Member[40];
	int i = 0; //0~8까지 증가할예정
	
	public void insertMember(Member m) {
		arr[i] = m;
		i++;
	}
	
	public void printData() {
		for(int j=0;j<i;j++) {
			System.out.println("이름 : " + arr[j].getName() + " 등급 : " + arr[j].getGrade() + " 포인트 : " +arr[j].getPoint() +" 이자 : " + arr[j].interest());
		}
	}
}
/**
Member멤버변수 : 이름,등급,포인트
member멤버함수 : 컨스트럭터(생성자) , setter/getter 만들기
> Silver 등급은 2% 를 곱한값이 이자 포인트
> Gold 등급은 5% 를 곱한값이 이자 포인트
> Vip 등급은 10% 를 곱한값이 이자 포인트
> VVip 등급은 15% 를 곱한값이 이자 포인트
Control 클래스 이름 : memer.controller.MemberManager
MemberManager 멤버변수 Member[] : Silver 등급, Gold 등급등 회원을 최대 40명 관리할수 있는  객체배열, 인덱스 추가
MemberManager 멤버함수 : insertMember(Member m), printData 
주의할점 : 적절한 접근제어 지시자 사용 (private,public)
 */
