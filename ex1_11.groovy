println "Enter five cards by entering value then suit";
Integer min, val1, val2, val3, val4, val5;
Integer i = 0;
Integer numPair = 0;
Integer maxRank = 1;
boolean sameSuit = false;
boolean isStraight = false;
String str;

//load cards

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


// Order values
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

//Check consecutive

if ( (val2 - val1 == 1) && (val3 - val2 == 1) && (val4 - val3 == 1) && (val5 - val4 == 1) {
	isStraight = true;
}
	
//Check ranks

if ((val1 == val4) || (val2 == val5)) {
	maxRank = 4;
}
else if (val1 == val3) {
	maxRank = 3;
	if (val4 == val5) {
		numPair = 1;
	}
}
else if (val2 == val4) {
	maxRank = 3;
}
else if (val3 == val5) {
	maxRank = 3;
	if (val1 == val2) {
		numPair = 1;
	}
}
else if (val1 == val2) {
	numPair = 1;
	if (val3 == val4 || val4 == val5) {
		numPair = 2;
	}
}
else if (val2 == val3) {
	numPair = 1;
	if (val4 == val5) {
		numPair = 2;
	}
}
else if (val3 == val4 || val4 == val5) {
	numPair = 1;
}



//Check suits

if ((suit1 == suit2) && (suit1 == suit3) && (suit1 == suit4) && (suit1 == suit5) {
	sameSuit = true;
}

//Choose best hand

println "Best hand:"
if (isStraight && sameSuit) {
	println "Stright flush"
}
else if (maxRank == 4) {
	println "Poker"
}
else if (maxRank == 3 && numPair == 1) {
	println "Full House"
}
else if (sameSuit) {
	println "Flush"
}
else if (isStaight) {
	println "Straight"
}
else if (maxRank == 3) {
	println "Three of a kind"
}
else if (numPairs == 2) {
	println "Two pairs"
}
else if (numPairs == 1) {
	println "Pair"
}
else {
	println "Nothing"
}
	