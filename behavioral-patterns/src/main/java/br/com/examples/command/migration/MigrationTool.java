package br.com.examples.command.migration;

import br.com.examples.command.migration.commands.MigrationCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Cria e percorre listas de migrations, executando/desfazendo uma migration por vez ou
 * todas de uma vez.
 */
public class MigrationTool {
	private List<MigrationCommand> migrations;
	private int nextMigrationIndex;

	public MigrationTool() {
		migrations = new ArrayList<MigrationCommand>();
		nextMigrationIndex = 0;
	}
	
	public void addMigration(MigrationCommand migration) {
		migrations.add(migration);
	}

	/**
	 * Evolui o banco para a próxima versão (ou seja, executa a próxima migration da lista).
	 */
	public void up() {
		if(migrations.size() > nextMigrationIndex) {
			migrations.get(nextMigrationIndex).execute();
			nextMigrationIndex++;
		} else {
			System.out.println("You are up to date!");
		}
	}

	/**
	 * Retrocede o banco para a versão anterior (ou seja, desfaz a última migration feita).
	 */
	public void down() {
		if(nextMigrationIndex > 0) {
			migrations.get(nextMigrationIndex - 1).undo();
			nextMigrationIndex--;
		} else {
			System.out.println("You don't have migrations left");
		}
	}

	/**
	 * Executa todas as migrations ainda não executadas para trazer o banco para a última versão.
	 */
	public void latest() {
		while(nextMigrationIndex < migrations.size()) up();
	}

	/**
	 * Reverte todas as migrations executadas para trazer o banco de volta para a versão mais antiga
	 * de todas.
	 */
	public void roolback() {
		while(nextMigrationIndex != 0) down();
	}

}
