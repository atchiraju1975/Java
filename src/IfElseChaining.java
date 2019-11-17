public class IfElseChaining {

    public static void main(String[] args){

        int testMarks = 34;
        char gradeLetter;

        if (testMarks > 90)
        {
            gradeLetter = 'D';
            System.out.println("you have achieved distinction , your grade is : " + gradeLetter);

        }
        else
        {
            if (testMarks > 60)
            {
                gradeLetter = 'A';
                System.out.println("you have achieved firstclass , your grade is : " + gradeLetter);

            }
            else
            {
                if (testMarks > 50)
                {
                    gradeLetter = 'B';
                    System.out.println("you have achieved secondclass , your grade is : " + gradeLetter);

                }
                else
                {
                    if (testMarks > 35)
                    {
                        gradeLetter = 'C';
                        System.out.println("you have achieved thirdclass , your grade is : " + gradeLetter);

                    }
                    else
                    {
                        gradeLetter = 'F';
                        System.out.println("you have failed , your grade is : " + gradeLetter);

                    }
                }
            }
        }

    }

}
