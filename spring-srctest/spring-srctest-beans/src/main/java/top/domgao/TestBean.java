package top.domgao;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author dockerxjbckr
 * @create 2019-07-25 22:02
 */
public class TestBean {

	@Test
	public void testGetBean(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		MyTestBean bean = (MyTestBean) beanFactory.getBean("myTestBean");
		Assert.assertEquals("testStr",bean.getTestStr());
		assertEquals("testStr",bean.getTestStr());
	}

}
