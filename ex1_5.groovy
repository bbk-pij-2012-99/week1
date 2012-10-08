println "Enter two numbers: ";
Integer x = Integer.parseInt(System.console().readLine());
Integer y = Integer.parseInt(System.console().readLine());
Integer product = 0;


if (x > y) {
	Integer min = y;
	y = x;
	x = min;
}

while (x > 0) {
	product = product + y;
	x = x - 1;
}
println "Product = " + product