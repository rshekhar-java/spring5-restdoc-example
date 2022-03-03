package com.rs.springframework.web.mappers;

import com.rs.springframework.domain.Beer;
import com.rs.springframework.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * created by rs 3/2/2022.
 */
@Mapper(uses={DateMapper.class},componentModel = "spring")
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto dto);
}
