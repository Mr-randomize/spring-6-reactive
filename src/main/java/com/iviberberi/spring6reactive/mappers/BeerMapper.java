package com.iviberberi.spring6reactive.mappers;


import com.iviberberi.spring6reactive.domain.Beer;
import com.iviberberi.spring6reactive.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
