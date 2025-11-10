// 8. Temperature Conversion Tool
class InvalidTemperatureException extends Exception {
  public InvalidTemperatureException(String msg) { super(msg); }
}

class TemperatureConverter {
  public void convert(double temp, char unit) throws InvalidTemperatureException {
      if ((unit == 'C' && temp < -273.15) || (unit == 'F' && temp < -459.67))
          throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");

      if (unit == 'C') {
          double f = (temp * 9 / 5) + 32;
          System.out.println(temp + "°C = " + f + "°F");
      } 
    }
  }

