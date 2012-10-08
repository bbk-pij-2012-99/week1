println "Enter number: "
Integer num = Integer.parseInt(System.console().readLine())
Integer i = 1
boolean isPrime = true

while (isPrime && i < num - 1) {
	i++
	if (num%i == 0) {
		isPrime = false
	}
}

if (isPrime) {
	println "Number is a prime"
}
else {
	println "Number is not a prime"
}