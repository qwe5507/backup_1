package ex1_xml2_ref;

public class MemberDAO {
	private MemberBean member;
	
	//1. setter
	public void setMember(MemberBean member) {
		this.member = member;
	}
	
	public void insert() {
		member.output();
	}

	public MemberDAO() {
		System.out.println("멤버다오 생성자0");
	}

	public MemberDAO(MemberBean member) {
		this.member = member;
		System.out.println("멤버다오 생성자1");
	}

}
