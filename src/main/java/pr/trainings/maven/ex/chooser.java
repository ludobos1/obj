package pr.trainings.maven.ex;

/**
 * class that chooses which solid we want to calculate and returns values in console.
 */
public class chooser {
  /**
   * method that chooses solid and calculates certain values for it.
   *
   * @param s determines type of solid.
   * @param a 1st dimension of solid
   * @param b 2nd dimension of solid
   * @param c 3rd dimension of solid
   */
  public static void choose(String s, double a, double b, double c) {
    switch (s) {
      case "p":
        System.out.println("Pole: " + BrylyEnum.Bryly.Prostopadloscian.obliczPole(a, b, c));
        System.out.println("Obwod: " + BrylyEnum.Bryly.Prostopadloscian.obliczObwod(a, b, c));
        System.out.println("Objetosc: " + BrylyEnum.Bryly.Prostopadloscian.obliczObjetosc(a, b, c));
        BrylyEnum.Bryly.Prostopadloscian.podajNazwe();
        break;
      case "g":
        System.out.println("Pole: " + BrylyEnum.Bryly.GraniastoslupTrj.obliczPole(a, b, c));
        System.out.println("Obwod: " + BrylyEnum.Bryly.GraniastoslupTrj.obliczObwod(a, b, c));
        System.out.println("Objetosc: " + BrylyEnum.Bryly.GraniastoslupTrj.obliczObjetosc(a, b, c));
        BrylyEnum.Bryly.GraniastoslupTrj.podajNazwe();
        break;
      case "s":
        System.out.println("Pole: " + BrylyEnum.Bryly1.Szescian.obliczPole(a));
        System.out.println("Obwod: " + BrylyEnum.Bryly1.Szescian.obliczObwod(a));
        System.out.println("Objetosc: " + BrylyEnum.Bryly1.Szescian.obliczObjetosc(a));
        BrylyEnum.Bryly1.Szescian.podajNazwe();
        break;
      case "c":
        System.out.println("Pole: " + BrylyEnum.Bryly1.CzworoscianFor.obliczPole(a));
        System.out.println("Obwod: " + BrylyEnum.Bryly1.CzworoscianFor.obliczObwod(a));
        System.out.println("Objetosc: " + BrylyEnum.Bryly1.CzworoscianFor.obliczObjetosc(a));
        BrylyEnum.Bryly1.CzworoscianFor.podajNazwe();
        break;
      default:
        System.out.println("Zła litera. Podaj dane w formacie: <nazwa bryly(p-prostopadloscian, g-graniastoslup trojkatny, s-szescian, c-czworoscian foremny)> <granica podstawy> <granica boczna> <druga granica podstawy(wysokosc podstawy)>");
    }
  }
}
