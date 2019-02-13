package test;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description
 * @date 2019-2-13
 */
public class MainServer {
    public static void main(String[] args) {
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloWorldImpl.class);
        factory.setAddress("http://localhost:8080/HelloWorld");
        Server server = factory.create();
        server.start();
    }


}
