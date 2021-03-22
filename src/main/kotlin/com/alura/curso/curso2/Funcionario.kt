package com.alura.curso.curso2

open class Funcionario(
	val nome: String,
	val cpf: String,
	val salario: Double
) {
	open val bonificacao: Double = salario * 0.1
}