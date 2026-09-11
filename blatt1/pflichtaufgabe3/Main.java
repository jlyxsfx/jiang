/*
 * Diese Methode bekommt beim Aufruf (siehe main-Methode unten) eine Zahl 
 * übergeben. Diese Zahl ist hier unter dem Namen "hour" verfügbar –
 * du kannst sie wie eine bereits gesetzte Variable verwenden.
 *
 * Beispiel: Wird die Methode mit greet(9) aufgerufen, hat hour hier den Wert 9.
 *
 * Das Schlüsselwort "return" beendet die Methode und gibt den dahinter
 * stehenden Wert zurück. Dieser Wert wird dann in der main-Methode
 * an IO.println(...) weitergegeben und ausgegeben.
 *
 * Aktuell gibt die Methode immer einen leeren String zurück ("").
 * Bestimme das Grußwort und setze den Return-Wert auf den gewünschten Wert.
 */
String greet(int hour){
    //TODO: Implementiere hier das Grußwort, wie auf Blatt 1 beschrieben.
    return "";
}

void main(){
    int inputNumber = Integer.parseInt(IO.readln("Bitte gib eine Zahl ein: "));
    IO.println(greet(inputNumber));
}