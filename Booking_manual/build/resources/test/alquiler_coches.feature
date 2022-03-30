#Autor: John Alexander Espinal Gómez

  Feature: Yo como usuario requiero poder alquilar un coche para mi viaje donde se pueda visualizar
    las opciones y realizar la reserva exitosa

  @manual
  Scenario: yo como usuario requiero poder ver los coches en la ciudad de medellin y ver la oferta
    Given que ingreso a la pagina principal de booking
    When selecciono el boton alquiler de coches
    And se habilita la opcion de lugar y fecha
    And se selecciona el boton buscar
    Then se visualiza de forma exitosa los coches

    @manual
    Scenario: yo como usuario requiero poder reserva un coche en la ciudad de neiva exitosamente
      Given que ingreso a la pagina principal de booking
      When selecciono el boton alquiler de coches
      And se habilita la opcion de lugar y fecha
      And se selecciona el boton buscar
      Then se realiza la reserva de forma exitosa


    @manual
    Scenario: yo como usuario requiero poder tener a la vista las diferentes opciones que permiten elegir
      las caracteristicas del coche y de dinero
      Given que ingreso a la pagina principal de booking
      When selecciono el boton alquiler de coches
      And se habilita la opcion de lugar y fecha
      And se selecciona el boton buscar
      Then se visualiza de forma exitosa las caracteristicas del coche y rangos de precio


