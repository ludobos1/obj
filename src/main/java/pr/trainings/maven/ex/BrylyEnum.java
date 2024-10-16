package pr.trainings.maven.ex;

interface bryla3 {
  double obliczPole(double a, double b, double c);

  double obliczObwod(double a, double b, double c);

  double obliczObjetosc(double a, double b, double c);

  void podajNazwe();
}

interface bryla1 {
  double obliczPole(double a);

  double obliczObwod(double a);

  double obliczObjetosc(double a);

  void podajNazwe();
}


/**
 * A class that contains enum representations of different three-dimensional
 * solids and one-dimensional solids with methods to calculate their properties.
 */
public class BrylyEnum {
  /**
   * Enum representing various three-dimensional solids (bryła).
   * Implements the {@link bryla3} interface.
   */
  public enum Bryly implements bryla3 {
    Prostopadloscian {
      public double obliczPole(double a, double b, double c) {
        return a * b * 2 + b * c * 2 + a * c * 2;
      }

      public double obliczObwod(double a, double b, double c) {
        return a * 4 + b * 4 + c * 4;
      }

      public double obliczObjetosc(double a, double b, double c) {
        return a * b * c;
      }

      public void podajNazwe() {
        System.out.println("prostopadloscian");
      }
    },
    GraniastoslupTrj {
      public double obliczPole(double a, double b, double c) {
        return a * b * 3 + a * c;
      }

      public double obliczObwod(double a, double b, double c) {
        return a * 6 + b * 3;
      }

      public double obliczObjetosc(double a, double b, double c) {
        return a * c / 2 * b;
      }

      public void podajNazwe() {
        System.out.println("graniastoslup trojkatny");
      }
    }
  }

  /**
   * Enum representing various one-dimensional solids (bryła).
   * Implements the {@link bryla1} interface.
   */
  public enum Bryly1 implements bryla1 {
    Szescian {
      public double obliczPole(double a) {
        return a * a * 6;
      }

      public double obliczObwod(double a) {
        return a * 12;
      }

      public double obliczObjetosc(double a) {
        return a * a * a;
      }

      public void podajNazwe() {
        System.out.println("szescian");
      }
    },
    CzworoscianFor {
      public double obliczPole(double a) {
        return a * a * Math.sqrt(3);
      }

      public double obliczObwod(double a) {
        return a * 6;
      }

      public double obliczObjetosc(double a) {
        return a * a * a * Math.sqrt(2) / 12;
      }

      public void podajNazwe() {
        System.out.println("czworoscian foremny");
      }
    };
  }
}
