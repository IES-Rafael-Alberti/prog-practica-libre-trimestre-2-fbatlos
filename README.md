[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/NBVXLiSy)
# Actividad: Desarrollo de Proyecto Software en Kotlin

**ID actividad:** 2324_PRO_u4u5u6_libre

**Agrupamiento de la actividad**: Individual 

---

### Descripción:

La actividad consiste en el desarrollo de un proyecto software en Kotlin, permitiendo al estudiante elegir la temática. Este proyecto debe demostrar la comprensión y aplicación de los conceptos de programación orientada a objetos (POO), incluyendo la definición y uso de clases, herencia, interfaces, genericos, principios SOLID y el uso de librerías externas.

**Objetivo:**

- Demostrar comprensión de los fundamentos de POO mediante la instanciación y uso de objetos.
- Aplicar conceptos avanzados de POO como herencia, clases abstractas, e interfaces.
- Crear y usar clases que hagan uso de genéricos. 
- Aplicar principios SOLID.
- Integrar y utilizar librerías de clases externas para extender la funcionalidad del proyecto.
- Documentar y presentar el código de manera clara y comprensible.

**Trabajo a realizar:**

1. **Selección de la Temática:** Elige un tema de tu interés que pueda ser abordado mediante una aplicación software. Esto podría ser desde una aplicación de gestión para una pequeña empresa, una herramienta para ayudar en la educación, hasta un juego simple. Define claramente el problema que tu aplicación pretende resolver.

2. **Planificación:** Documenta brevemente cómo tu aplicación solucionará el problema seleccionado, incluyendo las funcionalidades principales que desarrollarás.

3. **Desarrollo:**
   - **Instancia de Objetos:** Tu aplicación debe crear y utilizar objetos, demostrando tu comprensión de la instanciación y el uso de constructores, métodos, y propiedades.
   - **Métodos Estáticos:** Define y utiliza al menos un método estático, explicando por qué es necesario en tu aplicación.
   - **Uso de IDE:** Desarrolla tu proyecto utilizando un IDE, aprovechando sus herramientas para escribir, compilar, y probar tu código.
   - **Definición de Clases:** Crea clases personalizadas con sus respectivas propiedades, métodos, y constructores.
   - **Clases con genéricos:** Define y utiliza al menos una clase que haga uso de genéricos en tu aplicación.
   - **Herencia y Polimorfismo:** Implementa herencia y/o interfaces en tu proyecto para demostrar la reutilización de código y la flexibilidad de tu diseño.  **Usa los principios SOLID:** Ten presente durante el desarrollo los principios SOLID y úsalos durante el diseño para mejorar tu aplicación.
   - **Librerías de Clases:** Integra y utiliza una o más librerías externas que enriquezcan la funcionalidad de tu aplicación.
   - **Documentación:** Comenta tu código de manera efectiva, facilitando su comprensión y mantenimiento.

4. **Prueba y Depuración:** Realiza pruebas para asegurarte de que tu aplicación funciona como se espera y depura cualquier error encontrado.
5. **Contesta a las preguntas** ver el punto **Preguntas para la Evaluación**

### Recursos

- Apuntes dados en clase sobre programación orientada a objetos, Kotlin, uso de IDEs, y manejo de librerías.
- Recursos vistos en clase, incluyendo ejemplos de código, documentación de Kotlin, y guías de uso de librerías.

### Evaluación y calificación

**RA y CE evaluados**: Resultados de Aprendizaje 2, 4, 6, 7 y Criterios de Evaluación asociados.

**Conlleva presentación**: SI

**Rubrica**: Mas adelante se mostrará la rubrica.

### Entrega

> **La entrega tiene que cumplir las condiciones de entrega para poder ser calificada. En caso de no cumplirlas podría calificarse como no entregada.**
>
- **Conlleva la entrega de URL a repositorio:** El contenido se entregará en un repositorio GitHub. 
- **Respuestas a las preguntas:** Deben contestarse en este fichero, README.md


# Preguntas para la Evaluación

Este conjunto de preguntas está diseñado para ayudarte a reflexionar sobre cómo has aplicado los criterios de evaluación en tu proyecto. Al responderlas, **asegúrate de hacer referencia y enlazar al código relevante** en tu `README.md`, facilitando así la evaluación de tu trabajo.

#### **Criterio global 1: Instancia objetos y hacer uso de ellos**
- **(2.a, 2.b, 2.c, 2.d, 2.f, 2.h, 4.f, 4.a)**: Describe cómo has instanciado y utilizado objetos en tu proyecto. ¿Cómo has aplicado los constructores y pasado parámetros a los métodos? Proporciona ejemplos específicos de tu código.

