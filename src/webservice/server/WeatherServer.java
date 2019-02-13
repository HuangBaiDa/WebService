package webservice.server;

import webservice.selimpl.WeatherInterfaceImpl;

import javax.xml.ws.Endpoint;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description
 * @date 2019-1-31
 */
public class WeatherServer {
    public static void main(String[] args) {
        //第一个参数：服务发布URL
        //第二个参数：SEL实现类对象
        String address = "http://127.0.0.1:12345/weather";
        WeatherInterfaceImpl weatherInterfaceImpl = new WeatherInterfaceImpl();
        Endpoint.publish(address, weatherInterfaceImpl);
    }
}
