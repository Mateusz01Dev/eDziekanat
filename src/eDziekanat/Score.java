package eDziekanat;

public class Score {

    public double rating;
    public String short_rating;
    public String normal_rating;

    public static void main(String[] args){

        Score score1 = new Score();

        score1.rating = 4.0;
        score1.short_rating = "db";
        score1.normal_rating = "dobry";

        Score score2 = new Score();

        score2.rating = 4.5;
        score2.short_rating = "db+";
        score2.normal_rating = "dobry plus";

        Score score3= new Score();

        score3.rating = 5.0;
        score3.short_rating = "bdb";
        score3.normal_rating = "bardzo dobry";

        System.out.println(score1.rating + ", " + score1.short_rating + ", " + score1.normal_rating);










    }
}

