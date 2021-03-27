package com.alura.curso.curso2

fun testaHerancaPolimorfismo() {
	val cirino = Funcionario(
		"Cirino",
		"111,1,1,1",
		1000.0
	)

	println("Funcionario: ${cirino.nome}")
	println("Salario: ${cirino.salario}")
	println("Bonificação: ${cirino.bonificacao + cirino.salario}")

	val dagmar = Gerente(
		"Dagmar",
		"122.33.44-5",
		2000.0,
		1234
	)

	println("Gerente: ${dagmar.nome}")
	println("Salario: ${dagmar.salario}")
	println("Bonificação: ${dagmar.bonificacao}")
	println(dagmar.autentica(1234))

	val mi = Diretor(
		"Mi",
		"122.33.44.5",
		4000.0,
		200.0,
		1234
	)

	println("Diretor: ${mi.nome}")
	println("Salario: ${mi.salario}")
	println("Bonificação: ${mi.bonificacao}")
	println(mi.autentica(1234))

	val lu = Analista(
		"Luiza",
		"122.33.44.5",
		5000.0
	)

	println("Diretor: ${lu.nome}")
	println("Salario: ${lu.salario}")
	println("Bonificação: ${lu.bonificacao}")

	val calculadora = CalculadoraBonificacao()
	calculadora.registra(cirino)
	calculadora.registra(dagmar)
	calculadora.registra(mi)
	calculadora.registra(lu)

	println(calculadora.total)
}
