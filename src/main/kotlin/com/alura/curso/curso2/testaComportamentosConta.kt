package com.alura.curso.curso2

fun testaComportamentosConta() {
	println("Bem vindo ao Bytebank")
	val contaAlex = Conta("Cirino", 2222)
	contaAlex.deposita(200.0)

	val contaFran = Conta("Mirele", 3333)
	contaFran.deposita(300.0)

	println(contaFran.titular)
	println(contaFran.numero)
	println(contaFran.saldo)

	println(contaAlex.titular)
	println(contaAlex.numero)
	println(contaAlex.saldo)

	println("depositando na conta do Alex")
	contaAlex.deposita(50.0)
	println(contaAlex.saldo)

	println("depositando na conta da Fran")
	contaFran.deposita(70.0)
	println(contaFran.saldo)

	println("### sacando na conta do Alex")
	contaAlex.saca(217.0)
	println(contaAlex.saldo)

	println("### Transferindo para Fran")
	if (contaAlex.transferencia(11.0, contaFran)) {
		println("transferência ok")
	} else {
		println("erro na transferência")
	}

	println(contaAlex.saldo)
	println(contaFran.saldo)
}
