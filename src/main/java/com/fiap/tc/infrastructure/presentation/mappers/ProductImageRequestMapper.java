package com.fiap.tc.infrastructure.presentation.mappers;

import com.fiap.tc.infrastructure.gateways.mappers.base.MapperEntity;
import com.fiap.tc.infrastructure.presentation.requests.ProductImageRequest;
import com.fiap.tc.domain.entities.ProductImage;
import org.mapstruct.Mapper;

@Mapper
public interface ProductImageRequestMapper extends MapperEntity<ProductImage, ProductImageRequest> {

    @Override
    ProductImageRequest fromEntity(ProductImage productImage);

    @Override
    ProductImage toEntity(ProductImageRequest request);

}


