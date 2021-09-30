PARCIAL CORTE II 
PABLO TOLEDO

//Explicación General
El programa desarrollado está basado en una de la propuestas de ejercicio de uno de mis compañeros de clase.
El programa es un ATM lo que hace es tener un valor de dinero dentro deél y este valor va disminuyendo a medida de 
que el usuario haga retiros de dinero. 
Lo que hace el programa es permitir a una persona ingresar un monto de dinero a retirar el programa lo que hace es
verificar que valores de billetes puede entregarle al usuario para entregar el dinero. El programa está desarrollado
en el IDE de Apache Netbeans y está programado en el lenguaje de JAVA.

//Instrucciones Generales
Para utilizar el programa se debe abrir el proyecto, y dirigirse a la clase "ATMDispenseChain" el cual cuenta con
el main para poder ejecutar el programa, al correr el programa se pedirá que se ingrese un monto que debe ser un 
múltiplo del 5 y listo, el programa hará el resto. 

//Primer Patrón utilizado
- El primer patrón que se implementó para la realización de este programa es el patrón comportamental "Chain of
responsability", este es un patrón que se ajusta a la perfección a la necesidad ya que gracias a que va pasando
las responsabilidades se puede dar la mejor respuesta al usuario, es decir, cuando un usuario ingresa un valor a 
retirar el programa comienza a evaluar si puede entregar el valor del dinero en ciertos billetes, si es posible
entrega el valor y si no es posible evalúa en los demás valores hasta poder cumplir con toda la necesidad. 
- Los archivos en donde se puede evidenciar este patrón son los de "Currency" "DispenseChain" "FiftyDispenser"
"TwentyDispenser" "tenDispenser" "FiveDispenser" y "ATMDispenseChain".

//Segundo Patrón Utilizado
-El segundo patrón que se implementó en la realización de este programa es el patrón Estructural "Proxy", que es
es un patrón que controla el acceso a el objeto original por lo que pienso que para este programa se ajusta de forma
correcta, lo que se hace en este caso es que en el main se le asigna un valor al ATM y a través del proxy se obtiene
la información de la máquina, en este caso el dinero. a esta información no tiene acceso todo lo el mundo por lo que 
es privada y lo que se hace es que al sacar dinero la información del ATM se va actualizando con los nuevos valores
que están dentro de la máquina. 
- Los archivos en donde se puede evidenciar este patrón son "ATM", "ATMProxy", "getATMData" y "ATMDispenseChain" en
las líneas 24-27, 40 y 43. 

 