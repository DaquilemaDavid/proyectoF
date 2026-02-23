package com.utc.proyectoF.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.utc.proyectoF.entity.Cargo;
import com.utc.proyectoF.repository.CargoRepository;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repository;

    // Obtener todos los cargos
    public List<Cargo> listar() {
        return repository.findAll();
    }

    // Buscar un cargo por su ID
    public Cargo buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    // Guardar o actualizar un cargo
    public Cargo guardar(Cargo cargo) {
        return repository.save(cargo);
    }

    // Eliminar un cargo
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}