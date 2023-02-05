package fr.alaffut.springboot.services;


import fr.alaffut.springboot.dto.EvenementDto;
import fr.alaffut.springboot.entities.Etudiant;
import fr.alaffut.springboot.entities.Evenement;
import fr.alaffut.springboot.repositories.EtudiantRepository;
import fr.alaffut.springboot.repositories.EvenementRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class EvenementServiceImpl implements EvenementService {


    @Autowired
    private ModelMapper mapper;

    @Autowired
    private EvenementRepository eventRepo;

    @Autowired
    private EtudiantRepository etudRepo;

    @Autowired
    private EmailService emailService;

    @Override
    public List<EvenementDto> getAllEvents(Pageable page) {
        return eventRepo.findAll(page).get().map(p -> mapper.map(p, EvenementDto.class)).collect(Collectors.toList());

    }

    @Override
    public EvenementDto saveOrUpdate(EvenementDto evenement) {
        Evenement tmp = eventRepo.saveAndFlush(mapper.map(evenement, Evenement.class));
        return mapper.map(tmp, EvenementDto.class);
    }

    @Override
    public void deleteEvent(long id) {
        eventRepo.deleteById(id);
    }

    @Override
    public EvenementDto ajoutEtudiantEvement(long idEv, long idEt) throws Exception {
        Etudiant etudiant = etudRepo.findById(idEt).get();
        Optional<Evenement> evtOpt = eventRepo.findById(idEv);
        if (evtOpt.isEmpty()) {
            throw new Exception();
        }
        Evenement evt = evtOpt.get();
        if (evt.getNbPlaces() > 0) {

            int nbPlace = evt.getNbPlaces();
            evt.setNbPlaces(--nbPlace);

            evt.getEtudiants().add(etudiant);
            etudiant.getEvenements().add(evt);
            etudRepo.saveAndFlush(etudiant);
        }

        eventRepo.saveAndFlush(evt);
        emailService.sendValidationEmail(etudiant.getEmail());
        return mapper.map(evt, EvenementDto.class);
    }

    @Override
    public List<EvenementDto> getEventsByDate(int date) {
        return eventRepo.trouverEvenementParDate(date).stream().map(p -> mapper.map(p, EvenementDto.class)).collect(Collectors.toList());
    }

}
