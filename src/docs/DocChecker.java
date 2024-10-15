package src.docs;

public class DocChecker {

    public static void main(String[] args) {

        Document pdfdoc = new PdfDco();
        Document exeldoc = new ExelDoc();

        pdfdoc.getDescription();
        exeldoc.getDescription();
    }
}
