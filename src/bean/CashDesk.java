package bean;

/**
 * 收银台
 * 
 * @author burns
 *
 */
public class CashDesk {
	private String cashDeskId;// 收银台 编号
	private String description;// 描述信息？

	public String getCashDeskId() {
		return cashDeskId;
	}

	public void setCashDeskId(String cashDeskId) {
		this.cashDeskId = cashDeskId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
