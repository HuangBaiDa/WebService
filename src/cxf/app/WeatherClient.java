package cxf.app;


import cxf.entity.Weather;
import cxf.sei.WeatherInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description
 * @date 2019-2-13
 */
public class WeatherClient {
    //传统方式访问
    public static void main(String[] args) throws MalformedURLException {
        //创建服务视图(记得带wsdl，不然访问不到报错)
        URL url = new URL("http://127.0.0.1:12345/weather?wsdl");
        QName qName = new QName("http://sei.cxf/", "WeatherInterfaceService");
        Service service = Service.create(url, qName);
        //获得PortType
        WeatherInterface port = service.getPort(WeatherInterface.class);
        List<Weather> list = port.getWeatherByCity("北京");
        for (Weather weather : list) {
            System.out.println("天气信息：" + weather.getInfo());
        }
    }
}
