package ex1_xml3_pvalue;

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
	}

	public MemberDAO(MemberBean member) {
		this.member = member;
	}

}
