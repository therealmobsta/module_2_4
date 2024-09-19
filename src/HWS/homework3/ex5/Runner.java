package HWS.homework3.ex5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Review> reviews = new ArrayList<>();
        reviews.add(new Review(1, "отличный товар", 200,
                LocalDateTime.of(2024, 1, 25, 13, 37)));

        reviews.add(new Review(2, "так себе товар", 100,
                LocalDateTime.of(2024, 1, 25, 16, 37)));

        reviews.add(new Review(4, "плохой товар", 100,
                LocalDateTime.of(2024, 1, 25, 13, 37)));

        reviews.add(new Review(3, "плохой товар", 100,
                LocalDateTime.of(2024, 1, 25, 13, 37)));

        Comparator<Review> reviewComparator = Comparator
                .comparingInt(Review::getLikes)
                .thenComparing(Review::getDateTime)
                .thenComparingInt(Review::getId);

        reviews.sort(reviewComparator);

        for (Review review : reviews) {
            System.out.println(review);
        }
    }
}