package com.vit.democalculator

import androidx.annotation.StringDef
import com.vit.democalculator.Constants.Companion.ADD
import com.vit.democalculator.Constants.Companion.DIV
import com.vit.democalculator.Constants.Companion.EIGHT
import com.vit.democalculator.Constants.Companion.FIVE
import com.vit.democalculator.Constants.Companion.FOUR
import com.vit.democalculator.Constants.Companion.MUL
import com.vit.democalculator.Constants.Companion.NINE
import com.vit.democalculator.Constants.Companion.ONE
import com.vit.democalculator.Constants.Companion.SEVEN
import com.vit.democalculator.Constants.Companion.SIX
import com.vit.democalculator.Constants.Companion.SUB
import com.vit.democalculator.Constants.Companion.THREE
import com.vit.democalculator.Constants.Companion.TWO
import com.vit.democalculator.Constants.Companion.ZERO

@StringDef(MUL, ADD, DIV, SUB, ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE)
@Retention(AnnotationRetention.SOURCE)
annotation class Constants {
    companion object {
        const val MUL = "*"
        const val ADD = "+"
        const val DIV = "/"
        const val SUB = "/"
        const val ZERO = "0"
        const val ONE = "1"
        const val TWO = "2"
        const val THREE = "3"
        const val FOUR = "4"
        const val FIVE = "5"
        const val SIX = "6"
        const val SEVEN = "7"
        const val EIGHT = "8"
        const val NINE = "9"
    }
}
