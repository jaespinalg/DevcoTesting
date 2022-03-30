#Autor: John Alexander Espinal Gómez

Feature: Yo como usuario requiero poder observar las atraciones turisticas para mi viaje donde se pueda visualizar
  las opciones y realizar la reserva exitosa

  @manual-result:passed
  Scenario: yo como usuario requiero poder ver las diferentes atracciones
    turisticas que se ofrecen en booking
    Given que ingreso a la pagina principal de booking
    When selecciono el boton atracciones turisticas
    And se habilita la opcion de ingresar atraccion
    And se selecciona el boton buscar
    Then se visualiza de forma exitosa las diferentes opciones turisticas

  @manual-result:passed
  @manual
  Scenario: yo como usuario requiero poder ver la atraccion turistica museos que se ofrecen en booking
    Given que ingreso a la pagina principal de booking
    When selecciono el boton atracciones turisticas
    And se habilita la opcion de ingresar atraccion donde se escribe museo
    And se selecciona el boton buscar
    Then se visualiza de forma exitosa las diferentes museos

  @manual-result:passed
  @manual
  Scenario: yo como usuario requiero poder ver la atraccion turistica museos que se ofrecen en booking
    Given que ingreso a la pagina principal de booking
    When selecciono el boton atracciones turisticas
    And se habilita la opcion de ingresar atraccion donde se escribe tours
    And se selecciona el boton buscar
    Then se visualiza de forma exitosa los diferentes museos