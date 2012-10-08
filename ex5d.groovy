println "Enter numbers (end with END)"
boolean finished = false
Integer positive = 0
Integer negative = 0
Integer zero = 0
Integer num
String s

while (!finished) {
	s = System.console().readLine()
	if (s == "END") {
		finished = true
	}
	else {
		num = Integer.parseInt(s)
		if (num < 0) {
			negative = negative + 1
		}
		else if (num == 0) {
			zero = zero + 1
		}
		else {
			positive = positive + 1
		}
	}
}
println "Number of negative values: " + negative
println "Number of zeros: " + zero
println "Number of positive values: " + positive