package com.valchevgd.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    UUID id;
    Integer version;
    OffsetDateTime createdDate;
    OffsetDateTime lastModifiedDate;
    String name;
    BeerStyle beerStyle;
    Long upc;
    BigDecimal price;
    Integer quantityInHand;
}
