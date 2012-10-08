println "Enter positive numbers (end with -1)"
boolean finished = false
Integer num
Integer max = 0

while (!finished) {
	num = Integer.parseInt(System.console().readLine());
	if (num == -1) {
		finished = true;
		break;
	}	
	else if (num > max) {
		max = num;
	}
}
println "Maximum number: " + max;