public class restaurant {
    public static void main(String[] args) {
        singleTable t1 = new singleTable(74, 4, 60);
        singleTable t2 = new singleTable(74, 8, 70);
        singleTable t3 = new singleTable(76, 12, 75);

        combinedTable c1 = new combinedTable(t1, t2);
        System.out.println("Can seat 9: " + c1.canSeat(9));
        System.out.println("Can seat 11: " + c1.canSeat(11));
        System.out.println("Get desirability: " + c1.getDesirability());

        combinedTable c2 = new combinedTable(t2, t3);
        System.out.println("Can seat 18: " + c2.canSeat(18));
        System.out.println("Get desirability: " + c2.getDesirability());
        t2.setView(80);
        System.out.println("Get desirability: " + c2.getDesirability());
    }
}

class singleTable{
    private double height;
    private int numSeats;
    private double view;

    public singleTable(double height, int numSeats, double view){
        this.height = height;
        this.numSeats = numSeats;
        this.view = view;
    }

    public double getHeight(){
        return height;
    }

    public int getSeats(){
        return numSeats;
    }

    public double getView(){
        return view;
    }

    public void setView(double num){
        view = num;
    }
}

class combinedTable{
    private singleTable table1;
    private singleTable table2;
    private double view;
    private int seats;

    public combinedTable(singleTable table1, singleTable table2){
        this.table1 = table1;
        this.table2 = table2;
        this.seats = (table1.getSeats() + table2.getSeats() - 2);
    }

    public double getDesirability(){
        if (table1.getHeight() == table2.getHeight()){
            view = ((table1.getView() + table2.getView())/2);
        } else {
            view = (((table1.getView() + table2.getView())/2) - 10);
        }

        return view;
    }

    public boolean canSeat(int num){
        if (num > seats){
            return false;
        } else {
            return true;
        }
    }
}
