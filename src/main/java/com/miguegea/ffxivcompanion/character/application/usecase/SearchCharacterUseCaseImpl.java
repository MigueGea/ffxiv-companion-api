package com.miguegea.ffxivcompanion.character.application.usecase;

import com.miguegea.ffxivcompanion.character.application.usecase.port.in.SearchCharacterUseCase;
import com.miguegea.ffxivcompanion.character.domain.model.CharacterSearchResult;
import com.miguegea.ffxivcompanion.character.domain.port.out.CharacterSearchPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchCharacterUseCaseImpl implements SearchCharacterUseCase {

    private final CharacterSearchPort characterSearchPort;

    @Override
    public CharacterSearchResult search(String name) {
        return characterSearchPort.search(name);
    }
}
