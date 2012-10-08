println "Enter positive numbers (end with -1)"
boolean finished = false
Integer previous, current
String s = "Yes"

previous = Integer.parseInt(System.console().readLine());
while (!finished) {
	current = Integer.parseInt(System.console().readLine());
	if (current == -1) {
		finished = true;
		break;
	}	
	else if (current - previous != 1) {
		s = "No";
	}
	previous = current;
}
println s;