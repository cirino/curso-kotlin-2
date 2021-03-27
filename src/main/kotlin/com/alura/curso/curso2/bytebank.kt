package com.alura.curso.curso2

fun main() {
//	testaHerancaPolimorfismo()
//	testaCondicoes()
//	testaCopiasEReferencias()
//	testaLacos()
//	testaComportamentosConta()

	val cirino = ContaCorrente(
		"cirino",
		1234
	)
	val mi = ContaPoupanca(
		"mi",
		2222
	)

	cirino.deposita(1000.0)

	cirino.saca(100.0)
	println("saldo cirino ${cirino.saldo}")
	println("saldo mi ${mi.saldo}")

	cirino.transferencia(100.0, mi)
	println("saldo cirino ${cirino.saldo}")

	mi.transferencia(10.0, cirino)
	println("saldo cirino ${cirino.saldo}")
	println("saldo mi ${mi.saldo}")
}
