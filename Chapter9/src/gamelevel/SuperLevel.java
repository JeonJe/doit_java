package gamelevel;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("��û���� �޸��ϴ�");

	}

	@Override
	public void jump() {
		System.out.println("��û ���� �ݴϴ�.");

	}

	@Override
	public void turn() {
		System.out.println("���ϴ� �������� �ٲߴϴ�");

	}

	@Override
	public void showLevelMessage() {
		System.out.println("***���� ����***");

	}
}