package com.example.note;

public class Item_Object {
	private String tittle, clas, desc;

	public Item_Object(String titulo, String clas, String desc){
		//this.mIndex = index;
		this.tittle = titulo;
		this.clas = clas;
		this.desc = desc;
	}

	public void setTitulo(String titulo){
		this.tittle = titulo;
	}
	
	public void setClasif(String clasi){
		this.clas = clasi;
	}
	public void setDescrip(String descrip){
		this.desc = descrip;
	}
	public String getTitulo(){
		return tittle;
	}
	public String getClasi(){
		return clas;
	}
	public String getDescrip(){
		return desc;
	}
	
	//public String toString() {
	  //  return this.tittle + ". " + this.clas + " [$" + this.desc + "]";
	//}
}