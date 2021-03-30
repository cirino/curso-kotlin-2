package com.alura.curso.projeto.domain.entity

//import io.micronaut.core.annotation.Introspected
import javax.persistence.*

//@Introspected
@Entity
@Table(name = "subs")
data class SubsJPA(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    val id: Long?,

    @Column(nullable = false, unique = true)
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
) {
    override fun toString(): String {
        return "SubsJPA(id=$id, username='$username', date='$date', tier='$tier', tenure='$tenure', streak='$streak', subtype=$subtype, founder=$founder)"
    }
}
