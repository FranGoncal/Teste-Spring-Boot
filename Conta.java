package com.example.demo;

public class Conta {
	private long id;
	private String titular;
	private String morada;
	private long nif;
	private long pin;
	private double saldo;

	public Conta(long id1, String alexandre, String casteloBranco, int i, int i1, double v) {
		id = id1;
		titular = alexandre;
		morada = casteloBranco;
		nif = i;
		pin= i1;
		saldo= v;
	}

	// Getters
	public long getId() {
		return id;
	}

	public String getTitular() {
		return titular;
	}

	public String getMorada() {
		return morada;
	}

	public long getNif() {
		return nif;
	}

	public long getPin() {
		return pin;
	}

	public double getSaldo() {
		return saldo;
	}
}
