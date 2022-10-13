package Laboratory1.OpenClosedPrinciple;

class Cuboid_2 extends Geo_objects {
 
    public double length;
    public double breadth;
    public double height;

    // @Override
    public double get_volume()
    {
        return length * breadth * height;
    }
}
