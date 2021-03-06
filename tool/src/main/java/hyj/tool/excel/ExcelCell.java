package hyj.tool.excel;

/**
 * 
 * @Description: excel单元格对象
 * @author hyj     
 * @date 2018年1月5日 下午10:30:08  
 * @version V1.0
 */
public class ExcelCell {
	/** 字段名 **/
	private String paramsName;
	/** 字段类型 **/
	private ExcelUtil.Type type;
	/** 行数 **/
	private Integer rows;
	/** 列数 **/
	private Integer line;
	
	/**
	 * 获取参数名字
	 * @return
	 */
	public String getParamsName() {
		return paramsName;
	}
	/**
	 * 设置参数名字
	 * @param paramsName
	 */
	public void setParamsName(String paramsName) {
		this.paramsName = paramsName;
	}
	/**
	 * 获取字段类型
	 * @return
	 */
	public ExcelUtil.Type getType() {
		return type;
	}
	/**
	 * 设置字段类型
	 * @param type
	 */
	public void setType(ExcelUtil.Type type) {
		this.type = type;
	}
	/**
	 * 获取当前行数
	 * @return
	 */
	public Integer getRows() {
		return rows;
	}
	/**
	 * 设置当前行数
	 * @param rows
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	/**
	 * 获取当前列数
	 * @return
	 */
	public Integer getLine() {
		return line;
	}
	/**
	 * 设置当前列数
	 * @param line
	 */
	public void setLine(Integer line) {
		this.line = line;
	}
	
	
}
