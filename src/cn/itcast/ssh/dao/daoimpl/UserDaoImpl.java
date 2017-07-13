package cn.itcast.ssh.dao.daoimpl;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.ssh.dao.UserDao;
import cn.itcast.ssh.domain.UserModel;

//HibernateTemplate
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public void save(UserModel userModel) {
		//执行保存	使用 HibernateDaoSupport  需要提供sessionFactory
		System.out.println("user dao ... save ...");
		this.getHibernateTemplate().save(userModel);
	}
	
}
