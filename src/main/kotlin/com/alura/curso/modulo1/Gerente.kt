package com.alura.curso.modulo1

class Gerente(
	val nome: String,
	val cpf: String,
	val salario: Double,
	val senha: Int
) {
	fun bonificacao(): Double {
		return this.salario * 0.2
	}

	fun autentica(): Boolean {
		if (this.senha == 1234) {
			println("Autenticou com sucesso")
			return true
		} else {
			println("Não autenticou")
			return false
		}
	}
}