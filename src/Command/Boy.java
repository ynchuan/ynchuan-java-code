package Command;

import java.util.LinkedList;
import java.util.List;

public class Boy {
	private String name;
	private List<Command> commands = new LinkedList<Command>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pursue(MM m) {

	}

	public void doSomeThing() {

	}

	public void addCommand(Command c) {
		commands.add(c);
	}

	/**
	 * Ö´ĞĞÃüÁî
	 */
	public void executeCommand() {
		for (Command c : commands) {
			c.execute();
		}
	}

	/**
	 * ÃüÁîºóÍË
	 */
	public void unDoCommand() {
		for (Command c : commands) {
			c.unDo();
		}
	}

}
