package com.miguegea.ffxivcompanion.character.domain.model;

import java.util.Objects;

public record Character(
    long id,
    String name,
    String world
) {

    public Character {
        Objects.requireNonNull(name, "name must not be null");
    }

}
