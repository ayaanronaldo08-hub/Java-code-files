public class wonders {
    public static void main(String[] args) {
        seven_wonders obj = new seven_wonders();
        seven_wonders gwc = new GWC();
        seven_wonders petra = new Petra();
        seven_wonders col = new Col();
        seven_wonders CI = new CI();
        seven_wonders MP = new MP();
        seven_wonders Taj = new Taj();
        seven_wonders CR = new CR();

        obj.location();
        obj.info();

        gwc.location();
        gwc.info();

        petra.location();
        petra.info();

        col.location();
        col.info();

        CI.location();
        CI.info();

        MP.location();
        MP.info();

        Taj.location();
        Taj.info();

        CR.location();
        CR.info();
    }
}

class seven_wonders{
public void location(){
    System.out.println("Location: ");
}
public void info(){
    System.out.println("Info: ");
}
}

class GWC extends seven_wonders{
public void location(){
    System.out.println("China");
}
public void info(){
    System.out.println("A massive defensive fortification built, rebuilt, and maintained across northern China from the 5th century BC to the 16th century.");
}
}

class Petra extends seven_wonders{
public void location(){
    System.out.println("Jordan");
}
public void info(){
    System.out.println(" An ancient city famously carved directly into vibrant red and pink sandstone rock faces by the Nabataeans over 2,000 years ago.");
}
}

class Col extends seven_wonders{
public void location(){
    System.out.println("Jordan");
}
public void info(){
    System.out.println(" An iconic oval amphitheater built in the first century AD, capable of seating up to 50,000 spectators for gladiatorial contests");
}
}

class CI extends seven_wonders{
public void location(){
    System.out.println("Mexico");
}
public void info(){
    System.out.println(" A brilliant Mayan city featuring the stepped pyramid of El Castillo, known for its intricate astronomical alignments.");
}
}

class MP extends seven_wonders{
public void location(){
    System.out.println("Peru");
}
public void info(){
    System.out.println(" A stunning 15th-century Incan citadel situated on a high mountain ridge in the Andes.");
}
}

class Taj extends seven_wonders{
public void location(){
    System.out.println("India");
}
public void info(){
    System.out.println("  A breathtaking white marble mausoleum commissioned by Mughal Emperor Shah Jahan in the 1630s in memory of his wife.");
}
}

class CR extends seven_wonders{
public void location(){
    System.out.println("Brazil");
}
public void info(){
    System.out.println(" A colossal Art Deco statue of Jesus Christ atop Corcovado mountain, standing 98 feet tall with arms stretched wide.");
}
}
