package br.inatel.cdg.inimigo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		List<Inimigo> inimigos = new ArrayList<Inimigo>();

		inimigos.add(new Inimigo("Black Night", 100));
		inimigos.add(new Inimigo("Black Night", 200));
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json = gson.toJson(inimigos);

		FileWriter writer;
		try {
			writer = new FileWriter("inimigos.json");
			writer.write(json);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
