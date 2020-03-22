/****************************************************************************
 *
 * Created by: Teddy Sannan
 * Created on: March 2020
 * Created for: ICS4U
 * This program creates an enum of the planets and displays their position
 * from the sun
 *
 ****************************************************************************/

public enum EnumPlanets
{
    // Stores all the planets, and the number of planets between them and the sun
    MERCURY(0),
    VENUS(1),
    EARTH(2),
    MARS(3),
    JUPITER(4),
    SATURN(5),
    URANUS(6),
    NEPTUNE(7);

    private final int position;
    private EnumPlanets(int position)
    {
        this.position = position;
    }

    public static void main(String[] arg)
    {
        // Displays the planets and their distance from sun
        for(EnumPlanets planet: EnumPlanets.values())
        {
            System.out.println(planet+" is " + planet.position + " planet(s) away from the sun.");
        }
    }
}