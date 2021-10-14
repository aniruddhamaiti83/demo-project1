<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Welcome</h1>
  
  <form action="addFlight">
    <input type="text" name="flightId"><br>
    <input type="text" name="source"><br>
    <input type="text" name="destination"><br>
    <input type="text" name="departure"><br>
    <input type="text" name="arrival"><br>
    <input type="submit"><br>
  
  </form>
  
  <hr>
  
  <form action="getFlight">
    <input type="text" name="flightId"><br>
     <input type="submit"><br>
  </form>

</body>
</html>