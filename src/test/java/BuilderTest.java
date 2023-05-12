import builder.builders.CarBuilder;
import builder.cars.Car;
import builder.cars.CarType;
import builder.director.Director;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class BuilderTest {

    @Test
    public void testBuilder() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        assertEquals(CarType.SPORTS_CAR, car.getCarType());
        assertEquals(3.0, car.getEngine().getVolume(), 0.1);
        assertEquals(2, car.getSeats());
    }

    @Test
    public void testDirectorWithSUVBuilder() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSUV(builder);
        Car car = builder.getResult();
        assertEquals(CarType.SUV, car.getCarType());
        assertEquals(2.5, car.getEngine().getVolume(), 0.1);
        assertEquals(4, car.getSeats());
    }

    @Test
    public void testDirectorWithCityCarBuilder() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);
        Car car = builder.getResult();
        assertEquals(CarType.CITY_CAR, car.getCarType());
        assertEquals(1.2, car.getEngine().getVolume(), 0.1);
        assertEquals(2, car.getSeats());
    }
}