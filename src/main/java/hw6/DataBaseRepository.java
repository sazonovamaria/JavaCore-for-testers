package hw6;

import hw6.entity.Weather;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DataBaseRepository {
    String insertWeather = "insert into weather (city, localdate,temperature) values (?,?,?)";
    private static final String DB_PATH = "jdbc:sqlite:geekbrains.gb";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveWeatherToDataBase(Weather weather) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_PATH)) {
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
            saveWeather.setString(1, weather.getCity());
            saveWeather.setString(2, weather.getLocaldate());
            saveWeather.setString(3, weather.getTemperature());
            saveWeather.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new SQLException("Сохранение погоды в базу данных не выполнено!");
        }

    }
//public List<Weather> getSavedToDBWeather() throws SQLException {
   // try (Connection connection = DriverManager.getConnection(DB_PATH)){

   // }
//}
    public static void main(String[] args) throws SQLException {
        DataBaseRepository dataBaseRepository = new DataBaseRepository();
        dataBaseRepository.saveWeatherToDataBase(new Weather("Moscow", "12.12.12", "12"));
    }
}



