#Autor: John Alexander Espinal Gómez

  Feature: Yo como usuario requiero crear una cuenta con el email personal

    @manual
    Scenario: Crear cuenta en booking desde la pagina principal utilizando correo electronico personal

      Given que ingreso a la pagina principal de booking
      When selecciono el boton hazte una cuenta
      And se habilita el campo para ingresar email
      And se ingresa la contrasena que contendra la cuenta
      Then se realiza la creacion de la cuenta de forma exitosa

    @manual
    Scenario: Crear cuenta en booking desde la pagina principal utilizando la red social de facebook
    Given que ingreso a la pagina principal de booking
    When selecciono el boton hazte una cuenta
    And se habilita el boton para ingresar la cuenta de facebook
    Then se realiza la creacion de la cuenta de forma exitosa

    @manual
    Scenario: Crear cuenta en booking desde la pagina principal utilizando la opcion de telefono movil
    Given que ingreso a la pagina principal de booking
    When selecciono el boton hazte una cuenta
    And se habilita el boton para ingresar el numero de telefono
    Then se realiza la creacion de la cuenta de forma exitosa