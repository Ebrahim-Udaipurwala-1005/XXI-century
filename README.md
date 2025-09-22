# XXI century

This project is a solution to the "XXI century" exercise for the **INHN0002 Fundamentals of Programming** course, taught by Prof. Dr. Stefan Wagner. This exercise focuses on number conversion and list manipulation by implementing methods to convert between Roman numerals and decimal numbers, and to manage a history of these conversions.

---

## Solution Overview

The solution is divided into two main parts: a `Converter` class and a `History` class. The `Converter` class handles the core logic for converting between decimal and Roman numerals. The `History` class then utilizes the `Converter` to manage a list of records, which are Roman numerals representing centuries.

---

## Implemented Functionalities

The solution successfully implements all the required methods in both the `Converter` and `History` classes.

### Part 1: `Converter` Class

This class contains the logic for number conversion.

* `convertToInt(String)`: This method converts a Roman numeral string to its decimal integer equivalent.
* `convertToRoman(int)`: This method converts a decimal integer to its Roman numeral string representation.

### Part 2: `History` Class

This class manages a list of historical records, which are Roman numerals.

* `sortRecords()`: This method sorts the `historyRecords` list in non-decreasing order. It uses the `convertToInt()` method from the `Converter` class to get the decimal value of each Roman numeral for proper sorting.
* `printRecords()`: This method prints the contents of the `historyRecords` list to the console. The output is formatted to show both the Roman numeral and its corresponding decimal number. 
