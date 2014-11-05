package cn.picc.service.recruitment.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hnne.hs.utils.UserUtils;
import cn.picc.dao.LoginMapper;
import cn.picc.dao.UserMapper;
import cn.picc.model.Login;
import cn.picc.model.LoginExample;
import cn.picc.model.UserExample;
import cn.picc.service.recruitment.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService{

	@Autowired
	LoginMapper loginMapper;
	@Autowired
	UserMapper userMapper;
	public Login findByNameAndPass(String name, String pass) {
		LoginExample example = new LoginExample();
		example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(UserUtils.md5Encode(pass));
		List<Login> list = loginMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}
	public int insert(Login login) {
		if(login!=null){
			login.setPassword(UserUtils.md5Encode(login.getPassword()));
			return loginMapper.insert(login);
		}else{
			return -1;
		}
	}
	public boolean nameIsUnique(String name) {
		LoginExample example = new LoginExample();
		example.createCriteria().andNameEqualTo(name);
		List<Login> list = loginMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return false;
		}else{
			return true;
		}
		
	}
	public boolean emailIsUnique(String email) {
		LoginExample example = new LoginExample();
		example.createCriteria().andEmailEqualTo(email);
		List<Login> list = loginMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return false;
		}else{
			return true;
		}
	}
	public Login findById(Integer id) {
		return loginMapper.selectByPrimaryKey(BigDecimal.valueOf(id));
	}
	public Login findByLogin(Login login) {
		LoginExample example = new LoginExample();
		example.createCriteria().andNameEqualTo(login.getName()).andPasswordEqualTo(UserUtils.md5Encode(login.getPassword()));
		List<Login> list = loginMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}else{
			return null;
		}
	}
	public int update(Login login) {
		LoginExample example = new LoginExample();
		example.createCriteria().andIdEqualTo(login.getId());
		return loginMapper.updateByExampleSelective(login, example);
	}
	
	public int countUser(Integer id) {
		UserExample example = new UserExample();
		example.createCriteria().andPkEmpEqualTo(BigDecimal.valueOf(id));
		return userMapper.selectUserIdByLoginId(id).size();
	}
}
