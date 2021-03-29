package com.alura.curso.projeto.domain.entities

import javax.persistence.*

@Entity
@Table(name = "subs")
data class Subs(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    val id: Int,

    @Column(nullable = false)
    val username: String,

    @Column(nullable = false)
    val date: String,

    @Column(nullable = false)
    val tier: String,

    @Column(nullable = false)
    val tenure: String,

    @Column(nullable = false)
    val streak: String,

    @Column(nullable = true)
    val subtype: String?,

    @Column(nullable = true)
    val founder: String?
)

