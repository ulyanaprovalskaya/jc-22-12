package by.itacademy.lecture10.comparable;

import java.util.Objects;

public class Owner {

    private String firstName;
    private String lastName;
    private int experience;

    public Owner(String firstName, String lastName, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) o;
        return experience == owner.experience &&
                Objects.equals(firstName, owner.firstName) &&
                Objects.equals(lastName, owner.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, experience);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Owner{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", experience=").append(experience);
        sb.append('}');
        return sb.toString();
    }
}
