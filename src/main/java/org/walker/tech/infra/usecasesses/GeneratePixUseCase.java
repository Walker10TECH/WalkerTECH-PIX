package org.walker.tech.infra.usecasesses;

import org.walker.tech.domain.dto.PixDto;
import org.walker.tech.domain.entities.PixBo;
import org.walker.tech.domain.mappers.PixMapper;
import org.walker.tech.domain.repositories.IPixDbRepository;
import org.walker.tech.domain.repositories.IPixRepository;

public class GeneratePixUseCase {
    private final IPixRepository repository;
    private final IPixDbRepository dbRepository;

    public GeneratePixUseCase(IPixRepository repository, IPixDbRepository dbRepository) {
        this.repository = repository;
        this.dbRepository = dbRepository;
    }

    public PixDto generate(PixDto pixQrCodeDTO) {
        PixDto createdPix = repository.generate(pixQrCodeDTO);
        if (createdPix != null) {
            PixBo bo = PixMapper.toBO(createdPix);
            dbRepository.persist(bo);
        }

        return createdPix;
    }
}
