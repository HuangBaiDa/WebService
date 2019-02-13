package cxf.app;


import cxf.entity.Weather;
import cxf.sei.WeatherInterface;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.List;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description
 * @date 2019-2-13
 */
public class Client2 {
    //使用CXF实现客户端
    public static void main(String[] args) throws Exception {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(WeatherInterface.class);
        factoryBean.setAddress("http://127.0.0.1:12345/weather");
        WeatherInterface portType = (WeatherInterface) factoryBean.create();
        List<Weather> list = portType.getWeatherByCity("北京");
        for (Weather weather : list) {
            System.out.println("天气信息：" + weather.getInfo());
        }

    }
}
