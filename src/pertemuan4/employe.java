package pertemuan4;

public class employe extends person {
    private String id_emp;

    public employe(String n, String a, String id_emp) {
        super(n, a);
        this.id_emp = id_emp;
    }

    public String getId_emp() {
        return id_emp;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }


}
