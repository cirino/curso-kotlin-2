package com.alura.curso.curso2

fun testaLacos() {
	var i = 0
	while (i < 5) {
		val titular: String = "Alex $i"
		val numeroConta: Int = 1000 + i
		val saldo = i + 10.0

		println("titular $titular")
		println("número da conta $numeroConta")
		println("saldo da conta $saldo")
		println()
		i++
	}

	(5 downTo 1).forEach { i ->
		val titular: String = "Alex $i"
		val numeroConta: Int = 1000 + i
		val saldo = i + 10.0

		println("titular $titular")
		println("número da conta $numeroConta")
		println("saldo da conta $saldo")
		println()
	}
}