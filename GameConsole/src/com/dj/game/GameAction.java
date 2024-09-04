package com.dj.game;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {

}
