package kai_yakovchuk.spring_db.service;

import java.util.List;

import kai_yakovchuk.spring_db.entity.Laptop;

public interface LaptopService {
    List<Laptop> findAll();
}