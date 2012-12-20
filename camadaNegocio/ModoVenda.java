package camadaNegocio ;

public abstract class ModoVenda {
    
    // v. i.
    private int id ;
    
    // construtor
    public ModoVenda(int id) {
        this.id = id;
    }
    
    
    // get e set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // e, tS
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModoVenda other = (ModoVenda) obj;
        if (this.id != other.getId()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ModoVenda{" + "id=" + this.id + '}';
    }
    
    
    
    
}