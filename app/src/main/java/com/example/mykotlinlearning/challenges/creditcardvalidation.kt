package com.example.mykotlinlearning.challenges

/**
 * validate a credit card:
 * Input is a card number and expiry date.
 * Output should be valid or not.
 * First 4 digits should be either 1111, 1232, 5627, 8121
 *
 * Last 4 digits should be expiry date mm/yy
 * Input: 1111-2321-7625-1234
 * Input2: 12/34
 *
 * Output should be valid/true
 */

val firstFourDigits = listOf<String>("1111", "1232", "5627", "8121")
val creditCardNumberInput = "1111-2321-7625-1234"

fun main() {
    println("${isCreditCardValid(creditCardNumberInput)}")
}

fun isCreditCardValid(creditCardNumberInput: String): String {
    return firstFourDigits.contains(creditCardNumberInput.split("-").first())
        .let { isAcceptedFirstFour ->
            if (!isAcceptedFirstFour) {
                return "Invalid Credit Card Number"
            }
            try {
                val expiryMonth = creditCardNumberInput.split("-").last().substring(0, 2).toInt()
                val expiryYear = creditCardNumberInput.split("-").last().substring(2, 4).toInt()
                if (!(0..99).contains(expiryYear) or !(1..12).contains(expiryMonth)) {
                    return "Invalid Credit Card Number"
                } else {
                    "Valid Credit Card Number"
                }
            } catch (ex: Exception) {
                "Invalid Credit Card Number"
            }
        }
}
