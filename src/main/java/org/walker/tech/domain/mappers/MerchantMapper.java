package org.walker.tech.domain.mappers;

import org.walker.tech.domain.dto.MerchantDto;
import org.walker.tech.domain.entities.MerchantBo;

public class MerchantMapper {
    public static MerchantDto toDTO(MerchantBo bo) {
        if (bo == null) {
            return null;
        }

        MerchantDto merchantDto = new MerchantDto();
        merchantDto.setName(bo.getName());
        merchantDto.setPostalCode(bo.getPostalCode());
        merchantDto.setCity(bo.getCity());

        return merchantDto;
    }

    public static MerchantBo toDomain(MerchantDto dto) {
        if (dto == null) {
            return null;
        }

        MerchantBo merchantBo = new MerchantBo();
        merchantBo.setName(dto.getName());
        merchantBo.setPostalCode(dto.getPostalCode());
        merchantBo.setCity(dto.getCity());

        return merchantBo;
    }
}
