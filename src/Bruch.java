public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        // TODO: Setzen Sie die Attribute entsprechend
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {

        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        // Achtung: Ganzzahldivision!
        return (double) numerator / (double) denominator;
    }

    public String print() {
        // TODO: Die Methode soll den Bruch als Text retournieren z.B.: "5 / 7"
        return numerator + " / " + denominator;
    }

    public Bruch multiplicate(Bruch b2) {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */
        int numeratorMultiplicate = numerator * b2.getNumerator();
        int denominatorMultiplicate = denominator * b2.getDenominator();
        return new Bruch(numeratorMultiplicate, denominatorMultiplicate);

    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3
        int numeratorMultiplicate = numerator * b2.getNumerator() * b3.getNumerator();
        int denominatorMultiplicate = denominator * b2.getDenominator() * b3.getDenominator();
        return new Bruch(numeratorMultiplicate, denominatorMultiplicate);
    }
}
