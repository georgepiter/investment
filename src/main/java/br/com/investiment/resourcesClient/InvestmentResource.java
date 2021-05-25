package br.com.investiment.resourcesClient;

import br.com.investiment.domain.Investment;
import br.com.investiment.repository.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investments")
public class InvestmentResource {

    @Autowired
    private InvestmentRepository investmentRepository;

    @GetMapping
    public List<Investment> listAll(){
        return investmentRepository.findAll();
    }

    @GetMapping("/{code}")
    public Investment searchByCode(@PathVariable Long code){
        return investmentRepository.findById(code).orElse(null);
    }

    @DeleteMapping
    public void toRemove(@PathVariable Long code){
        investmentRepository.deleteById(code);
    }

    @PostMapping
    public Investment register(@RequestBody Investment investment){
        return investmentRepository.save(investment);
    }
}


