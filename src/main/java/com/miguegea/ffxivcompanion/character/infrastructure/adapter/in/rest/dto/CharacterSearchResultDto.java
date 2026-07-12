package com.miguegea.ffxivcompanion.character.infrastructure.adapter.in.rest.dto;

import java.util.List;

public record CharacterSearchResultDto(
    List<CharacterDto> characters,
    int page,
    int pageSize,
    int total
) {}
