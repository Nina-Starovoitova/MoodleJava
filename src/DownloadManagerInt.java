public interface DownloadManagerInt {

    /**
     * Gibt die Größe der herunterzuladenden Datei in Bytes zurück.
     *
     * @return die Größe der Datei in Bytes
     */
    long gibGroesse();

    /**
     * Gibt den aktuellen Downloadfortschritt als Zahl zwischen 0 und 1 zurück
     * (0 = 0%, 1 = 100%).
     *
     * @return der aktuelle Fortschritt
     */
    double gibFortschritt();

    /**
     * Gibt zurück, ob der Download abgeschlossen ist.
     *
     * @return ob der Download abgeschlossen ist
     */
    boolean istFertig();

    /**
     * Gibt die Anzahl der Bytes zurück, die noch heruntergeladen
     * werden müssen.
     *
     * @return die Anzahl der verbleibenden Bytes
     */
    long gibVerbleibend();

    /**
     * Markiere ein neues Datenpaket mit der angegebenen Größe als empfangen.
     * Diese Methode sollte erst aufgerufen werden, wenn das entsprechende
     * Paket vollständig gespeichert wurde.
     *
     * @param paketGroesse die Anzahl der neu empfangenen Bytes
     * @require paketGroesse >= 0
     * @require paketGroesse <= gibVerbleibend()
     */
    void empfange(long paketGroesse);
}

