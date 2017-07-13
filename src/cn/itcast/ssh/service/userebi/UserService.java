package cn.itcast.ssh.service.userebi;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.ssh.domain.UserModel;

@Transactional
//添加事务
public interface UserService {
	public void save(UserModel userModel);
}
