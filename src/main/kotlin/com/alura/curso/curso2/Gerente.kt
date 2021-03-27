package com.alura.curso.curso2

class Gerente(
	nome: String,
	cpf: String,
	salario: Double,
	private val senha: Int
): Funcionario(
	nome = nome,
	cpf = cpf,
	salario = salario
) {
	override val bonificacao: Double
		get() {
			return super.bonificacao + salario
		}

	fun autentica(senha: Int): Boolean {
		return if (this.senha == senha) {
			println("Autenticou com sucesso")
			true
		} else {
			println("Não autenticou")
			false
		}
	}
}