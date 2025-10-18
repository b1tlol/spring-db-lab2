package kai_yakovchuk.spring_db.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kai_yakovchuk.spring_db.entity.Laptop;
import kai_yakovchuk.spring_db.service.LaptopService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LaptopController {

    private final LaptopService laptopService;

    @GetMapping("/laptops")
    public @ResponseBody List<Laptop> getAllLaptops() {
        return laptopService.findAll();
    }
}