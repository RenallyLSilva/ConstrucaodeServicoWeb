package com.exemplo.doisApis.api1;

import com.exemplo.doisApis.api1.Fip;
import com.exemplo.doisApis.api1.FipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FipService {

    private final FipRepository repository;

    public FipService(FipRepository repository) {
        this.repository = repository;
    }

    public List<Fip> listar() {
        return repository.findAll();
    }

    public Fip salvar(Fip fip) {
        return repository.save(fip);
    }

    public Fip atualizar(Long id, Fip fip) {
        fip.setId(id);
        return repository.save(fip);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
