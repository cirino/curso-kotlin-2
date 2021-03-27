package com.alura.curso.curso2

class Diretor(
	nome: String,
	cpf: String,
	salario: Double,
	val plr: Double,
	private val senha: Int
): Funcionario(
	nome = nome,
	cpf = cpf,
	salario = salario
) {
	override val bonificacao: Double
		get() {
			return super.bonificacao + salario + plr
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