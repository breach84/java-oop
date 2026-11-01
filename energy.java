import java.util.Scanner;

abstract class energy{
    int sid;
    String sname;
    energy(int sid, String sname){
        this.sid = sid;
        this.sname = sname;
    }
    abstract void totalenergygen();
}

class solarenergy extends energy{
    float eg;
    solarenergy(int sid, String sname, float eg){
        super(sid,sname);
        this.eg = eg;
    }
    @Override 
    void totalenergygen(){
        float teg;
        teg = (eg/5000)*100;
        System.out.println("total energy generated: " + teg + "%");
    }
}

class windenergy extends energy{
    float eg;
    windenergy(int sid, String sname, float eg){
        super(sid,sname);
        this.eg = eg;
    }
    @Override 
    void totalenergygen(){
        float teg;
        teg = (eg/8000)*100;
        System.out.println("total energy generated: " + teg + "%");
    }
}

class erun{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("which energy dawg \n1.solar\n2.wind");
        int y = x.nextInt();
        float z;
        switch(y){
            case 1:
                System.out.println("whats the energy generated?\n");
                z = x.nextFloat();
                energy b = new solarenergy(234, "freedom park", z);
                b.totalenergygen();
                break;
            case 2:
                System.out.println("whats the energy generated?\n");
                z = x.nextFloat();
                energy c = new windenergy(236, "lal bagh", z);
                c.totalenergygen();
                break;
        }
        System.out.println("neerva negi 1BF25CS167");
    }
}
