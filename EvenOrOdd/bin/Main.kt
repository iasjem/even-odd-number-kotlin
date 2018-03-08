fun main(args: Array<String>) {
		println("Even or Odd? Kotlin version by IasJem \n")
		var n: Int;
		print("Enter the value of n: ")
		n = readLine()!!.toInt() // get the value of n
		checkN(n)
	}
	
	fun checkN(num: Int) { 
		when (num) { // nested when condition
			0 -> println("\n$num is neither even or odd")
		else -> when (num%2) {
			0 -> println("\n$num is even")
			else -> println("\n$num is odd")
			}
		}
	}