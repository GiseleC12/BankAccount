import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {

    @Test
    void canGetFirstName(){
        // Given
        BankAccount bankAccount = new BankAccount("Gisele", "Aisaeva", LocalDate.of(1994, 6, 8), 1234567);
        //When
        String result = bankAccount.getFirstName();
        //Then
        String expected = "Gisele";
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void canGetLastName(){
        // Given
        BankAccount bankAccount = new BankAccount("Gisele", "Aisaeva", LocalDate.of(1994, 6, 8), 1234567);
        //When
        String result = bankAccount.getLastName();
        //Then
        String expected = "Aisaeva";
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void canDateOfBirth(){
        // Given
        BankAccount bankAccount = new BankAccount("Gisele", "Aisaeva", LocalDate.of(1994, 6, 8), 1234567);
        //When
        LocalDate result = bankAccount.getDateOfBirth();
        //Then
        LocalDate expected = LocalDate.of(1994, 6, 8);
        assertThat(result).isEqualTo(expected);
    }


    @Test
    void canAccountNumber(){
        // Given
        BankAccount bankAccount = new BankAccount("Gisele", "Aisaeva", LocalDate.of(1994, 6, 8), 1234567);
        //When
        int result = bankAccount.getAccountNumber();
        //Then
        int expected =1234567;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void canSetFirstName(){
        BankAccount bankAccount = new BankAccount("Gisele", "Aisaeva", LocalDate.of(1994, 6, 8), 1234567);
        bankAccount.setFirstName("Angelina");
        String firstName = bankAccount.getFirstName();
        assertThat(firstName).isEqualTo("Angelina");
    }
    @Test
    void canSetLastName() {
        BankAccount bankAccount = new BankAccount("Gisele", "Aisaeva", LocalDate.of(1994, 6, 8), 1234567);
        bankAccount.setLastName("Pattinson");
        String lastName = bankAccount.getLastName();
        assertThat(lastName ).isEqualTo("Pattinson");
    }
    @Test
    void canSetDateOfBirth() {
        BankAccount bankAccount = new BankAccount("Gisele", "Aisaeva", LocalDate.of(1994, 6, 8), 1234567);
        bankAccount.setDateOfBirth(LocalDate.of(2023,6, 8 ));
        LocalDate result= bankAccount.getDateOfBirth();
        LocalDate expected = LocalDate.of(2023, 6, 8);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void canSetAccountNumber() {
        BankAccount bankAccount = new BankAccount("Gisele", "Aisaeva", LocalDate.of(1994, 6, 8), 1234567);
        bankAccount.setAccountNumber(987654321);
        int AccountNumber = bankAccount.getAccountNumber();
        assertThat(AccountNumber).isEqualTo(987654321);
    }

}
