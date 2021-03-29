package com.alura.curso.projeto.domain.entities
//
//import com.alura.curso.projeto.domain.dao.Subs
//import org.jetbrains.exposed.dao.IntEntity
//import org.jetbrains.exposed.dao.IntEntityClass
//import org.jetbrains.exposed.dao.id.EntityID
//
//class Sub(id: Int) : IntEntity(id) {
//    companion object : IntEntityClass<Sub>(Subs)
//    var username by Subs.username
//    var date by Subs.date
//    var tier by Subs.tier
//    var tenure by Subs.tenure
//    var streak by Subs.streak
//    var subtype by Subs.subtype
//    var founder by Subs.founder
//}