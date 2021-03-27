package projeto

import java.io.File

fun processLineByLine(csv: File, processor: (Map<String, String>) -> Unit)  {
    val BOM = "\uFEFF"
    val header = csv.useLines { it.firstOrNull()?.replace(BOM, "")?.split(";") }
        ?: throw Exception("This file does not contain a valid header")

    csv.useLines { linesSequence ->
        linesSequence
            .drop(1)
            .map { it.split(";") }
            .map { header.zip(it).toMap() }
            .forEach(processor)
    }
}

fun main() {
    processLineByLine(File("./subscriber-list.csv")) {
//        println("A: ${it["a"]} | B: ${it["b"]}")
        println(it)
    }
}