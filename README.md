# mybatis-generator
This project is a demo to use MyBatis Generator. 

## usage
1.Open file ```mybatis-generator\src\main\resources\generatorConfig.xml```, then modify your own jdbc driver location on the tag ```<classPathEntry>```.
```
<classPathEntry location="C:\Users\MJ\.m2\repository\mysql\mysql-connector-java\5.1.46\mysql-connector-java-5.1.46.jar" />
```

2.Config your own database connection parameters.
```
<jdbcConnection driverClass="com.mysql.jdbc.Driver"
    connectionURL="jdbc:mysql://localhost:3306/tidal_level_monitor?useUnicode=true&amp;characterEncoding=utf-8&amp;useSSL=false"
    userId="root"
    password="minjian">
</jdbcConnection>
```

3.Add the table you need to generate java and xml with MyBatis Generator.
```
<table schema="" tableName="alert_level_statistics">
      
</table>
<table schema="" tableName="user_operate_log">
      
</table>
```
  
4.Run command ```mvn clean mybatis-generator:generate -e``` to generate java and xml.
