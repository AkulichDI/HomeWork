package ls1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void testDeposit () {
        var a = new Account("Oleg", 20000);
        int bal = a.getBalance();
        int deposit = 100;
        a.deposit(deposit);
        int result = bal + deposit;
        assertEquals(result, a.getBalance());

    }
    @Test
    void testWithdraw(){
        var a = new Account("Oleg", 20000);
        int bal = a.getBalance();
        int withdraw = 100;
        a.withdraw(withdraw);
        int result = bal - withdraw;
        assertEquals(result, a.getBalance());
    }

    @Test
    void testWithdrawAssertThrows(){
        var a = new Account("Oleg", 20);
        int withdraw = 100;
        assertThrows(IllegalArgumentException.class,() -> a.withdraw(withdraw));
    }


}