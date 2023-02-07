package fr.alaffut.springboot.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.alaffut.springboot.dto.CommerceDto;
import fr.alaffut.springboot.entities.Commerce;
import fr.alaffut.springboot.repositories.CommerceRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CommerceServiceImpl implements CommerceService {
    
    
    @Autowired
    private ModelMapper mapper;
    
    @Autowired
    private CommerceRepository comRepo;


    @Override
    public List<CommerceDto> getAllCommerce(Pageable page) {
        return comRepo.findAll(page).get().map(p -> mapper.map(p, CommerceDto.class)).collect(Collectors.toList());  
    }

    @Override
    public CommerceDto saveOrUpdate(CommerceDto commerce) {
        Commerce tmp=  comRepo.saveAndFlush(mapper.map(commerce, Commerce.class));
        return mapper.map(tmp, CommerceDto.class);
    }

    @Override
    public void deleteCommerce(long id) {
        comRepo.deleteById(id);
    }

    @Override
    public List<CommerceDto> getCommerceByTypeCode(String nom) {
   return  comRepo.findByTypeCode(nom).stream().map(p -> mapper.map(p, CommerceDto.class)).collect(Collectors.toList());
    }

}
