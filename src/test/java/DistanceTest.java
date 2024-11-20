import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DistanceTest {

    @Test
    void chebyshevDistance() {
        long[] point1 = {3, 5};
        long[] point2 = {6, 1};
        long expected = 4; // Max(|6-3|, |1-5|) = 4
        long result = Distance.chebyshevDistance(point1, point2);
        assertEquals(expected, result, "Chebyshev distance calculation failed");
    }

    @Test
    void squaredDistance() {
        double x1 = 1.0, y1 = 2.0, x2 = 4.0, y2 = 6.0;
        double expected = 25.0; // (4-1)^2 + (6-2)^2 = 25
        double result = Distance.squaredDistance(x1, y1, x2, y2);
        assertEquals(expected, result, 0.001, "Squared distance calculation failed");
    }

    @Test
    void euclideanDistance() {
        double x1 = 0.0, y1 = 0.0, x2 = 3.0, y2 = 4.0;
        double expected = 5.0; // sqrt((3-0)^2 + (4-0)^2) = 5
        double result = Distance.euclideanDistance(x1, y1, x2, y2);
        assertEquals(expected, result, 0.001, "Euclidean distance calculation failed");
    }
}