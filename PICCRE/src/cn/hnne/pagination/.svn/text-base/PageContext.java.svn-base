package cn.hnne.pagination;

/**
 * 页面上下文类，保存当前线程的页面实体
 * @author 马周易
 *
 */
@SuppressWarnings("rawtypes")
public class PageContext {

	private static ThreadLocal<Page> context = new ThreadLocal<Page>();
	
	/**
	 * 获得当前线程的页面实体
	 */
	public static Page getPage() {
		Page page = context.get();
		if (page == null) {
			page = new Page();
			context.set(page);
		}
		return page;
	}
	
	/**
	 * 将当前线程的页面实体从上下文移除
	 */
	public static void remove() {
		context.remove();
	}
}
