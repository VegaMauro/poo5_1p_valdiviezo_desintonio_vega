public enum usuario {
  AUTOR("Datos"),
  EDITOR("Datos"),
	REVISOR("Datos"); 
	
	private String datos;
	
	private usuario (String datos){
		this.datos = datos;
	}

	public String getNombreClub() {
		return datos;
	}

}
