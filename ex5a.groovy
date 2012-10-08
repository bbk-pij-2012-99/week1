println "Choose an option: "
String s = System.console().readLine()
Integer choice = Integer.parseInt(s)
boolean valid = false

while (!valid) {
	switch (choice) {
	case 1:
		println "Case 1"
		valid = true
		break;
	case 2:
		println "Case 2"
		valid = true
		break;
	default:
		println "Invalid. Choose again: "
		s = System.console().readLine()
		choice = Integer.parseInt(s)
		break;
	}
}