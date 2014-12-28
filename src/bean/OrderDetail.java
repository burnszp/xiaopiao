package bean;

/**
 * 订单明细
 * 
 * @author burns
 *
 */
public class OrderDetail {
	private String orderId;// 商品编号
	private String goodsId;// 电脑小票号
	private int amount;// 数量

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
