package com.example.hwl15.workers

class HourlyEmployees(id: Int, name: String, var hourRate: Double) : Workers(id, name) {
    val overallWorkingHours = 20.8 * 8
    override fun calculateAveragePayment(): Double = overallWorkingHours * hourRate

    override fun toString(): String {
        return super.toString() + " per hour " + calculateAveragePayment()
    }
}