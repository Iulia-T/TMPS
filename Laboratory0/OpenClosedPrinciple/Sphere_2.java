package Laboratory0.OpenClosedPrinciple;

class Sphere_2 extends Geo_objects {
     
    public double radius;
 
    //@Override
    public double get_volume()
    {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }
}
