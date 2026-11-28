// Aufgabe 4b:
void averageC0Test(){
    assert Main.average(new int[]{1, 2, 3}) == 2.0 : "C0-Test Fall 1 gescheitert.";
    assert Main.average(null) == 0.0 : "C0-Test Fall 2 gescheitert.";
}

// Aufgabe 4c:
void averageC1Test(){
    assert Main.average(new int[]{1, 2, 3}) == 2.0 : "C1-Test Fall 1 gescheitert.";
    assert Main.average(null) == 0.0 : "C1-Test Fall 2 gescheitert.";
    assert Main.average(new int[0]) == 0.0 : "C1-Test Fall 3 gescheitert.";
}

void main(){
    averageC0Test();
    averageC1Test();
}