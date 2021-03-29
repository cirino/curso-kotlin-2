package com.alura.curso.projeto.domain

import java.io.File

class ProcessData {

    fun processLineByLine(csv: File, processor: (Map<String, String>) -> Unit) {
        val BOM = "\uFEFF"
        val header = csv.useLines { it.firstOrNull()?.replace(BOM, "")?.split(";") }
            ?: throw Exception("Sem um  header válido no csv")

        csv.useLines { linesSequence ->
            linesSequence
                .drop(1)
                .map { it.split(";") }
                .map { header.zip(it).toMap() }
                .forEach(processor)
        }
    }
}