- 
  –He instanciado y utilizado objetos de diversas clases para representar todos los elementos que tiene mi escape room , siendo estos las habitaciones , la contraseña , los objetos que hay en la habitación y la consola.
- Mis objetos se instancian en diversas partes como el main y en el método iniciar escape room.

-https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/475de939a49027e587893d58ce62a37c68f9ddbe/src/main/kotlin/Main.kt#L16-L20

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/7f671630bbce322940012c577c0fae2863db373e/src/main/kotlin/EscapeRoom.kt#L9-L21

–Los constructores se usan para iniciar la clase y poder proporcionarle información de forma externa, en el siguente ejemplo te muestro como el escape room le otorga informacion de la historia y la contraseña a cada habitacion.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/7f671630bbce322940012c577c0fae2863db373e/src/main/kotlin/EscapeRoom.kt#L14-L19


#### **Criterio global 2: Crear y llamar métodos estáticos**
- **(4.i)**: ¿Has definido algún método/propiedad estático en tu proyecto? ¿Cuál era el objetivo y por qué consideraste que debía ser estático en lugar de un método/propiedad de instancia?

-Si , he creado los objetos de la habitacion de forma estatica ya que estos no quiero que se generen de no por su clase , es decir , para que cada habitacion tenga sus diferentes objetos :

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/7f671630bbce322940012c577c0fae2863db373e/src/main/kotlin/Habitacion/Habitacion.kt#L33-L43

- **(2.e)**: ¿En qué parte del código se llama a un método estático o se utiliza la propiedad estática?

-Aquí podemos ver en la como se utilliza dicha clase estatica.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/7f671630bbce322940012c577c0fae2863db373e/src/main/kotlin/Habitacion/Habitacion.kt#L131-L142


#### **Criterio global 3: Uso de entornos**
- **(2.i)**: ¿Cómo utilizaste el IDE para el desarrollo de tu proyecto? Describe el proceso de creación, compilación, y prueba de tu programa.

- El IDE utilizado es el IntelliJ Idea , al momento de la creación del trabajo facilita el código y avisa de cualquier error o posible modificación para mejorar el código, inicie con la clase escape room la cual fluctuó en las habitaciones con sus diferentes enigmas. Al momento de compilar el código usé el debug para poder ver si el código seguía el camino lógico que debería seguir y así poder ver si hay un error que genera ese error.

- Para las pruebas he realizado una prueba de la función de extensión normalizar para comprobar su correcto funcionamiento.


https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/caf3109c001d7ef9eea981f72df3776e885131f0/src/main/Test/src/test/kotlin/MainKtTest.kt#L9-L19

#### **Criterio global 4: Definir clases y su contenido**
- **(4.b, 4.c, 4.d, 4.g)**: Explica sobre un ejemplo de tu código, cómo definiste las clases en tu proyecto, es decir como identificaste las de propiedades, métodos y constructores y modificadores del control de acceso a métodos y propiedades, para representar al objeto del mundo real. ¿Cómo contribuyen estas clases a la solución del problema que tu aplicación aborda?

--Data class

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/caf3109c001d7ef9eea981f72df3776e885131f0/src/main/kotlin/Usuario.kt#L6

--Enum class

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/caf3109c001d7ef9eea981f72df3776e885131f0/src/main/kotlin/Historias.kt#L1-L27

--Open class

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/caf3109c001d7ef9eea981f72df3776e885131f0/src/main/kotlin/Habitacion/Habitacion.kt#L7-L218

-Las clases fueron creadas después de haber realizado un diagrama de flujo para saber qué quería exactamente , después de ese diagrama dictamine los métodos para que cumplieran las necesidades que quería para mi escape room y siempre intentando respetar los principios SOLID.


#### **Criterio global 5: Herencia y uso de clases abstractas e interfaces**
- **(4.h, 4.j, 7.a, 7.b, 7.c)**: Describe sobre tu código cómo has implementado la herencia o utilizado interfaces en tu proyecto. ¿Por qué elegiste este enfoque y cómo beneficia a la estructura de tu aplicación? ¿De qué manera has utilizado los principios SOLID para mejorar el diseño de tu proyecto? ¿Mostrando tu código, contesta a qué principios has utilizado y qué beneficio has obtenido?

- Usos

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/caf3109c001d7ef9eea981f72df3776e885131f0/src/main/kotlin/Contrase%C3%B1a.kt#L4-L15

- Las interfaces nos permite generar los cimientos de lo que debe implementar cada clase que lo implemente.

-#Los principios SOLID

-SRP Single Responsibility Principle

Lo podemos ver en consola ya que cada metodo tiene una resposabilidad unica en el codigo.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/caf3109c001d7ef9eea981f72df3776e885131f0/src/main/kotlin/Consola.kt#L6-L37

