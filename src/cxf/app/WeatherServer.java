package cxf.app;


import cxf.sei.WeatherInterface;
import cxf.sei.WeatherInterfaceImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description 使用CXF发布jax-ws规范的WebService
 * @date 2019-2-1
 */
public class WeatherServer {
    public static void main(String[] args) {
        //创建JaxWsClientFactoryBean
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        //2、设置SEI接口
        factory.setServiceClass(WeatherInterface.class);
        //3、设置SEI实现类对象
        factory.setServiceBean(new WeatherInterfaceImpl());
        //4、设置服务发布地址
        factory.setAddress("http://127.0.0.1:12345/weather");
        //5、发布服务
        factory.create();

        //第一种发布方式：通过CXF提供的JaxWsServerFactoryBean来发布webservice
//        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
//        factory.setServiceClass(WeatherInterfaceImpl.class);
//        factory.setAddress("http://127.0.0.1:12345/weather");
//        Server server = factory.create();
//        server.start();


        //第二种方式，通过JAX-WS提供的Endpoint来发布webservice
        //首先创建webservice服务提供类的实例
//        String address = "http://127.0.0.1:12345/weather";
//        Endpoint.publish(address, new WeatherInterfaceImpl());

    }


}
