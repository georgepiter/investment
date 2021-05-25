package br.com.investiment.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String CodAtivo;
    private Double ValueQuota;
    private Integer NumberOfShare;
    private LocalDate PurchaseDate;

    @ManyToOne
    @JoinColumn(name = "fk_code_InvestmentType")
    private InvestmentType investmentType;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getCodAtivo() {
        return CodAtivo;
    }

    public void setCodAtivo(String codAtivo) {
        CodAtivo = codAtivo;
    }

    public Double getValueQuota() {
        return ValueQuota;
    }

    public void setValueQuota(Double valueQuota) {
        ValueQuota = valueQuota;
    }

    public Integer getNumberOfShare() {
        return NumberOfShare;
    }

    public void setNumberOfShare(Integer numberOfShare) {
        NumberOfShare = numberOfShare;
    }

    public LocalDate getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        PurchaseDate = purchaseDate;
    }

    public InvestmentType getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(InvestmentType investmentType) {
        this.investmentType = investmentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Investment that = (Investment) o;
        return code.equals(that.code)
                && CodAtivo.equals(that.CodAtivo)
                && ValueQuota.equals(that.ValueQuota)
                && NumberOfShare.equals(that.NumberOfShare)
                && PurchaseDate.equals(that.PurchaseDate)
                && investmentType.equals(that.investmentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, CodAtivo, ValueQuota, NumberOfShare, PurchaseDate, investmentType);
    }
}
