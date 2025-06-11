public class distributePens {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int penPerPerson = pens / students;
        int remainingPens = pens % students;

        System.out.println("The Pen Per Student is " + penPerPerson + " and the remaining pen not distributed is " + remainingPens);
    }
}
