package com.jetbrains.simplelogin.shared

import org.mongodb.kbson.ObjectId

class Greeting {
    val id: ObjectId = ObjectId()
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
