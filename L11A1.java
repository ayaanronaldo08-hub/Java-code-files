class Hillstations{
    public void location(){
        System.out.println("Location: ");
    }

    public void famous(){
        System.out.println("Famous for: ");
    }
}

class Manali extends Hillstations{
    public void location(){
        System.out.println("Manali is in Himachal Pradesh");
    }

    public void famous(){
        System.out.println("It is famous for adventure sports");
    }
}

class Mussoorie extends Hillstations{
    public void location(){
        System.out.println("Mussorie is in Uttarakhand");
    }

    public void famous(){
        System.out.println("It is famous for education");
    }
}

class Gulmarg extends Hillstations{
    public void location(){
        System.out.println("Gulmarg is in J&K");
    }

    public void famous(){
        System.out.println("Skiing");
    }
}

public class L11A1 {
    public static void main(String[] args) {
        Hillstations A = new Hillstations();
        Hillstations Ma = new Manali();
        Hillstations Mu = new Mussoorie();
        Hillstations G = new Gulmarg();

        A.location();
        A.famous();
        
        Ma.location();
        Ma.famous();

        Mu.location();
        Mu.famous();

        G.location();
        G.famous();
    }
}
