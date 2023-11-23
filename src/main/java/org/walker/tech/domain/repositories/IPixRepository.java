package org.walker.tech.domain.repositories;

import org.walker.tech.domain.dto.PixDto;

public interface IPixRepository {
    PixDto generate(PixDto dto);
}
