package com.alura.curso.modulo1

class Conta(
	var titular: String,
	val numero: Int
) {

	var saldo = 0.0
		private set

	init {
		println("Estudando com o curso da Alura")
	}

	fun deposita(valor: Double) {
		if (valor >= 0) {
			this.saldo += valor
		}
	}

	fun saca(valor: Double) {
		if (valor > 0 && this.saldo >= valor) {
			this.saldo -= valor
		} else {
			println("Não pode sacar o valor solicitado")
		}
	}

	fun transferencia(valor: Double, destino: Conta): Boolean {
		if (valor > 0 && this.saldo >= valor) {
			this.saldo -= valor
			destino.deposita(valor)
			return true
		}
		return false
	}
}