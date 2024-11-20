import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DivisionTest {

    @Test
    void division() {
        int a = 10, b = 2;
        long expected = 5;
        long result = Division.division(a, b);
        assertEquals(expected, result, "Simple division failed");
    }

    @Test
    void divisionUsingLoop() {
        int a = 10, b = 2;
        long expected = 5;
        long result = Division.divisionUsingLoop(a, b);
        assertEquals(expected, result, "Division using loop failed");
    }

    @Test
    void divisionUsingRecursion() {
        int a = 10, b = 2;
        long expected = 5;
        long result = Division.divisionUsingRecursion(a, b);
        assertEquals(expected, result, "Division using recursion failed");
    }

    @Test
    void divisionUsingMultiplication() {
        int a = 10, b = 2;
        long expected = 5;
        long result = Division.divisionUsingMultiplication(a, b);
        assertEquals(expected, result, "Division using multiplication failed");
    }

    @Test
    void divisionUsingShift() {
        int a = 16, b = 4;
        long expected = 4;
        long result = Division.divisionUsingShift(a, b);
        assertEquals(expected, result, "Division using bitwise shift failed");
    }

    @Test
    void divisionUsingLogs() {
        int a = 10, b = 2;
        long expected = 5;
        long result = Division.divisionUsingLogs(a, b);
        assertEquals(expected, result, "Division using logs failed");
    }
}