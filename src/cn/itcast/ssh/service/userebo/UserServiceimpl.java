package cn.itcast.ssh.service.userebo;

import cn.itcast.ssh.dao.UserDao;
import cn.itcast.ssh.domain.UserModel;
import cn.itcast.ssh.service.userebi.UserService;

public class UserServiceimpl implements UserService {

	private UserDao userDao;
	//需要注入userdao的bean
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void save(UserModel userModel) {
		userDao.save(userModel);
		System.out.println("service层的save方法===");
	}

}
