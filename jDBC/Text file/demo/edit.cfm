<CFQUERY name="defineTables" datasource="TextTest">
CREATE TABLE if not exists test (city CHAR(24), POSTCODE NUMERIC(8,0));
</CFQUERY>
<CFQUERY name="testText" datasource="TextTest">
SELECT _rowid_,* from test;
</CFQUERY>
<html>
<head><Title>Text Edit Data Demo for Coldfusion MX</Title></head>
<body>
Text driver uses CREATE TABLE to define SQL data 
types to the columns in the text files. You can find how to use CREATE TABLE in 
General Questions 10~16 of faq.html. For CSV file, you can skip CREATE TABLE. 
You can store all table definitions into a CFQUERY, then run once, then all table 
definitions will be available until you restart Coldfusion. HXTT Text (CSV) keeps only 
table definitions, no idle table data, in memory. The preferable way is using 
&quot;schemaFile&quot; properity for connection, then Text driver will load automatically 
those table definition sqls.<br>
When you wish to edit data, you shoud quote _rowid_(virtual column) in CFQUERY's 
sql if your table hasn't any primary key.<br> 
<CFFORM action="edit_action.cfm" method="post">
   <CFGRID name="testTextgrid" query="testText" 
           selectMode="edit" autowidth="yes" insert="yes" delete="yes">
   </CFGRID>
   <p><input type="submit" value="Sumbit"></p>
</CFFORM>
</body>
</html>
