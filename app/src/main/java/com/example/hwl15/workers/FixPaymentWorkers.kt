package com.example.hwl15.workers

class FixPaymentWorkers(id: Int, name: String, var monthPayment: Double) : Workers(id, name) {
    override fun calculateAveragePayment(): Double = monthPayment

    override fun toString(): String {
        return super.toString() + " fixed " + calculateAveragePayment()
    }
}