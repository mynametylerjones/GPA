import java.math.RoundingMode;
import java.text.DecimalFormat;
public class NewCalculator
{
    private static int number;
    private static double gpa;
    private static DecimalFormat df = new DecimalFormat("0.00");
    public static void main()
    {
        for(int i = 1; i < 8; i++)
        {
            System.out.println("Lets start your " + i + " class.");
            System.out.println("Is this class weighted or not?");
            String weight = UserInput.getString();

            System.out.println("What is your percent grade in the class?");
            //int grade = UserInput.getInt();
            int grade = Integer.parseInt(UserInput.getString());
            if(weight.indexOf("Yes") > -1)
            {
                if(grade == 100)
                {
                    gpa += 4.83;
                }
                else if(grade == 99)
                {
                    gpa += 4.83;
                }
                else if(grade == 98)
                {
                    gpa += 4.83;
                }
                else if(grade == 97)
                {
                    gpa += 4.83;
                }
                else if(grade == 96)
                {
                    gpa += 4.83;
                }
                else if(grade == 95)
                {
                    gpa += 4.83;
                }
                else if(grade == 94)
                {
                    gpa += 4.50;
                }
                else if(grade == 93)
                {
                    gpa += 4.50;
                }
                else if(grade == 92)
                {
                    gpa += 4.17;
                }
                else if(grade == 91)
                {
                    gpa += 4.17;
                }
                else if(grade == 90)
                {
                    gpa += 4.17;
                }
                else if(grade == 89)
                {
                    gpa += 3.83;
                }
                else if(grade == 88)
                {
                    gpa += 3.83;
                }
                else if(grade == 87)
                {
                    gpa += 3.83;
                }
                else if(grade == 86)
                {
                    gpa += 3.50;
                }
                else if(grade == 85)
                {
                    gpa += 3.50;
                }
                else if(grade == 84)
                {
                    gpa += 3.50;
                }
                else if(grade == 83)
                {
                    gpa += 3.50;
                }
                else if(grade == 82)
                {
                    gpa += 3.17;
                }
                else if(grade == 81)
                {
                    gpa += 3.17;
                }
                else if(grade == 80)
                {
                    gpa += 3.17;
                }
                else if(grade == 79)
                {
                    gpa += 2.83;
                }
                else if(grade == 78)
                {
                    gpa += 2.83;
                }
                else if(grade == 77)
                {
                    gpa += 2.83;
                }
                else if(grade == 76)
                {
                    gpa += 2.50;
                }
                else if(grade == 75)
                {
                    gpa += 2.50;
                }
                else if(grade == 74)
                {
                    gpa += 2.50;
                }
                else if(grade == 73)
                {
                    gpa += 2.50;
                }
                else if(grade == 72)
                {
                    gpa += 2.17;
                }
                else if(grade == 71)
                {
                    gpa += 2.17;
                }
                else if(grade == 70)
                {
                    gpa += 2.17;
                }
                else if(grade == 69)
                {
                    gpa += 1.83;
                }
                else if(grade == 68)
                {
                    gpa += 1.83;
                }
                else if(grade == 67)
                {
                    gpa += 1.83;
                }
                else if(grade == 66)
                {
                    gpa += 1.50;
                }
                else if(grade == 65)
                {
                    gpa += 1.50;
                }
                else if(grade == 64)
                {
                    gpa += 1.50;
                }
                else if(grade == 63)
                {
                    gpa += 1.50;
                }
                else if(grade == 62)
                {
                    gpa += 1.17;
                }
                else if(grade == 61)
                {
                    gpa += 1.17;
                }
                else if(grade == 60)
                {
                    gpa += 1.17;
                }
                else
                {
                    gpa += 0.50;
                }
            }
            else if(weight.indexOf("No") > -1)
            {
                if(grade == 100)
                {
                    gpa += 4.33;
                }
                else if(grade == 99)
                {
                    gpa += 4.33;
                }
                else if(grade == 98)
                {
                    gpa += 4.33;
                }
                else if(grade == 97)
                {
                    gpa += 4.33;
                }
                else if(grade == 96)
                {
                    gpa += 4.33;
                }
                else if(grade == 95)
                {
                    gpa += 4.33;
                }
                else if(grade == 94)
                {
                    gpa += 4.00;
                }
                else if(grade == 93)
                {
                    gpa += 4.00;
                }
                else if(grade == 92)
                {
                    gpa += 3.67;
                }
                else if(grade == 91)
                {
                    gpa += 3.67;
                }
                else if(grade == 90)
                {
                    gpa += 3.67;
                }
                else if(grade == 89)
                {
                    gpa += 3.33;
                }
                else if(grade == 88)
                {
                    gpa += 3.33;
                }
                else if(grade == 87)
                {
                    gpa += 3.33;
                }
                else if(grade == 86)
                {
                    gpa += 3.50;
                }
                else if(grade == 85)
                {
                    gpa += 3.50;
                }
                else if(grade == 84)
                {
                    gpa += 3.00;
                }
                else if(grade == 83)
                {
                    gpa += 3.00;
                }
                else if(grade == 82)
                {
                    gpa += 2.67;
                }
                else if(grade == 81)
                {
                    gpa += 2.67;
                }
                else if(grade == 80)
                {
                    gpa += 2.67;
                }
                else if(grade == 79)
                {
                    gpa += 2.83;
                }
                else if(grade == 78)
                {
                    gpa += 2.33;
                }
                else if(grade == 77)
                {
                    gpa += 2.33;
                }
                else if(grade == 76)
                {
                    gpa += 2.00;
                }
                else if(grade == 75)
                {
                    gpa += 2.00;
                }
                else if(grade == 74)
                {
                    gpa += 2.00;
                }
                else if(grade == 73)
                {
                    gpa += 2.00;
                }
                else if(grade == 72)
                {
                    gpa += 1.67;
                }
                else if(grade == 71)
                {
                    gpa += 1.67;
                }
                else if(grade == 70)
                {
                    gpa += 1.67;
                }
                else if(grade == 69)
                {
                    gpa += 1.33;
                }
                else if(grade == 68)
                {
                    gpa += 1.33;
                }
                else if(grade == 67)
                {
                    gpa += 1.33;
                }
                else if(grade == 66)
                {
                    gpa += 1.00;
                }
                else if(grade == 65)
                {
                    gpa += 1.00;
                }
                else if(grade == 64)
                {
                    gpa += 1.00;
                }
                else if(grade == 63)
                {
                    gpa += 1.00;
                }
                else if(grade == 62)
                {
                    gpa += 0.67;
                }
                else if(grade == 61)
                {
                    gpa += 0.67;
                }
                else if(grade == 60)
                {
                    gpa += 0.67;
                }
                else
                {
                    gpa += 0.00;
                }
            }
            //System.out.println(df.format(gpa/i));
        }
        System.out.println("This is your overal GPA: " + df.format(gpa/7));
    }
}