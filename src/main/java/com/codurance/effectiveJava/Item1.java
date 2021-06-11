package com.codurance.effectiveJava;
import java.math.BigInteger;
import java.util.Set;

// Item 1: Consider Static Factory Methods instead of constructors
// Traditional = public constructor
// Another technique = static factory method
public class Item1 {

  private static final Rank JACK = new Rank("jack");
  private static final Rank QUEEN = new Rank("queen");
  private static final Rank KING = new Rank("king");

  // simple example from Boolean (boxed primitive for boolean)
  // Translates boolean primitive to Boolean Object
  public static Boolean valueOf(boolean b) {
    return b ? Boolean.TRUE : Boolean.FALSE;
  }


//  /**
//   * Returns a {@code Boolean} instance representing the specified
//   * {@code boolean} value.  If the specified {@code boolean} value
//   * is {@code true}, this method returns {@code Boolean.TRUE};
//   * if it is {@code false}, this method returns {@code Boolean.FALSE}.
//   * If a new {@code Boolean} instance is not required, this method
//   * should generally be used in preference to the constructor
//   * {@link #Boolean(boolean)}, as this method is likely to yield
//   * significantly better space and time performance.
//   *
//   * @param  b a boolean value.
//   * @return a {@code Boolean} instance representing {@code b}.
//   * @since  1.4
//   */
//  @HotSpotIntrinsicCandidate
//  public static Boolean valueOf(boolean b) {
//    return (b ? TRUE : FALSE);
//  }


  // other examples
  public static void main(String[] args) {
    Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);

    BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
  }

}
