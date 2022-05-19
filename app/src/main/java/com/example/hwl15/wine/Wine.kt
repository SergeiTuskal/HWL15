package com.example.hwl15.wine

class Wine {
    var title: String? = null
    var trademark: String? = null
    var country: String? = null
    var date: String? = null
    var note: String? = null

    constructor(
        title: String?,
        trademark: String?,
        country: String?,
        date: String?,
        note: String?
    ) {
        this.title = title
        this.trademark = trademark
        this.country = country
        this.date = date
        this.note = note
    }

    constructor() {}
}