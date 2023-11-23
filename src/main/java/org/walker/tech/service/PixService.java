package org.walker.tech.service;

import org.walker.tech.domain.dto.PixDto;
import org.walker.tech.infra.celcoin.repositories.PixCelcoinRepository;
import org.walker.tech.infra.panache.PanacheDbRepository;
import org.walker.tech.infra.usecasesses.GeneratePixUseCase;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PixService {

    private final PanacheDbRepository panacheDbRepository;
    private final GeneratePixUseCase generatePixUseCase;

    @Inject
    public PixService(PixCelcoinRepository pixCelcoinRepository, PanacheDbRepository panacheDbRepository, GeneratePixUseCase generatePixUseCase) {
        this.panacheDbRepository = panacheDbRepository;
        this.generatePixUseCase = generatePixUseCase;
    }

    public PixDto generatePix(PixDto dto) {
        PixDto generatedPix = generatePixUseCase.generate(dto);

        if (generatedPix != null) {
            panacheDbRepository.persist(generatedPix);
        }

        return generatedPix;
    }
}
