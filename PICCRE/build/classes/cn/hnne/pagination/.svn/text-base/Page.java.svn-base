package cn.hnne.pagination;

import java.util.Map;

/**
 * 页面实体
 * 
 * @author 马周易
 * 
 */
public class Page<E> {

	/**
	 * 默认页面最大记录条数
	 */
	private static final int DEFAULT_LIMIT = 10;

	/**
	 * 默认页码
	 */
	private static final int DEFAULT_PAGE_NO = 1;
	
	/**
	 * 页码默认的请求参数名称
	 */
	public static final String PAGE_NO = "pageNo";

	/**
	 * 页码
	 */
	private int pageNo = DEFAULT_PAGE_NO;
	
	/**
	 * 上一页
	 */
	private int previous = DEFAULT_PAGE_NO;
	
	/**
	 * 下一页
	 */
	private int next = DEFAULT_PAGE_NO;

	/**
	 * 页面最大记录条数
	 */
	private int limit = DEFAULT_LIMIT;
	
	/**
	 * 页面上第一条记录在数据库中的偏移量，索引从0开始
	 */
	private int offset;

	/**
	 * 总记录条数
	 */
	private int totalRecord;

	/**
	 * 总页数
	 */
	private int totalPage;
	
	/**
	 * 条件
	 */
	private Map<String, Object> para;

	/**
	 * 获得页码
	 */
	public int getPageNo() {
		return pageNo;
	}

	/**
	 * 设置页码，如果页码不大于1，则默认为1
	 */
	public void setPageNo(int pageNo) {
		if (pageNo > 1) {
			this.pageNo = pageNo;
			previous = pageNo - 1;
			offset = (pageNo - 1) * limit;
		} else {
			offset = 0;
		}
	}

	/**
	 * 获得页面最大记录条数
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * 设置页面最大记录条数，如果值不大于0，则默认为10
	 */
	public void setLimit(int limit) {
		if (limit > 0) {
			this.limit = limit;
		}
		offset = (pageNo - 1) * limit;
	}

	/**
	 * 获得页面上第一条记录在数据库中的偏移量，从0开始
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * 获得总记录条数
	 */
	public int getTotalRecord() {
		return totalRecord;
	}

	/**
	 * 设置总记录条数
	 */
	public void setTotalRecord(int totalRecord) {
		if (totalRecord > 0) {
			this.totalRecord = totalRecord;
			totalPage = (int) Math.ceil((double) totalRecord / (double) limit);
			if (pageNo >= totalPage) {
				pageNo = totalPage;
				next = totalPage;
			} else {
				next = pageNo + 1;
			}
		}
	}

	/**
	 * 获得总页数
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * 获得上一页
	 */
	public int getPrevious() {
		return previous;
	}

	/**
	 * 获得下一页
	 */
	public int getNext() {
		return next;
	}

	public Map<String, Object> getPara() {
		return para;
	}

	public void setPara(Map<String, Object> para) {
		this.para = para;
	}
}
