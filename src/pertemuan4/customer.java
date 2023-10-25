package pertemuan4;

//class turunan / warisan dari class warisan --> subclass
public class customer extends person {
    private String id;
    //    constructor

    public customer(String n, String a, String id) {
        super(n, a);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    //overriding method

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }


}
