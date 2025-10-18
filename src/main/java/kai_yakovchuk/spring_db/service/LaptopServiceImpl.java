package kai_yakovchuk.spring_db.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kai_yakovchuk.spring_db.entity.Laptop;
import kai_yakovchuk.spring_db.repository.LaptopRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LaptopServiceImpl implements LaptopService {

    private final LaptopRepository laptopRepository;

    @Override
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }
}