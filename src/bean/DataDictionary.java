package bean;

/**
 * 数据字典
 * 
 * @author burns
 *
 */
public class DataDictionary {
	private String id;// 编号
	private String optionType;// 选项类型
	private String optionName;// 选项名称

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
}
