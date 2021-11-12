package at.campus02.murko.CoronaManagment;

import java.text.DateFormat;
import java.util.Objects;

public class Incidence {

    private String state;
    private DateFormat date;
    private int number;

    public Incidence(String state, DateFormat date, int number) {
        this.state = state;
        this.date = date;
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public DateFormat getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incidence incidence = (Incidence) o;
        return Objects.equals(state, incidence.state) && Objects.equals(date, incidence.date);
    }
//eigene Klassen verwalten ->
    @Override
    public int hashCode() {
        return Objects.hash(state, date);
    }

    @Override
    public String toString() {
        return "Incidence{" +
                "state='" + state + '\'' +
                ", date=" + date +
                ", number=" + number +
                '}';
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
