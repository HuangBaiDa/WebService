package webservice.selimpl;

import webservice.selapi.WeatherInterface;

import javax.jws.WebService;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description
 * @date 2019-1-31
 */
@WebService
public class WeatherInterfaceImpl implements WeatherInterface {
    @Override
    public String getWeatherByCity(String city) {
        System.out.println("接收客户端发送的城市名称(参数)：" + city);
        //查询天气...
        String result = "今天好hot!";
        System.out.println("返回天气信息：" + result);
        return result;
    }
}
