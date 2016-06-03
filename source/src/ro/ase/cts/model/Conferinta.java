package ro.ase.cts.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Andreea-Ionescu on 6/1/2016.
 */
public class Conferinta implements Comparable{
    String denumire;
    double pret;
    Date data;
    String confCategorie;

    public Conferinta(String denumire, double pret, Date data, String confCategorie) {
        this.denumire = denumire;
        this.pret = pret;
        this.data = data;
        this.confCategorie = confCategorie;
    }


    public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getConfCategorie() {
		return confCategorie;
	}

	public void setConfCategorie(String confCategorie) {
		this.confCategorie = confCategorie;
	}
	
	public Conferinta(){
		
	}

	@Override
	public String toString() {
		return "Conferinta [denumire=" + denumire + ", pret=" + pret + ", data=" + data + ", confCategorie="
				+ confCategorie + "]";
	}

	//gaseste Conferinta in BD dupa Id
    public Conferinta getConferintaById(int id)
    {
    	Conferinta conf = null;
    	
    	Connection connection = null;
    	PreparedStatement preparedStatement = null;
    	ResultSet resultSet = null;
    	
    	try {
    		connection = SingletonDBConnection.getInstance();
        	String sql = "Select * from CONFERINTE where idConferinta= ?;";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				conf = new Conferinta(
						resultSet.getString("numeConf"),
						resultSet.getDouble("pretConf"),
						resultSet.getDate("dataConf"),
						resultSet.getString("categorieConf"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			DBUtil.close(resultSet);
			DBUtil.close(preparedStatement);
			DBUtil.close(connection);
		}
    	
    	
    	return conf;
    }

    public boolean dataConferintaValida(Date azi){
    	azi = new Date();
    	if(this.data.getYear()>=azi.getYear()){
    		if (this.data.getMonth()>=azi.getMonth()){
    			if(this.data.getDay()>=azi.getDay())
    				return true;
    		}
    	}
		return false;
    }
    
	@Override
	public int compareTo(Object o) {
		Conferinta c = (Conferinta) o;
		if(this.denumire.equals(c.getDenumire())
				&& this.pret == c.getPret()
				&& this.confCategorie.equals(c.getConfCategorie())){
			return 0;
		}
		return 1;
	}
    
    
}
