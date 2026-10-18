package br.com.examples.command.migration.commands;

import java.util.List;
import java.util.Map;

/**
 * Implementa a adição reversível da coluna Role na tabela User do banco de dados.
 */
public class UserTableRoleColumn extends MigrationCommand {
	
	public UserTableRoleColumn(Map<String, List<String>> database) {
		super(database);
	}

	@Override
	public void execute() {
		List<String> columns = database.get("User");
		columns.add("Role");
	}

	@Override
	public void undo() {
		List<String> columns = database.get("User");
		columns.remove("Role");
	}

}
