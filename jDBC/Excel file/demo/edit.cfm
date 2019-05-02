<CFQUERY name="testExcel" datasource="ExcelTest">
SELECT _rowid_,* from test;
</CFQUERY>
<html>
<head><Title>Excel Edit Data Demo for Coldfusion MX</Title></head>
<body>
When you wish to edit data, you shoud quote _rowid_(virtual column) in CFQUERY's 
sql if your table hasn't any primary key.<br> 
<CFFORM action="edit_action.cfm" method="post">
   <CFGRID name="testExcelgrid" query="testExcel" 
           selectMode="edit" autowidth="yes" insert="yes" delete="yes">
   </CFGRID>
   <p><input type="submit" value="Sumbit"></p>
</CFFORM>
</body>
</html>
