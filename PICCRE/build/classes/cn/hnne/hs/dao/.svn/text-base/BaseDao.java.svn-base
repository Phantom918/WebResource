package cn.hnne.hs.dao;

import java.util.List;

/**
 * 数据访问基本接口
 * @author 马周易
 *
 * @param <E> 实体类型
 * @param <ID> 实体ID
 */
public interface BaseDao<E, ID> extends Dao {

	/**
	 * 添加
	 * @param model 要添加的实体对象
	 */
	void add(E model);
	
	/**
	 * 删除
	 * @param id 要删除的实体的ID
	 */
	void delete(ID id);
	
	/**
	 * 批量删除
	 * @param ids 要删除的实体的ID
	 */
	void deleteList(List<ID> ids);
	
	/**
	 * 修改
	 * @param model 要修改的实体
	 */
	void update(E model);
	
	/**
	 * 查询所有
	 */
	List<E> findAll();
	
	/**
	 * 根据角色ID查询
	 * @param id 要查询的实体的ID
	 */
	E findById(ID id);
}
