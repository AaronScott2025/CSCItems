import java.util.Scanner;

/**
 * Takes in a style for whatever item they are currently holding, and suggests matching items
 */
public class Main {
    public static void main(String[] args) {
        pants p;
        tops t;
        shoes s;
        String in = new Scanner(System.in).nextLine();
        if(in.contains("shoes")){
            if(in.contains("party")) {
                s = new PartyBoot();
                s.getStyleShoes();
            } else if(in.contains("professional")) {
                s = new ProfessionalBoot();
                s.getStyleShoes();
            } else if(in.contains("casual")) {
                s = new CasualBoot();
                s.getStyleShoes();
            } else {
                System.out.println("Invalid input");
            }
        } else if(in.contains("tops")) {
            if(in.contains("party")) {
                t = new PartyTop();
                t.getStyleTops();
            }
            else if(in.contains("professional")) {
                t = new ProfessionalTop();
                t.getStyleTops();
            } else if(in.contains("casual")) {
                t = new CasualTop();
                t.getStyleTops();
            } else {
                System.out.println("Invalid input");
            }
        } else if(in.contains("pants")) {
            if(in.contains("party")) {
                p = new PartyPant();
                p.getStylePants();
            } else if(in.contains("professional")) {
                p = new ProfessionalPant();
                p.getStylePants();
            } else if(in.contains("casual")) {
                p = new CasualPant();
                p.getStylePants();
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
