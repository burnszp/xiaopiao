package bean;

/**
 * ������ϸ
 * 
 * @author burns
 *
 */
public class OrderDetail {
	private String orderId;// ��Ʒ���
	private String goodsId;// ����СƱ��
	private int amount;// ����

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
