package Command;
/**
 * 命令模式
 * 实现命令的条条管理
 * 可以进行命令的创建和执行
 * @author Administrator
 *
 */
public class ShoppingCommand extends Command {

	@Override
	public void execute() {
		System.out.println("購物");

	}

	@Override
	public void unDo() {
		// TODO Auto-generated method stub
		System.out.println("購物后退");
	}

}
