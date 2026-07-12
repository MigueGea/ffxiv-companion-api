package com.miguegea.ffxivcompanion.character.infrastructure.adapter.out.xivapi;

import com.miguegea.ffxivcompanion.character.domain.model.CharacterSearchResult;
import com.miguegea.ffxivcompanion.character.domain.port.out.CharacterSearchPort;
import com.miguegea.ffxivcompanion.character.domain.model.Character;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class XivApiCharacterSearchAdapter implements CharacterSearchPort {

    @Override
    public CharacterSearchResult search(String characterName) {
        return new CharacterSearchResult(
            List.of(
                new Character(1L, "Test Character", "Phoenix")
            ),
            1,
            1,
            1
        );
    }
}
