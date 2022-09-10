public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }


    public String deposit(Double sum) {
        amount += sum;
        return "Вы пополнили ваш счет на " + sum;
    }

    public String withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Ошибка. Запрашиваемая " +
                    "сумма больше чем остаток. Остаткок: " + amount, amount);
        }
        amount = amount - sum;
        return "Успешно. Вы сняли 6000. осталось: " + amount;
    }


}
