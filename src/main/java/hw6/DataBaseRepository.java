package hw6;

import hw6.entity.Weather;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseRepository {
    private String insertWeather = "insert into weather (city, localdate,temperature) values (?,?,?)";
    private String getWeather = "select * from weather";
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

    public List<Weather> getSavedToDBWeather() throws SQLException {
        List<Weather> weathers = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(DB_PATH)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getWeather);

            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.println("");
                System.out.print(resultSet.getString("city"));
                System.out.println("");
                System.out.print(resultSet.getString("localdate"));
                System.out.println("");
                System.out.print(resultSet.getDouble("temperature"));
                System.out.println("");
                weathers.add(new Weather(resultSet.getString("city"), resultSet.getString("localdate"),
                        resultSet.getDouble("temperature")));
            }
        }
        return weathers;
    }

    public static void main(String[] args) throws SQLException {
        DataBaseRepository dataBaseRepository = new DataBaseRepository();
        System.out.println(dataBaseRepository.getSavedToDBWeather());
    }
}



