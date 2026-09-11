/*
 * Diese Methode bekommt beim Aufruf (siehe main-Methode unten) eine Zahl
 * übergeben. Diese Zahl ist hier unter dem Namen "n" verfügbar –
 * du kannst sie wie eine bereits gesetzte Variable verwenden.
 *
 * Beispiel: Wird die Methode mit alternatingSum(5) aufgerufen,
 * hat n hier den Wert 5. Das erwartete Ergebnis wäre dann:
 *   1 - 2 + 3 - 4 + 5 = 3
 *
 * Das Schlüsselwort "return" beendet die Methode und gibt den dahinter
 * stehenden Wert zurück. Dieser Wert ist eine Ganzzahl (int) und wird
 * in der main-Methode ausgegeben.
 *
 * Aktuell gibt die Methode immer 0 zurück.
 * Berechne die alternierende summe und setze den Return-Wert auf den gewünschten Wert.
 */
int alternateSum(int n){
    // TODO: Implementiere hier die alternierende Summe, wie auf Blatt 1 beschrieben.
    return 0;
}
void main() {      
    int inputNumber = Integer.parseInt(IO.readln("Bitte Zahl eingeben: "));
    IO.println("Die alternierende Summe von 1 bis " + inputNumber + " ist: " + alternateSum(inputNumber));
}