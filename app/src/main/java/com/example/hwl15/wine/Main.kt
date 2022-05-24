package com.example.hwl15.wine

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val wine1 = Wine()
        wine1.title = "Винишко"
        wine1.trademark = "Винный погреб"
        wine1.country = "Беларусь"
        wine1.date = "08/03/2012"
        wine1.note = "вкусное вино"
        wineInfo(wine1)
        wineAging(wine1)
    }

    fun wineInfo(wine: Wine) {
        println("Название вина: " + wine.title)
        println("Торговая марка: " + wine.trademark)
        println("Страна изготовления: " + wine.country)
        println("Дата разлива: " + wine.date)
        println("Примечание: " + wine.note)
    }

    fun wineAging(wine: Wine): Long {
        val d1 = Date()
        val df = SimpleDateFormat("dd/MM/yyyy")
        df.timeZone = TimeZone.getTimeZone("EAT")
        val currentDate = df.format(d1)
        var date1: Date? = null
        var date2: Date? = null
        try {
            date1 = df.parse(currentDate)
            date2 = df.parse(wine.date)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        val diff = date1!!.time - date2!!.time
        val years = diff / (24 * 60 * 60 * 1000) / 365
        println("Выдержка вина " + wine.title + " составляет " + years + " лет")
        return years
    }
}