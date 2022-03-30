#Autor: John Alexander Espinal Gómez

  Feature: Yo como usuario requiero ver las diferentes opciones cuando selecciono un vuelvo y poder reservar
    exitosamente

  @manual
  Scenario: Yo como usuario requiero visualizar las diferentes opciones de vuelos que puedo tomar para mi destino
  de forma exitosa
    Given se ingresa a la pagina principal de booking
    And se selecciona el boton vuelos
    When ingreso el destino la fecha de salida
    And ingreso la fecha de regreso
    Then se observan los vuelos disponibles

    @manual
    Scenario: Yo como usuario requiero visualizar las diferentes opciones de vuelos que puedo tomar para mi destino
    y que se encuentre habilitado el boton de ver oferta
      Given se ingresa a la pagina principal de booking
      And se selecciona el boton vuelos
      When ingreso el destino la fecha de salida
      And ingreso la fecha de regreso
      And se observan los vuelos disponibles
      Then se observa el boton de ver oferta disponible

    @manual
    Scenario: Yo como usuario requiero visualizar las diferentes opciones de vuelos que puedo tomar para mi destino
    y poder realizar la reserva de un vuelo disponible
      Given se ingresa a la pagina principal de booking
      And se selecciona el boton vuelos
      When ingreso el destino la fecha de salida
      And ingreso la fecha de regreso
      And se observan los vuelos disponibles ingresando a uno
      Then se realiza la reserva del vuelo de forma exitosa
