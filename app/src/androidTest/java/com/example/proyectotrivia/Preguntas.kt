package com.example.proyectotrivia

data class Pregunta(
    val enunciado: String,
    val opciones: List<String>,
    val respuestaCorrecta: Int
)