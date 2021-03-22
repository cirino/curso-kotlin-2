package com.alura.curso.curso2

fun testaCopiasEReferencias() {
	val numeroX = 10
	var numeroY = numeroX
	numeroY++

	println("numeroX $numeroX")
	println("numeroY $numeroY")

	val contaJoao = Conta("Luiza", 4444)
	val contaMaria = Conta("Teo", 5555)

	println("titular conta joao: ${contaJoao.titular}")
	println("titular conta maria: ${contaMaria.titular}")

	println(contaJoao)
	println(contaMaria)
}