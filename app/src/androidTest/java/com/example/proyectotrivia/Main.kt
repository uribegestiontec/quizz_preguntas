package com.example.proyectotrivia

fun obtenerTriviaDeHistoria(): List<Pregunta> {
    return listOf(
        Pregunta(
            enunciado = "¿En qué año se fundó la ciudad de México-Tenochtitlan?",
            opciones = listOf("1325", "1521", "1492"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            enunciado = "¿Quién es conocido como el Benemérito de las Américas?",
            opciones = listOf("Miguel Hidalgo", "Benito Juárez", "Porfirio Díaz"),
            respuestaCorrecta = 1
        ),
        Pregunta(
            enunciado = "¿Qué conflicto se conoció como la 'Guerra de los Pasteles'?",
            opciones = listOf("Primera Intervención Francesa", "Guerra de Independencia", "Revolución Mexicana"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            enunciado = "¿Qué conflicto geopolítico enfrentó a Estados Unidos contra la Unión Soviética?",
            opciones = listOf("Guerra del Peloponeso", "Segunda Guerra Mundial", "Guerra Fría"),
            respuestaCorrecta = 2
        ),
        Pregunta(
            enunciado = "¿Quién fue el principal redactor de la Constitución Mexicana de 1917?",
            opciones = listOf("Venustiano Carranza", "Emiliano Zapata", "Francisco I. Madero"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            enunciado = "¿Qué cultura prehispánica edificó la impresionante ciudad de Chichén Itzá?",
            opciones = listOf("Cultura Azteca", "Cultura Maya", "Cultura Olmeca"),
            respuestaCorrecta = 1
        ),
        Pregunta(
            enunciado = "¿Quién lideró la Revolución Francesa y posteriormente se coronó Emperador?",
            opciones = listOf("Luis XIV", "Napoleón Bonaparte", "Carlos Magno"),
            respuestaCorrecta = 1
        ),
        Pregunta(
            enunciado = "¿Qué imperio construyó el imponente Coliseo Romano?",
            opciones = listOf("Imperio Romano", "Imperio Bizantino", "Imperio Griego"),
            respuestaCorrecta = 0
        ),
        Pregunta(
            enunciado = "¿Cuál fue el documento que marcó formalmente el fin de la Primera Guerra Mundial?",
            opciones = listOf("Tratado de Tordesillas", "Tratado de Versalles", "Tratado de París"),
            respuestaCorrecta = 1
        ),
        Pregunta(
            enunciado = "¿Quién fue el célebre físico que formuló la Teoría de la Relatividad?",
            opciones = listOf("Isaac Newton", "Nikola Tesla", "Albert Einstein"),
            respuestaCorrecta = 2
        )
    )
}


fun jugarTrivia(preguntas: List<Pregunta>, respuestasUsuario: List<Int>): Int {
    var aciertos = 0

    for (i in preguntas.indices) {
        val preguntaActual = preguntas[i]
        println("\nPregunta ${i + 1}: ${preguntaActual.enunciado}")

        preguntaActual.opciones.forEachIndexed { indice, opcion ->
            println("${indice + 1}) $opcion")
        }

        // En lugar de trabar la web con readln, toma el número correspondiente de la lista
        val seleccion = respuestasUsuario.getOrNull(i) ?: 1
        println("Selecciona el número de tu respuesta (1, 2 o 3): $seleccion")

        val respuestaConvertida = seleccion - 1

        if (respuestaConvertida == preguntaActual.respuestaCorrecta) {
            println("¡Correcto!")
            aciertos++
        } else {
            val indiceCorrecto = preguntaActual.respuestaCorrecta
            println("Incorrecto. La respuesta correcta era: ${preguntaActual.opciones[indiceCorrecto]}")
        }
    }
    return aciertos
}

fun main() {
    println("Bienvenido a tu trivia de Historia")
    val preguntas = obtenerTriviaDeHistoria()


    val tusRespuestas = listOf(1, 2, 1, 3, 1, 2, 2, 1, 2, 3)

    val puntajeFinal = jugarTrivia(preguntas, tusRespuestas)

    println("\nGAME OVER!!")
    println("Tu puntaje total fue......: $puntajeFinal de ${preguntas.size} aciertos.")

    val esJuegoPerfecto = preguntas.filter { puntajeFinal == preguntas.size }

    if (esJuegoPerfecto.isNotEmpty()) {
        println("¡Felicidades! Lograste un puntaje perfecto!!.")
    } else {
        println("Buen intento. ¡ Pero lo haras mejor la proxima!")
    }
}