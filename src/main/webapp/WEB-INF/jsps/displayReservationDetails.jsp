<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Details</title>
</head>
<body>
<h2>Flight Details:</h2>

AirLines: ${reservation.flight.operatingAirlines}<br/>
Flight Number: ${reservation.flight.flightNumber}<br/>
Departure City: ${reservation.flight.departureCity}<br/>
Arrival City: ${reservation.flight.arrivalCity}<br/>
Estimated Departure Time: ${reservation.flight.estimatedDepartureTime}<br/>

<hr>
<h2>Passenger Details</h2>
First Name: ${reservation.passenger.firstName}<br/>
Last Name: ${reservation.passenger.lastName}<br/>
Middle Name: ${reservation.passenger.middleName}<br/>
Email: ${reservation.passenger.email}<br/>
Phone: ${reservation.passenger.phone}<br/>

<hr>
<form action="completeCheckIn" method="post">
Enter the number of bags to check in : <input type="text" name="numberOfBags" />
<input type="hidden" value="${reservation.id}" name="id"/>
<input type="submit" value="check In"/>


</form>

</body>
</html>