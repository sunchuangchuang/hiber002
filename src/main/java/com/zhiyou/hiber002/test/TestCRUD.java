package com.zhiyou.hiber002.test;


import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zhiyou.hiber002.model.User;

public class TestCRUD {
	private static Integer no =  null;
	
	static {
		no = new Random().nextInt(10000);
	}
	
	
	public static void main(String[] args) {
		// 读取配置文件
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		// 获取sessionFactory
		SessionFactory sessionFactory = config.buildSessionFactory();
		// 获取session
		Session session = sessionFactory.openSession();
		// 
		
		// User
		User vo = new User();
		vo.setUserId(4);
		vo.setUsername("王五" + 5114);
		vo.setPassword("zhangsan" + no);
		// 开始事务处理
		session.getTransaction().begin();
		// 增加
//		session.save(vo);
		// 修改
//		session.update(vo);
		// 删除
		session.delete(session.get(User.class, 8));
		// 提交事务
		session.getTransaction().commit();
		// 查询数据
//		System.out.println(session.get(User.class, 4));
		session.close();
		
		
	}
}
