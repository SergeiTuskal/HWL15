package com.example.hwl15.workers

class FixPaymentWorkers(id: Int, name: String, var mounthPayment: Double) : Workers(id, name) {
    public override fun calculateAveragePayment(): Double {
        return mounthPayment
    }

    override fun toString(): String {
        return super.toString() + " fixed " + calculateAveragePayment()
    }
}