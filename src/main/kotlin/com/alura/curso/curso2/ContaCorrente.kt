package com.alura.curso.curso2

class ContaCorrente(
	titular: String,
	numero: Int
) : Conta(
	titular = titular,
	numero = numero,
) {
	override fun saca(valor: Double) {
		super.saca(valor + 0.10)
	}
}