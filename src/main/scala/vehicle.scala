case class vehicle(var currentFuel: Int) {
  private val fuelCapacity = 50
// move method is used to move the vehicle and reduce the fuel from the car
  def move(): Int = {
      if (currentFuel >= 20 ) {
        currentFuel = currentFuel - 20
        currentFuel
      }
      else {
        reFillFuel()
        currentFuel = currentFuel - 20
        currentFuel
      }
  }
  // refillfuel method is used to refill the fuel in the vehicle when fuel is less than 20ltrs
  def reFillFuel(): Int = {
    currentFuel = fuelCapacity - currentFuel
    currentFuel
  }
}


