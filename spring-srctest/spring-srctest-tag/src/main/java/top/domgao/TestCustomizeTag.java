package top.domgao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.domgao.bean.User;

public class TestCustomizeTag {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User bean = (User) ctx.getBean("testBean");
		System.out.println(bean.getUserName() + ":" + bean.getEmail());
	}
}
