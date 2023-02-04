package fr.alaffut.springboot.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.alaffut.springboot.dto.AdministrateurDto;
import fr.alaffut.springboot.entities.Administrateur;
import fr.alaffut.springboot.repositories.AdministrateurRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdministrateurServiceImpl implements AdministrateurService {
    
    @Autowired
    private ModelMapper mapper;
    
    @Autowired
    private AdministrateurRepository repo;
    

    @Override
    public List<AdministrateurDto> getAllAdministrateur(Pageable page) {
        return repo.findAll(page).get().map(p -> mapper.map(p, AdministrateurDto.class)).collect(Collectors.toList());     
    }

    @Override
    public AdministrateurDto saveOrUpdate(AdministrateurDto administrateur) {
       Administrateur tmp=  repo.saveAndFlush(mapper.map(administrateur, Administrateur.class));
        return mapper.map(tmp, AdministrateurDto.class);
    }

    @Override
    public void deleteAdministrateur(long id) {
      repo.deleteById(id);
    }

}
