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
		negative = (num < 0)? negative + 1 : negative
		zero = (num == 0)? zero + 1 : zero
		positive = (num > 0)? positive + 1 : positive
	}
}
println "Number of negative values: " + negative
println "Number of zeros: " + zero
println "Number of positive values: " + positive