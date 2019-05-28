function initMap() {
  var uluru = {lat: 10.414128, lng: -75.530157};
  var map = new google.maps.Map(document.getElementById('map'), {
    zoom: 17,
    center: uluru
  });

  var contentString = '<div id="content">'+
      '<div id="siteNotice">'+
      '</div>'+
      '<h1 id="firstHeading" class="firstHeading">parqueadero Caribe P.</h1>'+
      '<div id="bodyContent">'+
      '<p><b>parqueaderos: </b>128</b>'+
      '<p><b>horarios:<b> de 6 am a 9:30 pm</p>'+
      '<p>mas informacion: </p><a href="https://en.wikipedia.org/w/index.php?title=Uluru&oldid=297882194">'+
      'https://en.wikipedia.org/w/index.php?title=Uluru</a> '+
      '</div>'+
      '</div>';

  var infowindow = new google.maps.InfoWindow({
    content: contentString
  });

  var marker = new google.maps.Marker({
    position: uluru,
    map: map,
    title: 'Uluru (Ayers Rock)'
  });
  marker.addListener('click', function() {
    infowindow.open(map, marker);
  });
}