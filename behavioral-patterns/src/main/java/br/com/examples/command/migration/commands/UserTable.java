package br.com.examples.command.migration.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Implementa a adição reversível da tabela User no banco de dados.
 */
public class UserTable extends MigrationCommand {
	
	public UserTable(Map<String, List<String>> database) {
		super(database);
	}

	@Override
	public void execute() {
		List<String> columns = new ArrayList<String>(Arrays.asList("Id", "Name", "Email", "Password"));
		database.put("User", columns);
	}

	@Override
	public void undo() {
		database.remove("User");
	}

}
