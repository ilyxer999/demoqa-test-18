import org.junit.jupiter.api.*;

public class JUnit5Examples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Here is beforeAll");
    }

    @BeforeEach
    void BeforeEach() {
        System.out.println("    Here is BeforeEach");
    }

    @Test
    void firstTest() {
        System.out.println("        Here is firstTest");
    }

    @Test
    void secondTest() {
        System.out.println("        Here is secondTest");
    }

    @AfterEach
    void AfterEach() {
        System.out.println("            Here is AfterEach");
    }

    @AfterAll
    static void AfterAll() {
        System.out.println("Here is AfterAll");
    }
}
