public class BrowserDownload implements DownloadManagerInt{

    private final long fileSize;
// getFileSize
    @Override
    public long gibGroesse() {
        return 0;
    }

    public BrowserDownload(long fileSize) {
        this.fileSize = fileSize;
    }
//getProgress
    @Override
    public double gibFortschritt() {
        return 0;
    }
//isEnd
    @Override
    public boolean istFertig() {
        return false;
    }
//get
    @Override
    public long gibVerbleibend() {
        return 0;
    }

    @Override
    public void empfange(long paketGroesse) {

    }
}
