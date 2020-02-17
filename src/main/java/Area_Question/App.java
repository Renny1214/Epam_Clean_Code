package Area_Question;

import java.util.Scanner;

public class App
{
    public static Scanner obj = new Scanner(System.in);
    public static String getMaterial()
    {
        System.out.println("choose from type of materials : ");
        TypeOfMaterials[] typeofmaterials = TypeOfMaterials.values();
        for(TypeOfMaterials t : typeofmaterials)
        {
            System.out.println(t);
        }
        System.out.println("Enter :");
        String material = obj.next();
        return material;
    }
    public static void main( String[] args )
    {
        double area;
        String material;
        boolean automation = false;

        System.out.println("enter the area : ");
        area = obj.nextDouble();
        material = getMaterial();

        if(material.toLowerCase().equals(TypeOfMaterials.highStandardMaterials.toString().toLowerCase()))
        {
            System.out.println("is there automation :(yes/no)");
            automation = obj.nextBoolean();
        }

        Calculate calculate  = new Calculate();
        try{
            System.out.println(calculate.getInterest(area,material,automation));
        }
        catch(InvalidMaterialSelect e)
        {
            System.err.println(e);
        }
    }
}
