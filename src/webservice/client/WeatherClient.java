package webservice.client;

import generate.WeatherInterfaceImpl;
import generate.WeatherInterfaceImplService;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description
 * @date 2019-1-31
 */
public class WeatherClient {
    public static void main(String[] args) {
        //创建服务视图
        WeatherInterfaceImplService service = new WeatherInterfaceImplService();
        //从服务视图中获得portType对象
        WeatherInterfaceImpl portType = service.getWeatherInterfaceImplPort();
        //调用服务端的方法
        String weatherInfo = portType.getWeatherByCity("北京");
        System.out.println(weatherInfo);

    }
}
