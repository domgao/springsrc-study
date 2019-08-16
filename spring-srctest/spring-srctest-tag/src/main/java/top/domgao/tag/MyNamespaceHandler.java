package top.domgao.tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 将组件注册到 Spring 容器
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		System.err.println("I be init...");
		registerBeanDefinitionParser("user",new UserBeanDefinitionParse());
	}
}
