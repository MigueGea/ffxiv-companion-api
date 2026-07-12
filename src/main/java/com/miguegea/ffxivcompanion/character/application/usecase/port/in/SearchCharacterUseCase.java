package com.miguegea.ffxivcompanion.character.application.usecase.port.in;

import com.miguegea.ffxivcompanion.character.domain.model.CharacterSearchResult;

public interface SearchCharacterUseCase {

    CharacterSearchResult search(String characterName);
}
