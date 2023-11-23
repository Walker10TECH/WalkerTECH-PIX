package org.walker.tech.infra.panache;

import org.walker.tech.domain.dto.PixDto;
import org.walker.tech.domain.entities.PixBo;
import org.walker.tech.domain.repositories.IPixDbRepository;
import org.walker.tech.infra.panache.mapper.PanachePixMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PanacheDbRepository implements IPixDbRepository {

    @Override
    @Transactional
    public PixBo persist(PixBo bo) {
        PanachePix pix = PanachePixMapper.toEntity(bo);
        pix.persistAndFlush();
        return PanachePixMapper.toDomain(pix);
    }

    public void persist(PixDto generatedPix) {
    }
}
