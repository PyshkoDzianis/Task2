package by.pyshkodzianis.xmlxsdparsing.entity.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement(name = "AbstractAccount")
   @XmlAccessorType(XmlAccessType.FIELD)

public abstract class AbstractAccount {


    private String account_id;
    private String account_depositor;
    private String account_profitability;
    private String account_time_constrains;
    private String account_country;
    private AccountType accountType;

    protected AbstractAccount() {
    }

    public AbstractAccount(String account_id, String account_depositor, String account_profitability,
                           String account_time_constrains, String account_country, AccountType accountType) {

        this.account_id = account_id;
        this.account_depositor = account_depositor;
        this.account_profitability = account_profitability;
        this.account_time_constrains = account_time_constrains;
        this.account_country = account_country;
        this.accountType = accountType;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getAccount_depositor() {
        return account_depositor;
    }

    public void setAccount_depositor(String account_depositor) {
        this.account_depositor = account_depositor;
    }

    public String getAccount_profitability() {
        return account_profitability;
    }

    public void setAccount_profitability(String account_profitability) {
        this.account_profitability = account_profitability;
    }

    public String getAccount_time_constrains() {
        return account_time_constrains;
    }

    public void setAccount_time_constrains(String account_time_constrains) {
        this.account_time_constrains = account_time_constrains;
    }

    public String getAccount_country() {
        return account_country;
    }

    public void setAccount_country(String account_country) {
        this.account_country = account_country;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractAccount)) return false;
        AbstractAccount that = (AbstractAccount) o;
        return Objects.equals(getAccount_id(), that.getAccount_id()) && Objects.equals(getAccount_depositor(),
                that.getAccount_depositor()) && Objects.equals(getAccount_profitability(),
                that.getAccount_profitability()) && Objects.equals(getAccount_time_constrains(),
                that.getAccount_time_constrains()) && Objects.equals(getAccount_country(),
                that.getAccount_country()) && getAccountType() == that.getAccountType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccount_id(),
                getAccount_depositor(),
                getAccount_profitability(),
                getAccount_time_constrains(),
                getAccount_country(),
                getAccountType());
    }

    @Override
    public String toString() {
        return "AbstractAccount{" +
                "account_id='" + account_id + '\'' +
                ", account_depositor='" + account_depositor + '\'' +
                ", account_profitability='" + account_profitability + '\'' +
                ", account_time_constrains='" + account_time_constrains + '\'' +
                ", account_country='" + account_country + '\'' +
                ", accountType=" + accountType +
                '}';
    }
}
