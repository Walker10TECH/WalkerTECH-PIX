package org.walker.tech.domain.repositories;

import org.walker.tech.domain.entities.PixBo;

public interface IPixDbRepository {
    PixBo persist(PixBo bo);
}
