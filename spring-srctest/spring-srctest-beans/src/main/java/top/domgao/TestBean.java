package top.domgao;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.domgao.bean.User;

/**
 * @author dockerxjbckr
 * @create 2019-07-25 22:02
 */
public class TestBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User bean = (User) ctx.getBean("user");
		System.err.println("domgao".equals(bean.getUsername()));
	}

}
