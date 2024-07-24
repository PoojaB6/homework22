package delivery.dto;
public class DecisionDto {

    int income;
    int debt;
    boolean employee;
    int loanAmount;
    int loanPeriod;
    int age;

    public DecisionDto(int income, int debt, boolean employee, int loanAmount, int loanPeriod,int age) {
        this.income = income;
        this.debt = debt;
        this.employee = employee;
        this.loanAmount = loanAmount;
        this.loanPeriod = loanPeriod;
        this.age    = age;
    }
}
