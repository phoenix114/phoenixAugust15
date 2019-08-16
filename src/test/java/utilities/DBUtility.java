package utilities;


import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtility {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


    public static void openConnection(String dbType) throws SQLException {
        switch (dbType){
            case "Oracle":
                connection = DriverManager.getConnection(Config.getProperty("oracleUrl"),
                Config.getProperty("oracleUsername"),
                        Config.getProperty("oraclePassword"));
            break;

                default:
                    connection = null;
        }
    }

    public static List<Map<String, Object>> executeSQLquery(String query) throws SQLException {
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery(query);

        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        List<Map<String, Object>> table = new ArrayList<>();

        while (resultSet.next()){
            Map<String, Object> map = new HashMap<>();

            for(int column =1; column<=columnCount; column++){
                map.put(metaData.getColumnName(column), resultSet.getObject(column));

            }
            table.add(map);
        }
        return table;
    }

    public static void closeConnection(){
        try{
            if(resultSet!=null){
                resultSet.close();
            }
            if(statement!=null){
                statement.close();
            }
            if(connection!=null){
                connection.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
