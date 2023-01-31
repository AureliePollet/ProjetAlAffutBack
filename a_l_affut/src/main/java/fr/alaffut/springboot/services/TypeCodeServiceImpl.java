package fr.alaffut.springboot.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.alaffut.springboot.dto.TypeCodeDto;
import fr.alaffut.springboot.entities.TypeCode;
import fr.alaffut.springboot.repositories.TypeCodeRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class TypeCodeServiceImpl implements TypeCodeService {


    @Autowired
    private ModelMapper mapper;
    
    @Autowired
    private TypeCodeRepository typeCodeRepo;

    
    @Override
    public List<TypeCodeDto> getAllTypeCode(Pageable page) {
        return typeCodeRepo.findAll(page).get().map(p -> mapper.map(p, TypeCodeDto.class)).collect(Collectors.toList());     
    }
    

    @Override
    public TypeCodeDto saveOrUpdate(TypeCodeDto typeCode) {
        TypeCode tmp=  typeCodeRepo.saveAndFlush(mapper.map(typeCode, TypeCode.class));
        return mapper.map(tmp, TypeCodeDto.class);
    }

    @Override
    public void deleteTypeCode(long id) {
        typeCodeRepo.deleteById(id);
        
    }

}
