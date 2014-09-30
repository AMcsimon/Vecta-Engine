package com.aguywithacomputer.vecta.test;

import com.aguywithacomputer.vecta.VectaConfig;

public class Main
{
	public static void main(String[] args)
	{
		VectaConfig cfg = new VectaConfig();
		cfg.setTitle("Vecta Test Application");
		new MyApplication(cfg);
	}
}
