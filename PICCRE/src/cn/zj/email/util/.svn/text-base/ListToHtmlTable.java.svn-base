package cn.zj.email.util;

import java.util.List;

public class ListToHtmlTable <E>{

	private List<String> title;
	private String titleStyle;
	private List<List<E>> content;
	private String contentType;
	private String tableStyle;
	
	/**
	 * 设置table的标题 和 内容(保证两者之间数量对应,否则表格样式会变形)
	 * @param title 标题 
	 * @param content  内容
	 */
	public ListToHtmlTable(List<String> title, List<List<E>> content) {
		this.title = title;
		this.content = content;
		this.titleStyle = "border-width: 1px;padding: 8px;border-style: solid;border-color: #40aa53;background:#88E0F4;font-weight:bold;";
		this.contentType = "border-width: 1px;padding: 8px;border-style: solid;border-color: #40aa53;background:#ffffff;text-align:center;";
		this.tableStyle = "margin:25px auto;border:0;margin:0;border-collapse:collapse;border-spacing:0;text-align:center;width:800px;";
	}
	
	/**
	 * 设置table的标题 和 内容(保证两者之间数量对应,否则表格样式会变形)
	 * @param title 标题
	 * @param content  内容
	 */
	public ListToHtmlTable(List<String> title, String titleStyle,
			List<List<E>> content, String contentType,String tableStyle) {
		this.title = title;
		this.titleStyle = titleStyle;
		this.content = content;
		this.contentType = contentType;
		this.tableStyle = tableStyle;
	}
	
	/**
	 * 获取html table
	 * @return
	 */
	public String getTableText(){
		StringBuffer tableText = new StringBuffer("<table ");
		tableText.append("style='");
		tableText.append(tableStyle);
		tableText.append("'>");
		tableText.append("<thead><tr>");
		//生成title
		if(title != null){
			for(int i=0 ;i<title.size();i++){
				tableText.append("<td style='");
				tableText.append(titleStyle);
				tableText.append("'>");
				tableText.append(title.get(i));
				tableText.append("</td>");
			}
		}

		tableText.append("</tr></thead><tbody><tr>");
		//生成content
		if(content != null){
			for(int i=0 ;i<content.size();i++){
				tableText.append("<tr>");
				for(int j=0 ;j<content.get(i).size();j++){
					tableText.append("<td style='");
					tableText.append(contentType);
					tableText.append("'>");
					tableText.append(content.get(i).get(j));
					tableText.append("</td>");
				}
				tableText.append("</tr>");
			}
		}
		tableText.append("</tbody></table>");
		return tableText.toString();
	}
	

}
