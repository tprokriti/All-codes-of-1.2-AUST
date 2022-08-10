package movie;

import movieexception.*;

public class Eligibility {

    public void checkAge(int age, String ratings) throws NotApplicableForChildrenException {

        if (age < 18 && "R".equals(ratings)) {
            throw new NotApplicableForChildrenException("Not applicable for people under 18");
        } else if (age < 15 && "M".equals(ratings)) {
            throw new NotApplicableForChildrenException("Not applicable for kids under 15");
        } else if (age < 18 && "G".equals(ratings) || "PG".equals(ratings)) {
            System.out.println("applicable for kids");
        }
    }
}
