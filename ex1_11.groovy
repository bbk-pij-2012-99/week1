println "Enter five cards by entering value then suit";
Integer min, val1, val2, val3, val4, val5;
String str;

str = System.console().readLine();
if (str == "J") {
	val1 = 11;
}
else if (str == "Q") {
	val1 = 12;
}
else if (str == "K") {
	val1 = 13;
}
else {
	val1 = Integer.parseInt(str);
}
String suit1 = System.console().readLine();

str = System.console().readLine();
if (str == "J") {
	val2 = 11;
}
else if (str == "Q") {
	val2 = 12;
}
else if (str == "K") {
	val2 = 13;
}
else {
	val2 = Integer.parseInt(str);
}
String suit2 = System.console().readLine();

str = System.console().readLine();
if (str == "J") {
	val3 = 11;
}
else if (str == "Q") {
	val3 = 12;
}
else if (str == "K") {
	val3 = 13;
}
else {
	val3 = Integer.parseInt(str);
}
String suit3 = System.console().readLine();

str = System.console().readLine();
if (str == "J") {
	val4 = 11;
}
else if (str == "Q") {
	val4 = 12;
}
else if (str == "K") {
	val4 = 13;
}
else {
	val4 = Integer.parseInt(str);
}
String suit4 = System.console().readLine();

str = System.console().readLine();
if (str == "J") {
	val5 = 11;
}
else if (str == "Q") {
	val5 = 12;
}
else if (str == "K") {
	val5 = 13;
}
else {
	val5 = Integer.parseInt(str);
}
String suit5 = System.console().readLine();

\\ Order values
if (val1 > val2) {
	min = val2;
	val2 = val1;
	val1 = min;	
}
if (val3 < val1) {
	min = val3;
	val3 = val2;
	val2 = val1;
	val1 = min;
}
else if (val3 < val2) {
	min = val3;
	val3 = val2;
	val2 = min;
}
if (val4 < val1) {
	min = val4;
	val4 = val3;
	val3 = val2;
	val2 = val1;
	val1 = min;
}
else if (val4 < val2) {
	min = val4;
	val4 = val3;
	val3 = val2;
	val2 = min;
}
else if (val4 < val3) {
	min = val4;
	val4 = val3;
	val3 = minl
}
if (val5 < val1) {
	min = val5;
	val5 = val4;
	val4 = val3;
	val3 = val2;
	val2 = val1;
	val1 = min;
}
else if (val5 < val2) {
	min = val5;
	val5 = val4;
	val4 = val3;
	val3 = val2;
	val2 = min;
}
else if (val5 < val3) {
	min = val5;
	val5 = val4;
	val4 = val3;
	val3 = min;
}
else if (val5 < val4) {
	min = val5;
	val5 = val4;
	val4 = min;
}

if (suit1 == suit2) {
	if (suit2 == suit3) {
		if (suit3 == suit4) {
			if (suit4 == suit5)
