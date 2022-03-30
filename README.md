# Automatización de Pruebas Funcionales para BOOKING

Automatización de pruebas funcionales para el proyecto booking, dirigira a certificar el Front de la plataforma booking.com

## Pre-requisitos

* Intalar el [webdriver] de chrome ya que este es necesario para ejecutar la automatización. Cabe mencionar que la aplicación que se automatizó es web por lo tanto se requiere dicho intermediario.
* Tener el [JDK] Java Development Kit como minimo en la versión 1.8

## Instalacion 

* Tener el chromedriver en el proyecto
* Clonar el proyecto de su rama [main]
* Con la combinación de comandos gradle se puede compilar, ejecutar, o realizar las tareas que por defecto gradle abarca. Recordar ubicarse en la raizdel proyecto descargado, desde allí ejecutar los comandos propuestos a continuación.
Para nuestro proyecto las pruebas son ejecutadas indicando una abreviación del Runner que se ejecutará ya sea de manera puntual, por paquetes, por varios runner en especifico, o toda la suite de pruebas en el protecto y su reporte de documentacion viva

- "gradlew build -x test"______________//(Compilar el proyecto)
- "gradlew test --test *xxxxx*"___________//(Para ejecutar un runner especifico)
- "gradlew test aggregate"_____________//(Para ejecutar toda la suite de pruebas en el proyecto y su reporte de documentacion viva)

# Herramientas Aplicadas en el diseño y ejecución

Con buil.gradle se quiere mostrar las diferentes librerias que se usaron para la automatización con sus respectivas versiones.

buildscript {
repositories {
mavenCentral()
}
dependencies {
classpath "net.serenity-bdd:serenity-gradle-plugin:2.0.90"
}
}

plugins {
id 'java'
}

group 'org.example'
version '1.0-SNAPSHOT'

repositories {
mavenCentral()
}
ext{
serenityVersion= '2.1.4'
serenityCucumberVersion = '1.9.50'
}

dependencies {
testImplementation group: 'junit', name: 'junit', version: '4.12'
implementation group: 'net.serenity-bdd', name: 'serenity-cucumber', version: '3.2.0'
implementation group: 'net.serenity-bdd', name: 'serenity-core', version: '3.2.0'
implementation group: 'net.serenity-bdd', name: 'serenity-screenplay', version: '3.2.0'
implementation group: 'net.serenity-bdd', name: 'serenity-screenplay-webdriver', version: '3.2.0'
}

## Autor 

* John Alexander Espinal Gómez (Automatización completa)
