package bean;

import java.util.Date;

public class Cashier {
	private String cashierId;// 十位 主键
	private String cashierName;// 姓名
	private String cashierTel;// 电话
	private String cashierPwd;// 密码
	private String cashierIdNumber;// 编码
	private Date cashierHireDate;// 雇佣日期

	public String getCashierId() {
		return cashierId;
	}

	public void setCashierId(String cashierId) {
		this.cashierId = cashierId;
	}

	public String getCashierName() {
		return cashierName;
	}

	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}

	public String getCashierTel() {
		return cashierTel;
	}

	public void setCashierTel(String cashierTel) {
		this.cashierTel = cashierTel;
	}

	public String getCashierPwd() {
		return cashierPwd;
	}

	public void setCashierPwd(String cashierPwd) {
		this.cashierPwd = cashierPwd;
	}

	public String getCashierIdNumber() {
		return cashierIdNumber;
	}

	public void setCashierIdNumber(String cashierIdNumber) {
		this.cashierIdNumber = cashierIdNumber;
	}

	public Date getCashierHireDate() {
		return cashierHireDate;
	}

	public void setCashierHireDate(Date cashierHireDate) {
		this.cashierHireDate = cashierHireDate;
	}

}
