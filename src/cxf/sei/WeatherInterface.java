package cxf.sei;

import cxf.entity.Weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description SEI
 * @date 2019-2-1
 */
@WebService
public interface WeatherInterface {
    /**
     * 返回天气信息
     * @param city
     * @return
     */
    @WebMethod
    @WebResult List<Weather> getWeatherByCity(@WebParam(name = "city") String city);
}
