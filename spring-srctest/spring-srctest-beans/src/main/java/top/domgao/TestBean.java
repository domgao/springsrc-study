package top.domgao;

import org.junit.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dockerxjbckr
 * @create 2019-07-25 22:02
 */
public class TestBean {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyTestBean bean = (MyTestBean) ctx.getBean("myTestBean");
		System.err.println("testStr".equals(bean.getTestStr()));
	}

	@Test
	public void testGetBean(){

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyTestBean bean = (MyTestBean) ctx.getBean("myTestBean");
		System.err.println("testStr".equals(bean.getTestStr()));

	}

}
