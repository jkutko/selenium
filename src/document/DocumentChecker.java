package src.document;

public class DocumentChecker {

    public static void main(String[] args) {
    Document exceldocument = new Exeldocument();
    Document pdfdocument = new Pdfdocument();

    exceldocument.getDescription();
    pdfdocument.getDescription();

    }
}
