package com.example.dogglers.model

import androidx.annotation.DrawableRes

data class DogConverted(
    val name: String,
    var members: List<Dog>
    ){
        data class Members(
            @DrawableRes
            val imageResourceId: Int,
            val name: String,
            val age: String,
            val hobbies: String,
            val section: String
        )
    }
