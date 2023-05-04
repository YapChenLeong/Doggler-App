/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

/**
 * An object to generate a static list of dogs
 * In short, object is used, if you want to create singleton,
 * unique object for the class and data class is a class that has equals,
 * hasCode, toString automatically generated.
 */
object DataSource {

    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.tzeitel,
            "Tzeitel",
            "7",
            "sunbathing",
            "Doggler 1"
        ),
        Dog(
            R.drawable.leroy,
            "Leroy",
            "4",
            "sleeping in dangerous places, like make sound wow wow wow",
            "Doggler 1"
        ),
        Dog(
            R.drawable.frankie,
            "Frankie",
            "2",
            "stealing socks",
            "Doggler 2"
        ),
        Dog(
            R.drawable.nox,
            "Nox",
            "8",
            "meeting new animals",
            "Doggler 2"
        ),
        Dog(
            R.drawable.faye,
            "Faye",
            "8",
            "Digging in the garden",
            "Doggler 3"
        ),
        Dog(
            R.drawable.bella,
            "Bella",
            "14",
            "Chasing sea foam",
            "Doggler 3"
        )
    )
}
