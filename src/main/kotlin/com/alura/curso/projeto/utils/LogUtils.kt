package com.alura.curso.projeto.utils

import org.slf4j.LoggerFactory

object LogUtils {
    fun debug(tag: String, message: String?) {
        LoggerFactory.getLogger(tag).debug(message)
    }

    fun info(tag: String, message: String?) {
        LoggerFactory.getLogger(tag).info(message)
    }

    fun error(tag: String, message: String?, throwable: Throwable? = null) {
        LoggerFactory.getLogger(tag).error(message, throwable)
    }

    fun warn(tag: String, message: String?) {
        LoggerFactory.getLogger(tag).warn(message)
    }
}