package com.example.hwl15.workers

fun main() {
    val workers = arrayListOf<Workers>(
        FixPaymentWorkers(1, "Ivan", 5000.0),
        FixPaymentWorkers(2, "John", 5000.0),
        HourlyEmployees(3, "Andrew", 70.0),
        HourlyEmployees(4, "James", 80.0),
        FixPaymentWorkers(5, "David", 5000.0)
    )

    workers.sortBy { it.name }

    workers.sortByDescending { it.calculateAveragePayment() }

    workers.forEach {
        println(it)
    }
}