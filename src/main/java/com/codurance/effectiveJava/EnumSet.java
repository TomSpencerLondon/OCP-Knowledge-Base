package com.codurance.effectiveJava;

import java.util.Set;

public class EnumSet {
  public static Set<Rank> of(Rank... ranks){
    Rank[] ranksList = ranks;
    return Set.of(ranksList);
  }
}
