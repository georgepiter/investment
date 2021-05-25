package br.com.investiment.repository;

import br.com.investiment.domain.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {

}
