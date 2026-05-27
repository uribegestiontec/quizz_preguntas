### Segundo proyecto

Nombre del proyecto:
Quizz_Preguntas: Un juego de trivia historica
Esta aplicación es un juego de trivia interactivo donde se preguntaran con 10 preguntas s sobre historia. El sistema evalúa las respuestas en tiempo real, 
calcula la puntuación final de manera automática y filtra los resultados obtenidos para llevar un control estructurado del desempeño del jugador.

Instrucciones de instalación y ejecución
Pasos para su ejecucion

 Prerrequisitos
- Tener instalado el Java Development Kit (JDK) (versión 17 o superior).
- Tener instalado el compilador de Kotlin o un entorno compatible (como Android Studio / IntelliJ IDEA).

### Pasos exactos en la terminal

1. Clonar el repositorio
  git clone [https://github.com/UribeGestionTEC/Quizz_preguntas.git](https://github.com/UribeGestionTEC/Quizz_preguntas.git)

2. Acceder a la carpeta del proyecto.
   cd Quizz_preguntas

3. Ejecutar los archivos fuente.
  kotlinc app/src/main/java/com/example/proyectotrivia/Preguntas.kt app/src/main/java/com/example/proyectotrivia/Main.kt -include-runtime -d TriviaConsole.jar

4. Ejecutar la apicacion.
   java -jar TriviaConsole.jar

### Funcionalidades principales
- Trivia Interactiva Completa: Generara 10 preguntas históricas  de opción múltiple de forma secuencial.

- Validación de Entradas Robustas: El sistema previene errores de ejecución evaluando que el usuario ingrese únicamente valores numéricos válidos dentro del rango de las opciones de la pregunta.

- Cálculo de Calificación Automatizado: Cuando termine el juego, se calcula y muestra el puntaje total obtenido y el porcentaje de efectividad de las respuestas correctas.

- Módulo de Filtrado Funcional: Cuenta con una lógica de filtrado posterior al juego para clasificar o revisar dinámicamente el estatus de las respuestas ingresadas.

### Requisitos tecnicos

- Data Classes: Son estructuras de datos limpias utilizada para moldear de manera eficiente las entidades que representan las preguntas y sus opciones.
  Ubicación: Archivo Preguntas.kt - data class Pregunta.

- Control de Flujo: Uso de estructuras condicionales y bucles esenciales para iterar ordenadamente sobre las 10 preguntas y verificar el rango numérico de las entradas del usuario.
  Ubicación: Archivo Main.kt - Bucles for y condicionales if-else.

- Manejo de Excepciones: Implementación de bloques de captura de errores diseñados para evitar caídas imprevistas (crashes) del sistema en caso de que el usuario introduzca caracteres de texto en lugar de números.
  Ubicación: Archivo Main.kt - Bloque try-catch alrededor de la lectura de datos.

- Expresiones Lambda y Colecciones Procesamiento avanzado de datos utilizando operaciones declarativas sobre colecciones para filtrar y clasificar las respuestas guardadas de manera óptima al finalizar el cuestionario.
  Ubicación: Archivo Main.kt - Operaciones con funciones de extensión.

¿Qué fue lo más difícil de este proyecto y cómo lo resolviste? 
- Para mi como tal fue el entender el sistema que se usa con Kotlin, Entender como es que funciona el flujo del proyecto y de como se asignan cada clases,
 ademas de la correcion de errores que en un principio no entendia el error o como es que este error afectaba a los demas programas, generalmente se aprendio con esfuerzo y apoyo
 de compañeros del aula para poder solucionar lo que afectaba al codigo.

¿Hubo algún concepto de Kotlin que al principio no entendías y que ahora sí comprendes?
-Si, en un principio no lograba que funcionara el filtrado de las conecciones utilizando datos que no venian al cazo o que perjudicaban el proceso del codigo
y al leer la teoria y como se hacia en un principio se vehia facil pero a medida de que se hiba desarrollando tanian mayor complejidad para mi
y me resultaba un poco estresante ademas de la logica de kotlin pasaba lo mismo pero gracias a diferentes factores supe como organizarlos mejor.

¿Cómo llegaste a entenderlo?
- Logre entender las cuestiones de kotlin gracias a varios videos que me apoyaron en el desarrollo del programa, adeas recibi mucho apoyo de amigos, compañeros e integrantes del equipo
 que apoyaron a resolver muchas dudas y errores del software y hardware que presentaba.
  
Si tuvieras que mejorar o ampliar este proyecto, ¿qué le agregarías y por qué?     
-Mejoraria la persistencia de los datos en las aplicaciones ya que al momento de el cierre del programa el progreso que este de cada jugador se perdera de no ser de un servidor local
-Añadiria una mayor cantidad de preguntas en el sistema para que los jugadores puedan tener mas puntuacion ademas de preguntas habiertas para mayor emocion
-Crearia una interfaz grafica dinamica y divertida para los usuarios tengan una mejor experiencia
¿Qué aprendiste de este proyecto que no aprendiste solo leyendo o viendo videos?
- Aprendi que uchas cosas que tiene la aplicacion o el software son directaente encontrados dentro de la aplicacion usada, ademas de que a medida de programar
cada parte lograba enyender y buscar patrones dentro del codigo fuente similres a otros lenguajes ya vistos como Java o similitudes a javascript que ma ayudaron
a mejorar mi aprendisaje.
 
