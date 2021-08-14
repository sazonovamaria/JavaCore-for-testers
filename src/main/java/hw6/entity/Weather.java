package hw6.entity;

public class Weather {
    private String city;

    public Weather(String city, String localdate, double temperature) {
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLocaldate(String localdate) {
        this.localdate = localdate;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    private String localdate;
    private String temperature;

    public String getCity() {
        return city;
    }

    public String getLocaldate() {
        return localdate;
    }

    public String getTemperature() {
        return temperature;
    }


    public Weather(String city, String localdate, String temperature) {
        this.city = city;
        this.localdate = localdate;
        this.temperature = temperature;
    }


}
