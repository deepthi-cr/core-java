class ClockRunner {

static {
        System.out.println(" static block in runner class");
    }

  public static void main(String[] args){

Clock clock = new Clock();
clock .setName("wallclock");
System.out.println(clock.getName());

clock.setCost(1000);
System.out.println(clock.getCost());

clock.setMinutes(10);
System.out.println(clock.getMinutes());

clock.setSecond(5);
System.out.println(clock.getSecond());

clock.setHours(6);
System.out.println(clock.getHours());

clock .setName("digetalclock");
System.out.println(clock.getName());

clock.setCost(20000);
System.out.println(clock.getCost());

clock.setMinutes(15);
System.out.println(clock.getMinutes());

clock.setSecond(10);
System.out.println(clock.getSecond());

clock.setHours(4);
System.out.println(clock.getHours());
}
}