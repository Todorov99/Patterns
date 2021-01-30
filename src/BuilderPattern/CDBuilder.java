package BuilderPattern;

public class CDBuilder {

    public CDType buildSonyCD(String cdType) {
        CDType cds = new CDType();

        switch (cdType) {
            case "Samsung":
                cds.addItem(new Samsung());
                return cds;
            case "Sony":
                cds.addItem(new Sony());
                return cds;
            default:
                System.out.println("Sorry you've entered invalid cd type.");

        }

        return cds;
    }

}
