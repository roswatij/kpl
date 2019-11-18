package org.if_unpas.kpl.ContohVersioning;

import java.util.ArrayList;
import java.util.List;

public class Tim {
	private String nama;
	private List<Pemain> pemaintInti = new ArrayList<Pemain>();
	
	public Tim() {
		nama = "";
	}

	public Tim(String nama) {
		this.nama = nama;
	}

}
