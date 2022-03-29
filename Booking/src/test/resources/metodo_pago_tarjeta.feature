#Autor: Jonh Alexander Espinal Gómez
#language: es

  Característica: Yo como usuario requiero realizar una reserva para cartagena y pagar con tarjeta de credito
    validando que se ingresen correctamente los datos personales

  Escenario: yo como usuario requiero realizar una reserva y pagar con tarjeta de credito validando que soy
    el titular
    Dado que se busca el destino de cartagena disponible para tres dias cuatro adultos cero ninos
    Cuando se ingresan los datos personales
    Entonces se valida el nombre del titular de la tarjeta

    Escenario: yo como usuario requiero realizar una reserva y pagar con tarjeta de credito validando
     contra credenciales incorrectas
      Dado que se busca el destino de bogota disponible para tres dias cuatro adultos cero ninos
      Cuando se ingresan los datos personales
      Entonces se compara nombre del titular de la tarjeta con uno erroneo

    @ValidarTarjetaCredito
    Escenario: yo como usuario requiero realizar una reserva y validar si es posible pagar con con tarjeta
      de credito American Express
      Dado que se busca el destino de meta disponible para tres dias cuatro adultos cero ninos
      Cuando se ingresan los datos personales
      Entonces se valida tipo de tarjeta American Express