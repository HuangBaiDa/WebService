package cxf.sei;

import cxf.entity.Weather;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description SEI实现类
 * @date 2019-2-1
 */
public class WeatherInterfaceImpl implements WeatherInterface {
    @Override
    public List<Weather> getWeatherByCity(String city) {
        //生成三天的天气
        List<Weather> list = getWeatherInf(city);
        return list;
    }

    private List<Weather> getWeatherInf(String city) {
        //生成三天的天气
        List<Weather> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        list.add(new Weather(30, 20, city + "，今天很HOT！", date));
        return list;
    }
}
