package com.alura.curso.modulo1

fun main() {
	val cirino = Funcionario(
		"Cirino",
		"111,1,1,1",
		1000.0
	)

	println("Funcionario: ${cirino.nome}")
	println(cirino.bonificacao())

	val dagmar = Gerente(
		"Dagmar",
		"122.33.44.5",
		2000.0,
		1234
	)

	println("Gerente: ${dagmar.nome}")
	println(dagmar.bonificacao())
	println(dagmar.autentica())
}





