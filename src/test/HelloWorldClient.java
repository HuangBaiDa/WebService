package test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description
 * @date 2019-2-13
 */
public class HelloWorldClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:8080/HelloWorld");
        factory.setServiceClass(HelloWorld.class);
        HelloWorld helloWorld = (HelloWorld) factory.create();
        System.out.println(helloWorld.sayHello("zhuwei"));

    }
}
