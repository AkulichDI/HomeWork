package ls1;

public final class Account {
    private final String owner;
    private int balance;

    public Account(String owner, int balance) {
        validateOwner(owner);
        validateBalance(balance);
        this.owner = owner.trim();
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        validateAmount(amount);
        balance += amount;
    }

    public void withdraw(int amount) {
        validateAmount(amount);
        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Недостаточно средств: баланс=" + balance + ", сумма=" + amount
            );
        }
        balance -= amount;
    }

    private static void validateOwner(String owner) {
        if (owner == null || owner.isBlank()) {
            throw new IllegalArgumentException("Владелец счёта не должен быть пустым");
        }
    }

    private static void validateBalance(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
    }

    private static void validateAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма операции должна быть больше 0");
        }
    }
}
