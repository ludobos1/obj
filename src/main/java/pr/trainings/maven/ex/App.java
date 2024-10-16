package pr.trainings.maven.ex;

class LiczbaUjemna extends Exception {
  public LiczbaUjemna() {
  }
}

class ZaMaloDanych extends Exception {
  public ZaMaloDanych() {
  }
}

/**
 * Test class for application.
 */
public class App {
  /**
   * Main method that processes command-line arguments for creating different geometric solids.
   *
   * @param args command-line arguments representing type of solid and its dimensions
   */
  public static void main(String[] args) {
    try {
      if (args.length < 2) {
        throw new ZaMaloDanych();
      }
      for (int i = 1; i < args.length; i++) {
        if (Double.parseDouble(args[i]) <= 0) {
          throw new LiczbaUjemna();
        }
      }
      if (args.length == 2) {
        chooser.choose(args[0], Double.parseDouble(args[1]), 0, 0);
      } else if (args.length >= 4) {
        chooser.choose(args[0], Double.parseDouble(args[1]), Double.parseDouble(args[2]), Double.parseDouble(args[3]));
      } else {
        throw new NumberFormatException();
      }

    } catch (NumberFormatException e) {
      System.out.println("Nieprawidłowa dana. Podaj dane w formacie: <nazwa bryly(p-prostopadloscian, g-graniastoslup trojkatny, s-szescian, c-czworoscian foremny)> <granica podstawy> <granica boczna> <druga granica podstawy(wysokosc podstawy)>");
    } catch (ZaMaloDanych e) {
      System.out.println("Za malo danych. Podaj dane w formacie: <nazwa bryly(p-prostopadloscian, g-graniastoslup trojkatny, s-szescian, c-czworoscian foremny)> <granica podstawy> <granica boczna> <druga granica podstawy(wysokosc podstawy)>");
    } catch (LiczbaUjemna e) {
      System.out.println("wymiar nie moze byc ujemny");
    }
  }
}
