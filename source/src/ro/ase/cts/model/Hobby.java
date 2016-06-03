package ro.ase.cts.model;


/**
 * Created by Andreea-Ionescu on 5/31/2016.
 */
public class Hobby implements Comparable {
    private int idHobby;
    private String nameHobby;
    private TipHobby tipHobby;


    public Hobby(int idHobby, String nameHobby, TipHobby tipHobby) {
		super();
		this.idHobby = idHobby;
		this.nameHobby = nameHobby;
		this.tipHobby = tipHobby;
	}

	public int getIdHobby() {
        return idHobby;
    }

    public void setIdHobby(int idHobby) {
        this.idHobby = idHobby;
    }

    public String getNameHobby() {
        return nameHobby;
    }

    public void setNameHobby(String nameHobby) {
        this.nameHobby = nameHobby;
    }

    public TipHobby getTipHobby() {
        return tipHobby;
    }

    public void setTipHobby(TipHobby tipHobby) {
        this.tipHobby = tipHobby;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "idHobby=" + idHobby +
                ", nameHobby='" + nameHobby + '\'' +
                ", tipHobby=" + tipHobby +
                '}';
    }

	@Override
	public int compareTo(Object o) {
		Hobby h = (Hobby) o;
		if(this.idHobby == h.idHobby){
			return 0;
		}
		else
			return 1;
	}
	

}
