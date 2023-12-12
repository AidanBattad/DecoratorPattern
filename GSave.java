public class GSave implements BankAccountDecorator, BankAccount
{
    private BankAccount bankAccount;
    @Override
    public void setBankAccount(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
    }
    @Override
    public String showAccountType()
    {
        return "GSave Account";
    }
    @Override
    public Double getInterestRate()
    {
        return bankAccount.getInterestRate() + 0.015;
    }
    @Override
    public Double getBalance()
    {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits()
    {
        return bankAccount.showBenefits() + ", GCash transfer";
    }

    @Override
    public Double computeBalanceWithInterest()
    {
        return bankAccount.computeBalanceWithInterest();
    }

    @Override
    public String showInfo()
    {
        return bankAccount.showInfo();
    }
}
