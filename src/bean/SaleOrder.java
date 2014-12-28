package bean;

import java.util.Date;

/**
 * 订单
 * 
 * @author burns
 *
 */
public class SaleOrder {
	private String orderId;// 电脑小票号ID
	private String memeberId;// 会员卡号
	private String cashierId;// 收银台编号
	private String cashDeskId;// 工号
	private String branchId;// 分店编号
	private int goodsItemQuantity;// 商品条目薯
	private int goodsTotal;// 商品总数
	private double totalPrice;// 总金额
	private String payWay;// 支付方式
	private float point;// 本次积分
	private double preferential;// 其中整单优惠
	private Date createDate;// 日期

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
