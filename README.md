# FRAMEWORK DE PRUEBAS
## Index
1. Introduccion
2. Alcance
3. Estructura del Framework de Automatizacion
4. Librerias
5. Ambiente del sistema
6. Test Report
---
### 1. Introduccion
Esta Estrategia de Pruebas Automatizadas describe el alcance de las pruebas, el entorno de pruebas, los recursos necesarios, las herramientas a utilizar.
### 2. Alcance
Las pruebas de caja negra (automatizadas) se realizarán sobre las funcionalidades de cada modulo del sitio web financiero.
Los modulos a automatizar dentro del sistema son: 
+ Api Market
+ Solicitud de Productos en Linea
+ Personas
+ Empresas
+ Grupo
+ Agencias y Sucursales
### 3. Estructura del Framework de Automatizacion
El framework de pruebas estara estructura por el patron de diseno:
+ Page Object: P.O. encapsula la interfaz de usuario y proporciona una API específica de la aplicación para permitir la manipulación 
de los componentes de la interfaz de usuario necesarios para las pruebas. De este modo, permite que la propia clase de prueba se centre en la lógica de la prueba.
### 4. Librerias
+ Selenium-support: 3.141.59
+ Extent-reports: 5.0.3
+ Selenium-java: 3.141.59
+ Testng: 6.14.3
### 5. Ambiente del sistema
+ S.O: WINDOWS 10
+ JAVA 11
+ ChromeDriver: Version 97.0.4692.71 (64-bit)
+ FirefoxDriver: 95.0.2 (64-bit)
### 6. Test Report
El reporte de pruebas sera generado automaticamente atraves del test runner testng y la libreria extent report. Este reporte contiene el resultado de la ejecucion de las pruebas de cada test case.
Este tendra la informacion de passed,failed, success rate y tiempo de ejecucion.
+ Ubicacion del reporte generado:
  + C:\\Reports\\Report", "Reporte de pruebas
