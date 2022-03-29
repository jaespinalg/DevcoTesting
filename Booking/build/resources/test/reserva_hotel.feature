#Autor: John Alexander Espinal Gómez
#language: es

Característica: Yo como usuario requiero reservar un hotel en santa marta con disponibilidad
  de 3 días y capacidad de 4 adultos para el mes de abril

  Escenario: El usuario ejecutará los tres pasos requeridos para realizar la reserva de un hotel de forma exitosa.
    Dado que se busca el destino de medellin disponible para tres dias cuatro adultos cero ninos
    Cuando se ingresan los datos personales
    Entonces el boton completa la reserva esta disponible

    @ComprobarDatos
    Escenario: yo como usuario requiero relizar los tres pasos requeridos para realizar la reserva
      y validar que el boton "comprueba tus datos" este disponible
      Dado que se busca el destino de amazonas disponible para tres dias cuatro adultos cero ninos
      Cuando se ingresan los datos personales
      Entonces el boton comprueba tus datos esta disponible