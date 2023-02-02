package fr.alaffut.springboot.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.alaffut.springboot.dto.EtudiantDto;
import fr.alaffut.springboot.entities.Etudiant;
import fr.alaffut.springboot.repositories.EtudiantRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class EtudiantServiceImpl implements EtudiantService {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	EtudiantRepository etudRepo;

	@Override
	public List<EtudiantDto> getAllEtudiant(Pageable page) {
		return etudRepo.findAll(page).get().map(p -> mapper.map(p, EtudiantDto.class)).collect(Collectors.toList());

	}

	@Override
	public EtudiantDto saverOrUpdate(EtudiantDto etudiant) {
		Etudiant etud = etudRepo.saveAndFlush(mapper.map(etudiant, Etudiant.class));
		return mapper.map(etud, EtudiantDto.class);
	}

	@Override
	public void deleteEtudiant(long id) {
		etudRepo.deleteById(id);
	}

}
