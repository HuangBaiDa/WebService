package cxf.entity;

import java.util.Date;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description POJO
 * @date 2019-2-1
 */
public class Weather {
    private int maxTemp;
    private int minTemp;
    private String info;
    private Date date;

    /**
     * 默认的构造需要提供，不然报错
     */
    public Weather() {
    }

    public Weather(int maxTemp, int minTemp, String info, Date date) {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.info = info;
        this.date = date;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
