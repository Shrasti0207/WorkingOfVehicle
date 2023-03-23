import org.scalatest.funsuite.AnyFunSuite
class workingOfVehicleTest extends AnyFunSuite {
  test(" Test for car fuel capacity") {
    val car = vehicle(50)
    assert(car.move() == 30)            //50-20=30
    assert(car.move() == 10)             // 30-20=10
  }

  test(" Test for car refill the fuel") {
    val car = vehicle(10)                   // refill the fuel in the vehicle
    assert(car.reFillFuel() == 40)
  }
}
