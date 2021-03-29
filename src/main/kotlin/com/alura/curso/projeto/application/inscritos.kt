package com.alura.curso.projeto.application

import com.alura.curso.projeto.domain.ProcessData
import com.alura.curso.projeto.domain.dto.SubsDTO
import java.io.File

fun main() {
    var username = String ?: "NÃO HÁ DADO"
    val date = String ?: "NÃO HÁ DADO"
    val tier = String ?: "NÃO HÁ DADO"
    val tenure = String ?: "NÃO HÁ DADO"
    val streak = String ?: "NÃO HÁ DADO"
    val subtype = String ?: "NÃO HÁ DADO"
    val founder = String

    val subs = SubsDTO(
        username,
        date as String,
        tier as String,
        tenure as String,
        streak as String,
        subtype as String,
        founder as String
    )

    val processar = ProcessData()

    processar.processLineByLine(File("./subscriber-list.csv")) {
        subs.username = it["username"]!!

        println(username)
//        val inscrever = Sub (
//        )

//            println(inscrever)
        // 'select *' SQL: SELECT Subs.id, Subs.username FROM Subs
//        println("Subs: ${inscrever.username}")
    }
}
