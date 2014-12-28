package bean;

import java.util.Date;

/**
 * 会员
 * 
 * @author burns
 *
 */
public class Member {
	private String memberId;// 卡号
	private String memberName;// 姓名
	private float totalPoints;// 累计剩余积分
	private Date registerDate;// 办卡日期
	private String memberType;// 会员类别

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
