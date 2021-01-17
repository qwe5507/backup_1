package ex2_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")
public class MemberDAO {
	
	// 3. 필드기반의 의존성 주입방식 [자바에선 멤버변수를 필드였다]
	@Autowired 
	private MemberBean member;
	
	//1. setter
//	public void setMember(MemberBean member) {
//		this.member = member;
//	}
	
	public void insert() {
		member.output();
	}

//	public MemberDAO() {
//		System.out.println("멤버다오 생성자0");
//	}
//
//	public MemberDAO(MemberBean member) {
//		this.member = member;
//		System.out.println("멤버다오 생성자1");
//	}

}
