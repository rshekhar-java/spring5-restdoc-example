package com.rs.springframework.web.mapper;

import com.rs.springframework.domain.Beer;
import com.rs.springframework.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * created by rs 3/2/2022.
 */
@Mapper(uses={DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto dto);
}
