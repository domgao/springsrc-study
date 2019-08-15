package top.domgao.tag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import top.domgao.bean.User;

public class UserBeanDefinitionParse extends AbstractSingleBeanDefinitionParser {

	private static final String USER_NAME = "userName";
	private static final String EMAIL = "email";

	//Element 对应的类
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	//从 element 中解析并提取对应元素
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		String userName = element.getAttribute(USER_NAME);
		String email = element.getAttribute(EMAIL);
		//将提取到的元素放入到 BeanDefinitionBuilder 中,待到完成所有的 bean 的解析后统一注册到 beanFactory 中
		if(StringUtils.hasText(userName)){
			bean.addPropertyValue("userName",userName);
		}
		if (StringUtils.hasText(email)){
			bean.addPropertyValue("email",email);
		}

	}
}
