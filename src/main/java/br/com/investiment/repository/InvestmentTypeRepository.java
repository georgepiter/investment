package br.com.investiment.repository;

import br.com.investiment.domain.InvestmentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentTypeRepository extends JpaRepository<InvestmentType, Long> {

}
