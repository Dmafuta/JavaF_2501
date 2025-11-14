package sess05_arrays_and_strings;

public class SingleDimArray {
    // main method begins program execution
    public static void main(String[] args)
    {
        // byte array to hold the user's rating of a product
        byte userRating[] = {4,3,5,4,3,2,5,4,3,5,3,5,4};
        // integer variable to hold the total of all ratings given
        int totalRating = 0;
        // looping variable
        int n = 0;
        // float variable to hold the mean/avg. rating
        float meanRating;

        // use a for loop to calculate the total rating
        for(; n < userRating.length; n++)
            totalRating += userRating[n];

        //calculate the mean/avg. rating
        meanRating = totalRating / (float)userRating.length;

        System.out.println("All the product ratings are: ");
        // use a for...each loop to display all ratings
        for (byte curRating : userRating)
        {
            System.out.printf("%d,", curRating);
        }
        System.out.println("---"); // fictitious lines
        // Display the total rating and mean rating
        System.out.printf("The total rating is %d and the mean rating ia %.2f " + "out of 5.\n",totalRating,meanRating);
    }
}
