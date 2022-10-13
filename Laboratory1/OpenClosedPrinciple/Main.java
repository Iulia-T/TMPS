package Laboratory1.OpenClosedPrinciple;

public class Main {

    public static void main(String args[])
    {
        Cuboid_2 cb1 = new Cuboid_2();
        cb1.length = 5;
        cb1.breadth = 10;
        cb1.height = 15;

        Cuboid_2 cb2 = new Cuboid_2();
        cb2.length = 2;
        cb2.breadth = 4;
        cb2.height = 6;
 
        Cuboid_2 cb3 = new Cuboid_2();
        cb3.length = 3;
        cb3.breadth = 12;
        cb3.height = 15;

        Sphere_2 sp1 = new Sphere_2();
        sp1.radius = 5;

        Sphere_2 sp2 = new Sphere_2();
        sp2.radius = 2;
 
        Sphere_2 sp3 = new Sphere_2();
        sp3.radius = 3;

        Geo_objects[] g_arr = new Geo_objects[6];
 
        g_arr[0] = cb1;
        g_arr[1] = cb2;
        g_arr[2] = cb3;
 
        g_arr[3] = sp1;
        g_arr[4] = sp2;
        g_arr[5] = sp3;

        Application app = new Application();
         
        double vol = app.get_total_volume(g_arr);
 
        System.out.println("The total volume is " + vol);
    }
}
