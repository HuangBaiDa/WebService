package webservice.selapi;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description
 * @date 2019-1-31
 */
public interface WeatherInterface {
    /**
     * 天气查询服务
     * @param city
     * @return
     */
    public String getWeatherByCity(String city);
}
