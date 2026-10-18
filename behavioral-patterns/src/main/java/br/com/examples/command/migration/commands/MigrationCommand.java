package br.com.examples.command.migration.commands;

import java.util.List;
import java.util.Map;

/**
 * Aqui temos uma classe abstrata para comandos reversíveis. Cada classe que herdar dessa classe terá que
 * implementar os métodos execute() e undo(), fazendo e desfazendo as alterações, respectivamente.
 */
public abstract class MigrationCommand {
	/**
	 * Representação super simplificada de um banco de dados, para não adicionar muita complexidade
	 * ao exemplo. Neste Map, a key é o nome da tabela e os values são os nomes das colunas.
	 */
	protected Map<String, List<String>> database;
	
	public MigrationCommand(Map<String, List<String>> database) {
		this.database = database;
	}
	
	public abstract void execute();
	public abstract void undo();
}
