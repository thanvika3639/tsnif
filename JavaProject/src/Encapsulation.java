class Car 
{
    private String brand;
    private int speed;

    public void setBrand(String b) 
    {
        brand = b;
    }

    public String getBrand() 
    {
        return brand;
    }

    public void setSpeed(int s) 
    {
        if (s >= 0) 
        {
            speed = s;
        } else 
        {
            System.out.println("Speed cannot be negative!");
        }
    }

    public int getSpeed() 
    {
        return speed;
    }
}

public class Encapsulation 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        
        c.setBrand("Tesla");
        c.setSpeed(120);

        System.out.println("Car Brand: " + c.getBrand());
        System.out.println("Car Speed: " + c.getSpeed() + " km/h");
    }
}
