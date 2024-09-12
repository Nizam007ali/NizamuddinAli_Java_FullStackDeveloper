package git;

abstract class Rgpv {

    public abstract void cctv();

    public abstract void lab();

    public void examCopyCheck() {
        System.out.println("This is RGPV Copy CHeck method");
    }
    
}

class abstractionCollege extends Rgpv {

    public void cctv() {
        System.out.println("This is RGPV RULE CCTV Method");
    }

    public void lab() {
        System.out.println("This is RGPV RULE lab Method");
    }

    public void midsem() {
        System.out.println("This is COllege class method");
    }

    public static void main(String args[]) {
        Rgpv r = new abstractionCollege();
        r.examCopyCheck();
        r.lab();
        r.cctv();
//r.midsem();
        abstractionCollege c = new abstractionCollege();
        c.examCopyCheck();
        c.lab();
        c.cctv();
        c.midsem();
    }
}
