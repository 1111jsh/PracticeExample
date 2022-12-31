package OOPAdvanced2GoodMorning.person;

public class Bus {
     Person[] passengers = new Person[0];


     public void board(Person person) {
         Person[] newPassengers = new Person[passengers.length + 1];

         System.arraycopy(passengers, 0, newPassengers, 0, passengers.length);

         newPassengers[newPassengers.length - 1] = person;

         passengers = newPassengers;
     }

     public void printSeats() {
         System.out.println("==탑승자 명단==");
         for (Person person : passengers) {
             System.out.println(person);
         }
     }

     public void test(Hyodoable hyodoable) {
         hyodoable.hyodo();
     }
}
