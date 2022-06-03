<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complete Reservation</title>
</head>
<body>
	<h2>Complete Reservation</h2>
	Airline: ${flight.operatingAirlines}
	<br /> departureCity: ${flight.departureCity}
	<br /> arrivalCity: ${flight.arrivalCity}
	<br />

	<form action="completeReservation" method="post">
		<pre>
<h2>Passenger Details:</h2>
First Name:<input type="text" name="passengerFirstName" /> 
Last Name:<input type="text" name="passengerLastName" /> 
Email:<input type="text" name="passengerEmail" /> 
Phone:<input type="text" name="passengerPhone" />

<h2>Card Details:</h2>
Name on the card:<input type="text" name="nameOnTheCard" /> 
Card No:<input type="text" name="cardNumber" /> 
Expiry Date:<input type="text" name="expirationDate" /> 
Three Digit Sec Code:<input type="text" name="securityCode" />
<input type="hidden" name="id" value="${flight.id}"/>
<input type="submit" value="confirm" />
		</pre>
	</form>


</body>
</html>