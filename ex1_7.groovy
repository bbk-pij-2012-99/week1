println "Enter three numbers: ";
Integer x = Integer.parseInt(System.console().readLine());
Integer y = Integer.parseInt(System.console().readLine());
Integer z = Integer.parseInt(System.console().readLine());
Integer min

if (x > y) {
	min = y;
	y = x;
	x = min;	
}
if (z < x) {
	min = z;
	z = y;
	y = x;
	x = min;
}
else if (z < y) {
	min = z;
	z = y;
	y = min;
}

println "Ordered: " + x + ", " + y + ", " + z;
