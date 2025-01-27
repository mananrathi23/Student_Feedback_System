package ProjectNew.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "Course")
public class courseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String Positive ;
    @Column(name = "negative")
    private String negatives ;
    @Column(name = "rating")
    private int rating;
    @Column(name = "relavant")
    private String relavant;
    @Column(name = "objective")
    private String objective;
    @Column(name = "method")
    private String method;
    @Column(name = "Pace")
    private String pace;
    @Column(name = "comments")
    private String comments;

    public courseModel(String positive, String negatives, int rating, String relavant, String objective, String method, String comments, String pace) {
        Positive = positive;
        this.negatives = negatives;
        this.rating = rating;
        this.relavant = relavant;
        this.objective = objective;
        this.method = method;
        this.comments = comments;
        this.pace = pace;
    }

    public courseModel() {}

    public String getPositive() {
        return Positive;
    }

    public int getRating() {
        return rating;
    }

    public String getNegatives() {
        return negatives;
    }

    public String getRelavant() {
        return relavant;
    }

    public String getObjective() {
        return objective;
    }

    public String getMethod() {
        return method;
    }

    public String getPace() {
        return pace;
    }

    public String getComments() {
        return comments;
    }

    public void setPositive(String positive) {
        Positive = positive;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public void setRelavant(String relavant) {
        this.relavant = relavant;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setNegatives(String negatives) {
        this.negatives = negatives;
    }
}
