package com.example.hwl15.workers

abstract class Workers(var id: Int, var name: String) {
    abstract fun calculateAveragePayment(): Double
    override fun toString(): String {
        return "#$id $name"
    }

    val averagePayment: Double
        get() = calculateAveragePayment()
}