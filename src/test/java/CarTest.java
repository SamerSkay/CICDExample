import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.samer.Car;
public class CarTest {

    // Test prop
    Car car;
    @BeforeEach
    void setUp() {
        car = new Car(0, "gröna");
    }

    @Test
    void BilStop() {
        Assertions.assertEquals(car.getVelocity(), 0);
    }

    @Test
    void BilAccelerar() {
        car.Accelarate(10);
        Assertions.assertEquals(car.getVelocity(), 10);

        car.Accelarate(10);
        Assertions.assertEquals(car.getVelocity(), 20);

        car.Accelarate(10);
        Assertions.assertEquals(car.getVelocity(), 30);
    }

    @Test
    void BilenSaktarNer() {
        car.setVelocity(50);

        car.Accelarate(-20);
        Assertions.assertEquals(car.getVelocity(), 30);

        car.Accelarate(-40);
        Assertions.assertEquals(car.getVelocity(), -10);
    }
}
