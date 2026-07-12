package com.miguegea.ffxivcompanion.character.domain.port.out;

import com.miguegea.ffxivcompanion.character.domain.model.CharacterSearchResult;

public interface CharacterSearchPort {

    CharacterSearchResult search(String characterName);
}
