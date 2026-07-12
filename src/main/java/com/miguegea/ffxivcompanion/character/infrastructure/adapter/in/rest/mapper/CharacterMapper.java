package com.miguegea.ffxivcompanion.character.infrastructure.adapter.in.rest.mapper;

import com.miguegea.ffxivcompanion.character.domain.model.CharacterSearchResult;
import com.miguegea.ffxivcompanion.character.infrastructure.adapter.in.rest.dto.CharacterDto;
import com.miguegea.ffxivcompanion.character.infrastructure.adapter.in.rest.dto.CharacterSearchResultDto;
import com.miguegea.ffxivcompanion.character.domain.model.Character;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CharacterMapper {

    CharacterDto toDto(Character character);
    CharacterSearchResultDto toDto(CharacterSearchResult result);
}
