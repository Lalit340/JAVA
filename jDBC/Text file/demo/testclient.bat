REM Please modify JDK path for your computer
REM Please modify url for your computer

SET TEMPCLASSPATH=%CLASSPATH%
SET TEMPPATH=%PATH%

SET CLASSPATH=%CLASSPATH%;..\..\lib\Text_JDBC30.jar;.\classes

SET CLASSPATH=%CLASSPATH%;..\..\lib\Text_Embedded_JDBC30.jar;.\classes

java testSQL "jdbc:Text://localhost:8029/." "sql.txt" >test2.txt

SET CLASSPATH=%TEMPCLASSPATH%
SET PATH=%TEMPPATH%
