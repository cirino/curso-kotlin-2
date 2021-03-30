package com.alura.curso.projeto

import com.alura.curso.projeto.domain.dto.TestModel
import com.google.gson.Gson

fun main() {
    var gson = Gson()
    var jsonString = gson.toJson(TestModel(1, "Test"))
//        Assert.assertEquals(jsonString, """{"id":1,"description":"Test"}""")
}