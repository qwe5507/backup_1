package ex1_xml4_list;

import java.util.List;

public class ListBean {

	private List<Integer> inList;
	private List<MemberBean> memberList;

	public List<MemberBean> getMemberList() {
		return memberList;
	}
	public void setMemberList(List<MemberBean> memberList) {
		this.memberList = memberList;
	}
	
	public ListBean() {
	}
	//constructor
	public ListBean(List<Integer> inList) {
		this.inList = inList;
	}

	//setter
	public void setInList(List<Integer> inList) {
		this.inList = inList;
	}
	//getter
	public List<Integer> getInList() {
		return inList;
	}
	

	
	
}
