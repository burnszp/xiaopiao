package bean;

import java.util.Date;

/**
 * ��Ա
 * 
 * @author burns
 *
 */
public class Member {
	private String memberId;// ����
	private String memberName;// ����
	private float totalPoints;// �ۼ�ʣ�����
	private Date registerDate;// �쿨����
	private String memberType;// ��Ա���

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public float getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(float totalPoints) {
		this.totalPoints = totalPoints;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
}
