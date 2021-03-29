package com.alura.curso.projeto.application

//import com.alura.curso.projeto.domain.entities.Sub
//import io.micronaut.http.HttpResponse
//import io.micronaut.http.HttpStatus
//import io.micronaut.http.annotation.Controller
//import io.micronaut.http.annotation.Get
//import io.micronaut.validation.Validated
//
//
//@Validated
//@Controller("/subs")
//class SubController {
//    @get:Get
//    val subs: HttpResponse<*>
//        get() = HttpResponse.status<Any>(HttpStatus.OK).body(Sub)
//}

//import com.alura.curso.projeto.domain.entities.Sub
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/")
class HelloController {

    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Oi"
    }

    @Get("/sub")
    fun subs(idSub: Int): Int {
        return idSub
    }
}