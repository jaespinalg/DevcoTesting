#Autor: John alexander espinal

  Feature: Yo como usuario requiero poder buscar un tipo de alojamiento especifico para una fecha establecida
    en un destino requerido

    @manual
  Scenario: Yo como usuario busco un tipo de alojamiento y reservo para una fecha establecida en el destino indicado
    Given se ingresa a la pagina principal de bookin
    And se encuentra la opcion de buscar por tipo de alojamiento
    When se ingresa a tipo glamping ingresando la fecha
    And la cantidad de personas
    Then se encuentra el destino de forma exitosa

      @manual
    Scenario: Yo como usuario busco un destino de colombia y reservo para una fecha establecida en el destino indicado
      Given se ingresa a la pagina principal de bookin
      And se encuentra la opcion de buscar por lugar de destino
      When se ingresa a guatape ingresando la fecha
      And la cantidad de personas
      Then se encuentra el destino de forma exitosa

        @manual
    Scenario: Yo como usuario busco un destino de colombia y reservo para una fecha establecida en el destino indicado
      Given se ingresa a la pagina principal de bookin
      And se encuentra la opcion de casas que encantan a los clientes
      When se ingresa por el boton ver disponibilidad
      Then se selecciona la cantidad y se visualiza mensaje de opcion indicada para su grupo