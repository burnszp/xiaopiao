package bean;

import java.util.Date;

/**
 * ����
 * 
 * @author burns
 *
 */
public class SaleOrder {
	private String orderId;// ����СƱ��ID
	private String memeberId;// ��Ա����
	private String cashierId;// ����̨���
	private String cashDeskId;// ����
	private String branchId;// �ֵ���
	private int goodsItemQuantity;// ��Ʒ��Ŀ��
	private int goodsTotal;// ��Ʒ����
	private double totalPrice;// �ܽ��
	private String payWay;// ֧����ʽ
	private float point;// ���λ���
	private double preferential;// ���������Ż�
	private Date createDate;// ����

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getMemeberId() {
		return memeberId;
	}

	public void setMemeberId(String memeberId) {
		this.memeberId = memeberId;
	}

	public String getCashierId() {
		return cashierId;
	}

	public void setCashierId(String cashierId) {
		this.cashierId = cashierId;
	}

	public String getCashDeskId() {
		return cashDeskId;
	}

	public void setCashDeskId(String cashDeskId) {
		this.cashDeskId = cashDeskId;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public int getGoodsItemQuantity() {
		return goodsItemQuantity;
	}

	public void setGoodsItemQuantity(int goodsItemQuantity) {
		this.goodsItemQuantity = goodsItemQuantity;
	}

	public int getGoodsTotal() {
		return goodsTotal;
	}

	public void setGoodsTotal(int goodsTotal) {
		this.goodsTotal = goodsTotal;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	public double getPreferential() {
		return preferential;
	}

	public void setPreferential(double preferential) {
		this.preferential = preferential;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
