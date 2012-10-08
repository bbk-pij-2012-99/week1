println "Enter two numbers: ";
Integer x = Integer.parseInt(System.console().readLine());
Integer y = Integer.parseInt(System.console().readLine());
Integer quotient = 0;
Integer remainder = x;

while (remainder > y) {
	quotient = quotient + 1;
	remainder = remainder - y;
}
println x + " divided by " + y + " is " + quotient + ", remainder " + remainder;