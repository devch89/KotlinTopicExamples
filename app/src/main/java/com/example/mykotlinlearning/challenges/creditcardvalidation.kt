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
val date ="12/23"

fun main() {
    println("${isCreditCardValid(creditCardNumberInput)}")
    println("Date is Valid: ${isDateValid}")
}

fun isCreditCardValid(creditCardNumberInput: String): String {
    return firstFourDigits.contains(creditCardNumberInput.split("-").first())
        .let { isAcceptedFirstFour ->
            if (!isAcceptedFirstFour) {
                return "Invalid Credit Card Number"
            }
            try {
                // todo check card conditions
                }
            } catch (ex: Exception) {
                //todo catch if conditions not met
            }
        }
}fun isDatealid(dateInput: String): String {
    return date.contains(date.split("/").first())
        .let { isDateAccepted ->
            if (!isDateAccepted) {
                return "Invalid Date "
            }
            try {
                // todo date conditions
                }
            } catch (ex: Exception) {
                //todo catch if conditions not met
            }
        }
}