-OCP Open Closed Principle

Nos menciona que debemos hacer un codigo abierto para la extension.
Para ello he creado un inteface generico.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/caf3109c001d7ef9eea981f72df3776e885131f0/src/main/kotlin/Contrase%C3%B1a.kt#L8-L15

-LSP Liskov Substitution Principle

Nos dice que debemos poder emplear elementos de una subclase en vez de elementos de una superclase sin necesidad de alterar el codigo.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/caf3109c001d7ef9eea981f72df3776e885131f0/src/main/kotlin/Habitacion/Habitacion.kt#L122-L130


#### **Criterio global 6: Diseño de jerarquía de clases**
- **(7.d, 7.e, 7.f, 7.g)**: Presenta la jerarquía de clases que diseñaste. ¿Cómo probaste y depuraste esta jerarquía para asegurar su correcto funcionamiento? ¿Qué tipo de herencia has utilizado: Especificación, Especialización, Extensión, Construcción?

-Especificación

Concepto: La subclase hereda las propiedades y comportamientos de la superclase, pero también introduce características únicas que la distinguen.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/bd74f1523f83381221e71b564a1482f1a2e24784/src/main/kotlin/Habitacion/Habitacion.kt#L7-L218

Que heredará a habitacion 2 teniendo características propias. 
https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/bd74f1523f83381221e71b564a1482f1a2e24784/src/main/kotlin/Habitacion/Habitacion2.kt#L6-L155

-Extensión 

Concepto: La subclase mantiene el comportamiento de la superclase y agrega nuevas características o funcionalidades que extienden su uso o aplicabilidad.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/bd74f1523f83381221e71b564a1482f1a2e24784/src/main/kotlin/Habitacion/Habitacion.kt#L7-L218

Que heredará a habitacion 2 agregando funcionalidad propia.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/bd74f1523f83381221e71b564a1482f1a2e24784/src/main/kotlin/Habitacion/Habitacion2.kt#L6-L155

-Especificación 

Concepto: La superclase establece un contrato que sus subclases deben cumplir, especificando los métodos que deben implementar sin necesariamente proporcionar una implementación concreta.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/bd74f1523f83381221e71b564a1482f1a2e24784/src/main/kotlin/Contrase%C3%B1a.kt#L4-L48

-Construcción

Concepto: La clase derivada utiliza la clase base como un punto de partida o una base sobre la cual construye su propia funcionalidad única, posiblemente sin mantener una relación conceptual "es un".

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/bd74f1523f83381221e71b564a1482f1a2e24784/src/main/kotlin/Contrase%C3%B1a.kt#L4-L48

#### **Criterio global 7: Librerías de clases**
- **(2.g, 4.k)**: Describe cualquier librería externa que hayas incorporado en tu proyecto. Explica cómo y por qué las elegiste, y cómo las incorporaste en tu proyecto. ¿Cómo extendió la funcionalidad de tu aplicación? Proporciona ejemplos específicos de su uso en tu proyecto.

- Random

Genera un numero aleatorio para elegir el tipo de historia,lo he elejido ya que es el mas usado para sacar cualquier tipo de dato de forma aleatoria.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/420e9b030b030171ebca79545d9e76abede0aeb2/src/main/kotlin/EscapeRoom.kt#L4-L11

-Jframe

Printea la imagen seleccionada de cada fichero , he elejido esta extension pues muestra la imagen de forma clara.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/420e9b030b030171ebca79545d9e76abede0aeb2/src/main/kotlin/Imagen.kt#L2-L61

#### **Criterio global 8: Documentado**
- **(7.h)**: Muestra ejemplos de cómo has documentado y comentado tu código. ¿Que herramientas has utilizado? ¿Cómo aseguras que tu documentación aporte valor para la comprensión, mantenimiento y depuración del código?

  Para la documentacion del codigo he usado kdoc , dando una breve descripcion de cada clase y metodo para dejar enclaro la funcionalidad de cada una.

  https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/caf3109c001d7ef9eea981f72df3776e885131f0/src/main/kotlin/Habitacion/Habitacion.kt#L157-L164

#### **Criterio global 9: Genéricos**
- **(6.f)**: Muestra ejemplos de tu código sobre cómo has implementado una clase con genéricos. ¿Qué beneficio has obtenido?

He usado los genericos detal forma que podrias mandale al codigo cualquier tipo de dato para hacer la historia.

https://github.com/IES-Rafael-Alberti/prog-practica-libre-trimestre-2-fbatlos/blob/420e9b030b030171ebca79545d9e76abede0aeb2/src/main/kotlin/Contrase%C3%B1a.kt#L4-L15

