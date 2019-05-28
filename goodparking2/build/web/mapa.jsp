<%-- 
    Document   : mapa
    Created on : 25/05/2019, 08:24:56 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }
      /* Optional: Makes the sample page fill the window. */
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
    </head>
    <body>
        <div id="map"></div>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDc3_kpt3hs8GryLkmHw3jRwM0mozb9ivE&callback=initMap"
    async defer></script>
        <script type="text/javascript" src="contraseñas.js"></script>
    </body>
</html>
