package fr.alaffut.springboot.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.alaffut.springboot.dto.CodePromoDto;
import fr.alaffut.springboot.dto.EvenementDto;
import fr.alaffut.springboot.entities.CodePromo;
import fr.alaffut.springboot.entities.Evenement;
import fr.alaffut.springboot.repositories.CodePromoRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CodePromoServiceImpl implements CodePromoService {

    @Autowired
    private ModelMapper mapper;
    
    @Autowired
    private CodePromoRepository codeRepo;
    
    @Override
    public List<CodePromoDto> getAllCodePromo(Pageable page) {
        return codeRepo.findAll(page).get().map(p -> mapper.map(p, CodePromoDto.class)).collect(Collectors.toList());  
    }

    @Override
    public CodePromoDto saveOrUpdate(CodePromoDto codePromo) {
       CodePromo tmp=  codeRepo.saveAndFlush(mapper.map(codePromo, CodePromo.class));
        return mapper.map(tmp, CodePromoDto.class);
    }

    @Override
    public void deleteCodePromo(long id) {
      codeRepo.deleteById(id);

    }

}
